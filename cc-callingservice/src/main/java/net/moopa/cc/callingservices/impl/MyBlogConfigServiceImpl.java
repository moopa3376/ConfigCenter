package net.moopa.cc.callingservices.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import net.moopa.cc.callingservices.services.MyBlogConfigService;

/**
 * @autuor Moopa
 * @date 13/09/2017.
 * blog: moopa.net
 */
public class MyBlogConfigServiceImpl implements MyBlogConfigService {

	private Map<String,String> configs = new ConcurrentHashMap<String, String>();

	public MyBlogConfigServiceImpl(){
		configs.put("MY_BLOG_NAME","moopa");
	}

	public String getMyBlogConfig(String key, String defaultValue){
		String result = null;
		result = getConfig(key);

		if(result == null){
			result = defaultValue;
		}

		return result;
	}

	private String getConfig(String key){
		return configs.get(key);
	}
}
