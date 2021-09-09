package com.example.feign.connection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.feign.entity.Endereco;




@FeignClient(name = "endereco", url = "https://viacep.com.br/ws")
public interface FeignConnection {

	@RequestMapping(method = RequestMethod.GET, value = "/{cep}/json")
	Endereco retornaEndereco(@PathVariable String cep);
	
	
}
