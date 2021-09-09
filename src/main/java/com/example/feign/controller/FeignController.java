package com.example.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feign.connection.FeignConnection;
import com.example.feign.entity.Endereco;

@RestController
@RequestMapping("cep/json")
public class FeignController {

	@Autowired
	FeignConnection feignConnection;
	
	@GetMapping
	public Endereco retornaEndereco() {
		
		return feignConnection.retornaEndereco();
		
	}
	
	
	
}
