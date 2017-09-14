package net.moopa3376.cc.callingservices.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import net.moopa3376.cc.callingservices.services.ConfigService;

/**
 * @autuor Moopa
 * @date 13/09/2017.
 * blog: moopa.net
 */
public class ConfigServiceImpl implements ConfigService {

	private Map<String,Map<String,String>> configs = new HashMap<String, Map<String, String>>();

	public ConfigServiceImpl(){
		putConfig("MY_BLOG","MY_BLOG_NAME","moopa");
	}

	public String getConfig(String projectName, String key, String defaultValue){
		String result = null;
		result = getConfig(projectName,key);

		if(result == null){
			result = defaultValue;
		}

		return result;
	}

	private String getConfig(String projectName, String key){
		return configs.get(projectName).get(key);
	}

	private void putConfig(String projectName, String key, String value){
		if(configs.get(projectName) == null){
			synchronized (configs){
				if(configs.get(projectName) == null){
					configs.put(projectName,new ConcurrentHashMap<String, String>());
				}
			}
		}

		configs.get(projectName).put(key,value);
	}
}
