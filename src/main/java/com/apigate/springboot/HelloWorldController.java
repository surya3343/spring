package com.apigate.springboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController


public class HelloWorldController
{
@RequestMapping("/")
public ResponseEntity sendViaResponseEntity() {
    return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
}
// public String hello()
// {
// return "Hello springboot";
// }
}
