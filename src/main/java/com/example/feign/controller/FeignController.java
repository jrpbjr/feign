package com.example.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feign.connection.FeignConnection;
import com.example.feign.entity.Endereco;

@RestController
@RequestMapping("/api")
public class FeignController {

	@Autowired
	FeignConnection feignConnection;
	
	@GetMapping("/get/{cep}")
	public Endereco retornaEndereco(@PathVariable String cep) {
		System.out.println("printando " + cep);
		return feignConnection.retornaEndereco(cep);
		
	}
	
	
	
}
