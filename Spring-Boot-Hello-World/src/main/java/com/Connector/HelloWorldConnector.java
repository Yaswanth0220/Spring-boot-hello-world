package com.codacum.SpringBootHelloWorld.Connector;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldConnector {
	@RequestMapping("/Test")
	public String HelloWorld(){
	return "Hello World";
	}
}
