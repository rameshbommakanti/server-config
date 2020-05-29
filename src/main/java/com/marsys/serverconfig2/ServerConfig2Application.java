package com.marsys.serverconfig2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServerConfig2Application {

	public static void main(String[] args) {
		SpringApplication.run(ServerConfig2Application.class, args);
	}

}
