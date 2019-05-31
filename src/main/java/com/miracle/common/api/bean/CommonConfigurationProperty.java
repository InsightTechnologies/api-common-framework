package com.miracle.common.api.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "masterbot")
public class CommonConfigurationProperty {

	private ThreadPoolConfigurationProperty threadPoolConfig;
	private RestTemplateConfigurationProperty restTemplateConfig;

	public ThreadPoolConfigurationProperty getThreadPoolConfig() {
		return threadPoolConfig;
	}

	public void setThreadPoolConfig(ThreadPoolConfigurationProperty threadPoolConfig) {
		this.threadPoolConfig = threadPoolConfig;
	}

	public RestTemplateConfigurationProperty getRestTemplateConfig() {
		return restTemplateConfig;
	}

	public void setRestTemplateConfig(RestTemplateConfigurationProperty restTemplateConfig) {
		this.restTemplateConfig = restTemplateConfig;
	}

	public static class ThreadPoolConfigurationProperty {
		private int corePoolSize;
		private int maxPoolSize;

		public int getCorePoolSize() {
			return corePoolSize;
		}

		public void setCorePoolSize(int corePoolSize) {
			this.corePoolSize = corePoolSize;
		}

		public int getMaxPoolSize() {
			return maxPoolSize;
		}

		public void setMaxPoolSize(int maxPoolSize) {
			this.maxPoolSize = maxPoolSize;
		}

	}

	public static class RestTemplateConfigurationProperty {
		private int maxTotal;
		private int defaultMaxPerRoute;
		private int validateAfterInactivity;
		private int connectTimeout;
		private int connectionRequestTimeout;
		private int socketTimeout;

		public int getMaxTotal() {
			return maxTotal;
		}

		public void setMaxTotal(int maxTotal) {
			this.maxTotal = maxTotal;
		}

		public int getDefaultMaxPerRoute() {
			return defaultMaxPerRoute;
		}

		public void setDefaultMaxPerRoute(int defaultMaxPerRoute) {
			this.defaultMaxPerRoute = defaultMaxPerRoute;
		}

		public int getValidateAfterInactivity() {
			return validateAfterInactivity;
		}

		public void setValidateAfterInactivity(int validateAfterInactivity) {
			this.validateAfterInactivity = validateAfterInactivity;
		}

		public int getConnectTimeout() {
			return connectTimeout;
		}

		public void setConnectTimeout(int connectTimeout) {
			this.connectTimeout = connectTimeout;
		}

		public int getConnectionRequestTimeout() {
			return connectionRequestTimeout;
		}

		public void setConnectionRequestTimeout(int connectionRequestTimeout) {
			this.connectionRequestTimeout = connectionRequestTimeout;
		}

		public int getSocketTimeout() {
			return socketTimeout;
		}

		public void setSocketTimeout(int socketTimeout) {
			this.socketTimeout = socketTimeout;
		}
	}

}
