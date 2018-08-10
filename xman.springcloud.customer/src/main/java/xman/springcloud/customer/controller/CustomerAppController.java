package xman.springcloud.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerAppController {
	@GetMapping("/hello")
	public String sayHello(String name) {
		if (name != null) {
			return "Hello " + name;
		} else {
			return "Hello guest";
		}

	}
}