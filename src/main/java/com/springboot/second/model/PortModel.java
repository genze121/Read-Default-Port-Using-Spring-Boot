package com.springboot.second.model;

import org.springframework.stereotype.Component;

@Component
public class PortModel {

	private String name;
	private String address;
	private int portId;

	public PortModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PortModel(String name, String address, int portId) {
		super();
		this.name = name;
		this.address = address;
		this.portId = portId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPortId() {
		return portId;
	}

	public void setPortId(int portId) {
		this.portId = portId;
	}

	@Override
	public String toString() {
		return "PortModel [name=" + name + ", address=" + address + ", portId=" + portId + "]";
	}

}
