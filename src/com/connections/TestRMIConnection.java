package com.connections;

import java.rmi.Naming;
import java.rmi.Remote;

/**
 * 
 * @author ricardo.nunes
 * @see https://ycj28c.github.io/language/2017/11/10/java-rmi-test/
 */
public class TestRMIConnection {

	private static final String RMI_SERVER_URL = "rmi://<server_port>:<rmi_port>/RMI_SERVICE";

	public static void main(String args[]) throws Exception {

		try {
			System.out.println("Connecting to " + RMI_SERVER_URL);

			long beginTime = System.currentTimeMillis();
			Remote service = (Remote) Naming.lookup(RMI_SERVER_URL);
			long endTime = System.currentTimeMillis();

			System.out.println("End printing response");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("The test complete");
	}
}