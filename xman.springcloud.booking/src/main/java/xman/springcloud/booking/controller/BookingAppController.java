package xman.springcloud.booking.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookingAppController {
	@GetMapping("/hello")
	public String sayHello(String name) {
		if (name != null) {
			return "Hello " + name;
		} else {
			return "Hello guest";
		}

	}

	@GetMapping("/getBookOrderList")
	private List<String> getBookOrderList(String customerId) {
		List<String> orderList = new ArrayList<String>();
		orderList.add("O00001");
		orderList.add("O00002");
		return orderList;
	}
}
