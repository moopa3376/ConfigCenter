package net.moopa.cc.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @autuor Moopa
 * @date 13/09/2017.
 * blog: moopa.net
 */
public class CcClientConfigs {

	private static HashMap<String,String> configs = new HashMap<String,String>();
	private static Logger logger = LoggerFactory.getLogger(CcClientConfigs.class);

	static {
		Properties properties = PropertiesUtil.getProperties("cc-client.properties");


		for(Map.Entry<Object,Object> e :properties.entrySet()){
			put(properties,e.getKey().toString());
		}
	}

	public static String get(String key,String defaults){
		String v = configs.get(key);
		return v == null ? defaults : v;
	}

	private static void put(Properties properties,String key){
		Object o1 = properties.get(key);
		if(o1 == null){
			return;
		}
		configs.put(key,o1.toString().trim());
	}
}
