package com.example.feign.connection;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "endereco", url = "httpd://viacep.com.br/ws/")
public interface FeignConnection {

}
