package net.moopa.cc.server;

import net.leeautumn.servicesrv.CallingServiceServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @autuor Moopa
 * @date 02/09/2017.
 * blog: moopa.net
 */
public class ConfigCenterServer {
	public static Logger logger = LoggerFactory.getLogger(ConfigCenterServer.class);

	public static void main(String[] args){
		CallingServiceServer callingServiceServer = new CallingServiceServer();
		logger.info("ConfigCenterServer starts, using calling RPC framework.");
		callingServiceServer.run();
	}
}
