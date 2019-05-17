package com.miracle.exception;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;

@Component
public class GatewayServiceException extends Exception {
	private static final long serialVersionUID = -816387637206481014L;
	private static final String NUll_PONTER_EXCEPTION_CODE = "MSB.TE.NUL.000";
	private static final String UNKNOWN_EXCEPTION_CODE = "MSB.UN.EXP.000";
	private static final String UNKNOWN_GATEWAY_EXCEPTION_CODE = "MSB.UN.EXP.001";
	private static final String JSON_PARSE_EXCEPTION_CODE="MSB.TE.PRS.000";
	private static final String RUN_TIME_EXCEPTION_CODE = "MSB.RE.000";
	private static final HttpStatus DEFAULT_STATUS_CODE  = HttpStatus.BAD_REQUEST;
	
	private String errorCode;
	private HttpStatus statusCode;
	
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public HttpStatus getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}

	public GatewayServiceException() {
		super();
	}

	/**
	 * @param message
	 */
	public GatewayServiceException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public GatewayServiceException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public GatewayServiceException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * 
	 * @param message
	 * @param cause
	 * @param errorCode
	 */
	public GatewayServiceException(String message, Throwable cause,String errorCode) {
		super(message, cause);
		setErrorCode(errorCode);
	}
	
	/**
	 * 
	 * @param message
	 * @param cause
	 * @param errorCode
	 */
	public GatewayServiceException(String message, Throwable cause,String errorCode,HttpStatus statusCode) {
		super(message, cause);
		setErrorCode(errorCode);
		setStatusCode(statusCode);
	}
	
	/**
	 * 
	 * @param message
	 * @param errorCode
	 */
	public GatewayServiceException(String message, String errorCode) {
		super(message);
		setErrorCode(errorCode);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public GatewayServiceException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Gets the error code.
	 *
	 * @param throwable
	 *            the throwable
	 * @return string -return custom error code of exception
	 */

	public String getErrorCode(Throwable throwable,
			APIExceptionResponse apiExceptionResponse) {
		Throwable exception = (ExceptionUtils.getRootCause(throwable) == null) ? throwable
				: ExceptionUtils.getRootCause(throwable);
		String errorCode;
		if (exception instanceof NullPointerException) {
			errorCode = NUll_PONTER_EXCEPTION_CODE;
			apiExceptionResponse.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR);
		} 
		else if (exception instanceof JsonParseException) {
			 errorCode = JSON_PARSE_EXCEPTION_CODE;
		} 
		else if (exception instanceof RuntimeException) {
				 errorCode = RUN_TIME_EXCEPTION_CODE;
		} 
		else if (exception instanceof GatewayServiceException) {
			GatewayServiceException gatewayServiceException = (GatewayServiceException) exception;
			if(gatewayServiceException.getErrorCode() != null && !gatewayServiceException.getErrorCode().isEmpty()){
				errorCode = gatewayServiceException.getErrorCode();
			}else {
				errorCode = UNKNOWN_GATEWAY_EXCEPTION_CODE;
			}
			if(gatewayServiceException.getStatusCode().value() > 0){
				apiExceptionResponse.setStatusCode(gatewayServiceException.getStatusCode());
			}else {
				apiExceptionResponse.setStatusCode(DEFAULT_STATUS_CODE);
			}
			
		} 
		
		else {
			errorCode = UNKNOWN_EXCEPTION_CODE;
		}
		return errorCode;
	}
	
}
