package net.moopa3376.cc.common.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import net.moopa3376.cc.common.utils.PropertiesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @autuor Moopa
 * @date 13/09/2017.
 * blog: moopa.net
 */
public class ConfigCenterConfigs {

	private static HashMap<String,String> configs = new HashMap<String,String>();
	private static Logger logger = LoggerFactory.getLogger(ConfigCenterConfigs.class);

	static {
		Properties properties = PropertiesUtil.getProperties("cc-config.properties");


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
