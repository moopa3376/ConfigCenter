package net.moopa.cc.callingservices.services;

/**
 * @autuor Moopa
 * @date 13/09/2017.
 * blog: moopa.net
 */
public interface ConfigService {
	public String getConfig(String projectName, String key, String defaultValue);
}
