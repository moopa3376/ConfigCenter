package net.moopa.cc.client;

import java.net.InetAddress;
import java.net.UnknownHostException;

import net.moopa.calling.client.ClientFactory;
import net.moopa.cc.callingservices.impl.ConfigServiceImpl;
import net.moopa.cc.callingservices.services.ConfigService;

/**
 * @autuor Moopa
 * @date 13/09/2017.
 * blog: moopa.net
 */
public class DemoClient {

	public static void main(String[] args) throws UnknownHostException {
		ConfigService configService = ClientFactory.newClient(ConfigServiceImpl.class, InetAddress.getByName(CcClientConfigs.get("cc-server.address",null)),Integer.parseInt(CcClientConfigs.get("cc-server.port",null)));
		String s = configService.getConfig("MY_BLOG","MY_BLOG_NAME",null);
		System.out.println(s == null);
		System.out.println(s);
	}
}
