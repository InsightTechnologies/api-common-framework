package com.miracle.common.controller;

import java.net.URI;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import com.miracle.api.service.utils.CommonUtil;
import com.miracle.common.api.bean.CommonConfigurationProperty;
import com.miracle.exception.APIFrameworkException;
import com.miracle.utility.DataUtility;

@Controller
public abstract class APIMicroService {

	@Value("${masterbot.loadBalence_URL_Prefix}")
	protected String loadBalence_URLPrefix;

	@Value("${masterbot.retryCount}")
	protected String retryCount;
	@Value("${masterbot.maxDelayTimeInSec}")
	protected String maxDelayTimeInSec;
	@Autowired
	private CommonConfigurationProperty property;
	@Autowired
	protected CommonUtil commonUtil;
	@Autowired
	private DataUtility dataUtility;
//	protected MongoDBUtility mongoDBUtility;
	/**
	 *
	 * 
	 * 
	 * masterbot.retrieveReleaseFeaturesEndpoint:/masterBot/project/retrieveReleaseFeatures
	 * 
	 * @param builder
	 * @return
	 */
//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//	   // Do any additional configuration here
//	   return builder.build();
//	}

	/**
	 * Configure the RestTemplate object
	 * 
	 * @return the restTemplate that will be used to hit the microservice
	 */
	@RefreshScope
	@Bean
	public RestTemplate restTemplate() {

		/**
		 * setMaxTotal The maximum number of connections allowed across all routes.
		 * 
		 * setDefaultMaxPerRoute The maximum number of connections allowed for a route
		 * that has not been specified otherwise by a call to setMaxPerRoute. Use
		 * setMaxPerRoute when you know the route ahead of time and
		 * setDefaultMaxPerRoute when you do not.
		 * 
		 * setConnectTimeout How long to wait for a connection to be established with
		 * the remote server before throwing a timeout exception.
		 * 
		 * setSocketTimeout How long to wait for the server to respond to various calls
		 * before throwing a timeout exception. See
		 * http://docs.oracle.com/javase/1.5l.0/docs/api/java/net/SocketOptions.html#SO_TIMEOUT
		 * for details.
		 * 
		 * setConnectionRequestTimeout How long to wait when trying to checkout a
		 * connection from the connection pool before throwing an exception (the
		 * connection pool won't return immediately if, for example, all the connections
		 * are checked out).
		 * 
		 * setStaleConnectionCheckEnabled Can be disabled for a slight performance
		 * improvement at the cost of potential IOExceptions. See
		 * http://hc.apache.org/httpclient-3.x/performance.html#Stale_connection_check
		 * 
		 */

		PoolingHttpClientConnectionManager poolingHttpClientConnectionManager = new PoolingHttpClientConnectionManager();
		poolingHttpClientConnectionManager.setMaxTotal(this.property.getRestTemplateConfig().getMaxTotal());
		poolingHttpClientConnectionManager
				.setDefaultMaxPerRoute(this.property.getRestTemplateConfig().getDefaultMaxPerRoute());
		poolingHttpClientConnectionManager
				.setValidateAfterInactivity(this.property.getRestTemplateConfig().getValidateAfterInactivity());
		/**
		 * 
		 * the setConnectTimeout – the time to establish the connection with the remote
		 * host
		 * 
		 * the setSocketTimeout – the time waiting for data – after the connection was
		 * established; maximum time of inactivity between two data packets
		 * 
		 * the setConnectionRequestTimeout – the time to wait for a connection from the
		 * connection manager/pool
		 * 
		 */
		final RequestConfig config = RequestConfig.custom()
				.setConnectTimeout(this.property.getRestTemplateConfig().getConnectTimeout() * 1000)
				.setConnectionRequestTimeout(this.property.getRestTemplateConfig().getConnectionRequestTimeout() * 1000)
				.setSocketTimeout(this.property.getRestTemplateConfig().getSocketTimeout() * 1000).build();

		CloseableHttpClient httpClient = HttpClientBuilder.create()
				.setConnectionManager(poolingHttpClientConnectionManager).evictExpiredConnections()
				.setDefaultRequestConfig(config).setRetryHandler(new DefaultHttpRequestRetryHandler(3, true)).build();

		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient) {
			@Override
			protected HttpContext createHttpContext(HttpMethod httpMethod, URI uri) {
				HttpClientContext context = new HttpClientContext();
				context.setAttribute("http.protocol.expect-continue", false);
				context.setAttribute(HttpClientContext.REQUEST_CONFIG, config);
				return context;
			}
		};
		RestTemplate restTemplate = new RestTemplate();
		BufferingClientHttpRequestFactory bufferingClientHttpRequestFactory = new BufferingClientHttpRequestFactory(
				requestFactory);
		restTemplate.setRequestFactory(bufferingClientHttpRequestFactory);
		// restTemplate.setErrorHandler(new JournalValidatorResttemplateErrorHandler());
		return restTemplate;
	}

	public String getIceScrumURLPrefix() throws APIFrameworkException {
		return dataUtility.getScrumList().get(0).getApiEndpoint();
	}

}
