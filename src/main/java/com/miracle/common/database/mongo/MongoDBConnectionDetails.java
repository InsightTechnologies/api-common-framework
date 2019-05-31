package com.miracle.common.database.mongo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "masterbot.mongodb")
public class MongoDBConnectionDetails {
private String userName;
private String password;
private String hostname;
private int port;
private boolean sslIndicator;
private String database;
/**
 * @return the userName
 */
public String getUserName() {
	return userName;
}
/**
 * @param userName the userName to set
 */
public void setUserName(String userName) {
	this.userName = userName;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
/**
 * @return the hostname
 */
public String getHostname() {
	return hostname;
}
/**
 * @param hostname the hostname to set
 */
public void setHostname(String hostname) {
	this.hostname = hostname;
}
/**
 * @return the port
 */
public int getPort() {
	return port;
}
/**
 * @param port the port to set
 */
public void setPort(int port) {
	this.port = port;
}
/**
 * @return the sslIndicator
 */
public boolean isSslIndicator() {
	return sslIndicator;
}
/**
 * @param sslIndicator the sslIndicator to set
 */
public void setSslIndicator(boolean sslIndicator) {
	this.sslIndicator = sslIndicator;
}
/**
 * @return the database
 */
public String getDatabase() {
	return database;
}
/**
 * @param database the database to set
 */
public void setDatabase(String database) {
	this.database = database;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "MongoDBConnectionDetails [userName=" + userName + ", password=" + password + ", hostname=" + hostname
			+ ", port=" + port + ", sslIndicator=" + sslIndicator + ", database=" + database + "]";
}

}
