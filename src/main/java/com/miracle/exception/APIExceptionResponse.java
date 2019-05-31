package com.miracle.exception;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
@Component
public class APIExceptionResponse {
	private Instant timestamp;
	private String errorCode;
	private String errorDescription;
	private StringBuffer uri;
	private StackTraceElement stackTraceElement;
	private String completeTrace;
	private HttpStatus statusCode;
	
	public Instant getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorDescription() {
		return errorDescription;
	}
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
	public StringBuffer getUri() {
		return uri;
	}
	public void setUri(StringBuffer uri) {
		this.uri = uri;
	}
	public StackTraceElement getStackTraceElement() {
		return stackTraceElement;
	}
	public void setStackTraceElement(StackTraceElement stackTraceElement) {
		this.stackTraceElement = stackTraceElement;
	}
	public String getCompleteTrace() {
		return completeTrace;
	}
	public void setCompleteTrace(String completeTrace) {
		this.completeTrace = completeTrace;
	}
	public HttpStatus getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}
	@Override
	public String toString() {
		return "APIExceptionResponse [timestamp=" + timestamp + ", errorCode="
				+ errorCode + ", errorDescription=" + errorDescription
				+ ", uri=" + uri + ", stackTraceElement=" + stackTraceElement
				+ ", completeTrace=" + completeTrace + ", statusCode="
				+ statusCode + "]";
	}
	
}
