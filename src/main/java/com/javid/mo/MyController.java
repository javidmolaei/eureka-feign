package com.javid.mo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Javid Molaei
 */

@RestController
public class MyController {

    private final ExampleClient exampleClient;

    @Autowired
    public MyController(ExampleClient exampleClient) {
        this.exampleClient = exampleClient;
    }

    @GetMapping("/example")
    public ResponseEntity<List<String>> getExampleData() {
        return exampleClient.getExampleData();
    }

}
