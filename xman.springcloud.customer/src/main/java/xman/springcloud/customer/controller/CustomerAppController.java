package xman.springcloud.customer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xman.springcloud.customer.bean.BookOrder;
import xman.springcloud.customer.bean.Customer;
import xman.springcloud.customer.service.BookOrderService;

@RestController
@RequestMapping("/customer")
public class CustomerAppController {
	@Autowired
	private BookOrderService bookOrderService;

	@GetMapping("/hello")
	public String sayHello(String name) {
		if (name != null) {
			return "Hello " + name;
		} else {
			return "Hello guest";
		}
	}

	@GetMapping("/getAllCusotmer")
	public List<Customer> getAllCusotmer() {
		List<Customer> list = new ArrayList<Customer>();
		Customer c1 = new Customer();
		c1.setAddress("NanJing China");
		c1.setAge(20);
		c1.setName("Jeff Wang");
		list.add(c1);

		Customer c2 = new Customer();
		c2.setAddress("ShangHai China");
		c2.setAge(40);
		c2.setName("Felix Liang");
		list.add(c2);

		return list;
	}

	@GetMapping("/getCusotmerBookOrder")
	public List<BookOrder> getCusotmerBookOrder(String customerId) {

		List<String> orderList = bookOrderService.getCustomerBookOrderList(customerId);
		List<BookOrder> list = new ArrayList<BookOrder>();
		for (String bookId : orderList) {
			BookOrder order = new BookOrder();
			order.setBookId(bookId);
			order.setCustomerId(customerId);
			list.add(order);
		}
		return list;
	}

}
