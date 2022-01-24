package com.example.demo.model;

import com.opencsv.bean.CsvBindByPosition;

public class Host {
	@CsvBindByPosition(position = 0)
	private String serviceName;
	@CsvBindByPosition(position = 1)
	private String environment;
	@CsvBindByPosition(position = 2)
	private String hostName;
	@CsvBindByPosition(position = 3)
	private String active;

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

}
