package net.moopa.cc.client;

import java.net.InetAddress;
import java.net.UnknownHostException;

import net.leeautumn.client.ClientFactory;
import net.moopa.cc.callingservices.impl.MyBlogConfigServiceImpl;
import net.moopa.cc.callingservices.services.MyBlogConfigService;

/**
 * @autuor Moopa
 * @date 13/09/2017.
 * blog: moopa.net
 */
public class DemoClient {

	public static void main(String[] args) throws UnknownHostException {
		MyBlogConfigService myBlogConfigService = ClientFactory.newClient(MyBlogConfigServiceImpl.class, InetAddress.getByName(CcClientConfigs.get("cc-server.address",null)),Integer.parseInt(CcClientConfigs.get("cc-server.port",null)));
		String s = myBlogConfigService.getMyBlogConfig("MY_BLOG_NAME",null);
		System.out.println(s == null);
		System.out.println(s);
	}
}
