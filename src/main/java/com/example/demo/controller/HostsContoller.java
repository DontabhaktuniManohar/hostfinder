package com.example.demo.controller;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Host;
import com.example.demo.service.HostsService;

@RestController
public class HostsContoller {

	@Autowired
	private HostsService hostsService;

	@GetMapping("/hostfinder/hosts")
	public List<Host> getHostNames() throws IllegalStateException, FileNotFoundException {
		return hostsService.getAllHosts();
	}

	@GetMapping("/hostfinder/hosts/{serviceName}/{env}")
	public List<String> getHostNames(@PathVariable("serviceName") String serviceName, @PathVariable("env") String env)
			throws IllegalStateException, FileNotFoundException {
		return hostsService.getActiveServiceHostsByEnv(serviceName, env, "TRUE");
	}
}
