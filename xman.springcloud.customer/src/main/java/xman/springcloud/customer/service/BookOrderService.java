package xman.springcloud.customer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookOrderService {

	@Autowired
	private RestTemplate restTemplate;

	public List<String> getCustomerBookOrderList(String customerId) {
		List<String> orderList = new ArrayList<String>();
		try {
			orderList.add("O00001");
			orderList.add("O00002");
			orderList = restTemplate.getForObject("http://service-book/book/getBookOrderList", List.class);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return orderList;
	}
}
