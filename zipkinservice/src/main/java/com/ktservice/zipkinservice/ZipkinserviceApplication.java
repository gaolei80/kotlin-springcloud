package com.ktservice.zipkinservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class ZipkinserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinserviceApplication.class, args);
	}
}
