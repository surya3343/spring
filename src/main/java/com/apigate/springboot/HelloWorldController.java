package com.apigate.springboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RestController
@Timed

public class HelloWorldController
{
@RequestMapping("/")
public String hello()
{
return "Hello springboot";
}
}
