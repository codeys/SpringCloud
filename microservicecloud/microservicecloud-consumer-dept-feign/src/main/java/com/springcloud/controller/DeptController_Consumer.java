package com.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springcloud.entities.Dept;
import com.springcloud.service.DeptClientService;

@RestController
public class DeptController_Consumer {
	
	//private static final String REST_URL_PREFIX = "http://localhost:8001";
	//private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
	
	@Autowired
	private DeptClientService service;

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/consumer/dept/add")
	public boolean add(Dept dept) {
		return service.add(dept);
	}
	
	@RequestMapping("/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return service.get(id);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/consumer/dept/list")
	public List<Dept> list() {
		return service.list();
	}
	
}
