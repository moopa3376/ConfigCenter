package net.moopa3376.cc.client;

import java.net.InetAddress;
import java.net.UnknownHostException;

import net.moopa3376.calling.client.ClientFactory;
import net.moopa3376.cc.callingservices.impl.ConfigServiceImpl;
import net.moopa3376.cc.callingservices.services.ConfigService;

/**
 * @autuor Moopa
 * @date 14/09/2017.
 * blog: moopa.net
 */
public class ConfigFactory {

	public static synchronized ConfigService getConfigProxy(){
		ConfigService configService = null;
		try {
			configService = ClientFactory.newClient(ConfigServiceImpl.class, InetAddress.getByName(CcClientConfigs.get("cc-server.address",null)),Integer.parseInt(CcClientConfigs.get("cc-server.port",null)));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return configService;
	}
}
