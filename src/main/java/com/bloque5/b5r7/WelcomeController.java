package com.bloque5.b5r7;

import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @Value("${application.message:Hola Mundo}")
	private String helloMessage;

	@GetMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", helloMessage);
		return "welcome";
	}
}
