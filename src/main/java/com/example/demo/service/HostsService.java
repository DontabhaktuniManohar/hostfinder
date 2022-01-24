package com.example.demo.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.example.demo.model.Host;
import com.opencsv.bean.CsvToBeanBuilder;

@Service
public class HostsService {

	File file = new File("hosts.csv");

	public List<Host> getAllHosts() throws IllegalStateException, FileNotFoundException {
		return readHostsData();
	}

	public List<String> getActiveServiceHostsByEnv(String serviceName, String env, String acitveFlag)
			throws FileNotFoundException {
		List<Host> hosts = readHostsData();
		return hosts.stream().filter(host -> {
			return host.getServiceName().equalsIgnoreCase(serviceName) && host.getEnvironment().equalsIgnoreCase(env)
					&& host.getActive().equalsIgnoreCase(acitveFlag);
		}).map(Host::getHostName).collect(Collectors.toList());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private List<Host> readHostsData() throws FileNotFoundException {
		List<Host> beans = new CsvToBeanBuilder(new FileReader(file)).withType(Host.class).build().parse();
		return beans;
	}

}
