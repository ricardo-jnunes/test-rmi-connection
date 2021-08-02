package com.connections;

import java.rmi.Naming;

/**
 * 
 * @author ricardo.nunes
 * @see https://ycj28c.github.io/language/2017/11/10/java-rmi-test/
 */
public class TestRMIConnection {

	private static final String RMI_SERVER_URL = "rmi://as1980:15061/RMI_SERVE";
	   
	public static void main(String args[]) throws Exception {	
		
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }

        try {
            System.out.println("Connecting to " + RMI_SERVER_URL);
            
            long beginTime = System.currentTimeMillis();
            ExampleService service = (ExampleService) Naming.lookup(RMI_SERVER_URL);
            long endTime = System.currentTimeMillis();

            System.out.println("end printing response"); 
        }
        catch (Exception e) {
            //logger.error("Exception occured: " + e + " - " + RMI_SERVER_URL);
            //logger.error(e);
            e.printStackTrace();
        }
        System.out.println("The test complete");
    }
}