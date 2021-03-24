package com.sample.docker.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class DockerController {

	@GetMapping
	public String hello() {
		return "Hello Banibrata, Welcome to docker world with Azure Web app";
	}
}
