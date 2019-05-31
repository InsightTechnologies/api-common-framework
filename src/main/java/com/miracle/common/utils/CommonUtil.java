package com.miracle.common.utils;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanComparator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.miracle.common.database.mongo.MongoDBUtility;
import com.miracle.exception.GatewayServiceException;

@Component
public class CommonUtil {
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	MongoDBUtility mongoDBUtility;
	@Value("${masterbot.retryCount}")
	public String retryCount;
	@Value("${masterbot.maxDelayTimeInSec}")
	public String maxDelayTimeInSec;

	public static final Logger logger = LoggerFactory.getLogger(CommonUtil.class);
	private static String EMPTY_LSIT = "MSB.COM.EML.000";
	
	public Map<String, String> getHeaderDetails()throws GatewayServiceException {
		Map<String, String> headerDetails = null;
		try
		{
			headerDetails = mongoDBUtility.getScrumHeaderDetails();
		}catch (Exception exception) {
			throw new GatewayServiceException(exception.getMessage(),exception);
		}
		return headerDetails;
	}

	public List<MediaType> getAcceptableMediaTypes() {
		List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
		MediaType applicationJson = new MediaType("application", "json", StandardCharsets.UTF_8);
		acceptableMediaTypes.add(applicationJson);
		return acceptableMediaTypes;
	}
	
	

	/**
	 * 
	 * @param url
	 * @param headerDetails
	 * @param acceptableMediaTypes
	 * @return
	 * @throws Exception
	 */
	public String getDetails(String url, Map<String, String> headerDetails, List<MediaType> acceptableMediaTypes)
			throws Exception {
		String response = "";
		StringBuilder exceptionMessage = new StringBuilder("");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(acceptableMediaTypes);
		for (Map.Entry<String, String> entry : headerDetails.entrySet()) {
			headers.set(entry.getKey(), entry.getValue());
		}
		// MediaType.APPLICATION_JSON
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<String> responseEntity = null;
		int count = 0;
		// iterate till max retry count is meet or the call is successful
		while (count < Integer.parseInt(retryCount)) {
			try {

				responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
				if (responseEntity.getStatusCode() == HttpStatus.OK) {
					response = responseEntity.getBody();
					logger.info("Successfully invoked " + url);
					break;
				} else {
					// Append exception to the exception message
					exceptionMessage.append("Getting exception while hit  " + url + " ,Retry Count :: " + count
							+ " , Status Code :: " + responseEntity.getStatusCode() + ", Exception Description ::"
							+ responseEntity.toString() + "\r\n");
					logger.error("Getting exception while hit  " + url + " ,Retry Count :: " + count
							+ " , Status Code :: " + responseEntity.getStatusCode() + ", Exception Description ::"
							+ responseEntity.toString());
					// wait for the configured time
					Thread.sleep(1000 * Long.parseLong(maxDelayTimeInSec));
					count++;
				}

			} catch (Exception exception) {
				try {
					// Append exception to the exception message
					exceptionMessage.append("Getting exception while hit  " + url + " ,Retry Count :: " + count
							+ ", Exception Description ::" + exception.getMessage() + "\r\n");
					logger.error("Getting exception while hit  " + url + " ,Retry Count :: " + count
							+ " , Exception Description :: " + exception.getMessage());
					// wait for the configured time
					Thread.sleep(1000 * Long.parseLong(maxDelayTimeInSec));
					count++;

				} catch (InterruptedException interruptedException) {

					logger.error("Getting exception while hit  " + url + " ,Retry Count :: " + count
							+ ", Exception Description ::" + interruptedException.getMessage());
					throw new GatewayServiceException("Getting exception while hit  " + url + " ,Retry Count :: " + count
							+ ", Exception Description ::" + interruptedException.getMessage() + "\r\n",interruptedException);
				}
			}
		}
		// after the max retries count is meet and still the response is not
		// received
		// through an exception
		if (response == null) {
			logger.error("Getting exception while hit  " + url + " , Exception Description :: "
					+ exceptionMessage.toString());
			throw new GatewayServiceException("Getting exception while hit  " + url + " , Exception Description :: "
					+ exceptionMessage.toString());

		}

		return response;
	}
	
	/**
	 * Description - method to sort beans according to given property
	 * 
	 * @param beanList
	 *            - List of beans
	 * @param propertyToSortWith
	 *            - String property name to sort the beanList.
	 */
	public static void sortBeans(List<?> beanList, String propertyToSortWith)throws GatewayServiceException {
		// null check against the given bean List
		if (beanList != null && beanList.size() >0) {
			// create a comparator
			Comparator<Object> propertyToCompareComparator = new BeanComparator<Object>(propertyToSortWith);
			// sort the beans according to the given properties value
			Collections.sort(beanList, propertyToCompareComparator);
			Collections.reverse(beanList);
		}else {
			logger.error("Providied bean list is empty");
			throw new GatewayServiceException("Providied bean list is empty",EMPTY_LSIT);
		}
	}
}
