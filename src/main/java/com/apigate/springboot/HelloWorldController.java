package com.apigate.springboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
@RestController


public class HelloWorldController
{
@RequestMapping("/")
public ResponseEntity sendViaResponseEntity() {
    return new ResponseEntity(HttpStatus.SERVICE_UNAVAILABLE);
}
// public String hello()
// {
// return "Hello springboot";
// }
}
