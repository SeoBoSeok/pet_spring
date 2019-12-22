package kr.co.vetgate.pet.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController // RestAPI용 method handler
public class HellloWorldController {
	@GetMapping(value="/api/helloworld") // Get Method handler등록
	public String helloWorld() {
		return "HELLO WORLD";
	}
}
