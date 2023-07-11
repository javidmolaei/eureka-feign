package com.javid.mo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@FeignClient(name = "car", url = "http://localhost:9001")
@FeignClient(name = "car")
public interface ExampleClient {

    @GetMapping("/cars")
    ResponseEntity<List<String>> getExampleData();

}
