package com.oci.wade.demo.bootrest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class HomeController {
	@GetMapping(value = "/{name}")
	public ResponseEntity<String> getGreeting(@PathVariable("name") String name) {
		return ResponseEntity.ok().body("Hello " + name);
	}
}
