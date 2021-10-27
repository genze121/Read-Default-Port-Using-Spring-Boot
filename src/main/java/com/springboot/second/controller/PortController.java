package com.springboot.second.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.second.model.PortModel;

@RestController
@RequestMapping("api/v1")
public class PortController {

	@Autowired
	private PortModel portModel;

	@Autowired
	private WebServerApplicationContext server;

	@Value("${name}")
	private String name;

	@Value("${address}")
	private String address;

	@GetMapping("/portdetails")
	public PortModel getDetails() {
		portModel.setName(name);
		portModel.setAddress(address);
		portModel.setPortId(server.getWebServer().getPort());
		System.out.println(portModel);
		return portModel;
	}

}
