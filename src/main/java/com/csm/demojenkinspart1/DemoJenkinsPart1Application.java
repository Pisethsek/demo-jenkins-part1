package com.csm.demojenkinspart1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class DemoJenkinsPart1Application {


    public static void main(String[] args) {
        SpringApplication.run(DemoJenkinsPart1Application.class, args);
    }

    @GetMapping("/hello")
    public ResponseEntity<?> sayHi() {
        var res = new HashMap<String, String>();
        res.put("msg", "Hello From Jenkins");
        return ResponseEntity.ok(res);
    }
}
