package com.somi.mcp_client_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class McpClientDemoApplication {

	public static void main(String[] args) {

		System.out.println(System.getenv("PATH"));
		System.out.println(System.getenv("JAVA_HOME"));
		System.out.println("###########");
		SpringApplication.run(McpClientDemoApplication.class, args);
	}

}
