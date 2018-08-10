package xman.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/configclient")
@RestController
public class ConfigClientController {

	@Value("${appDesc}") // git配置文件里的key
	String appDesc;

	@GetMapping("/hi")
	public String hi() {
		return appDesc;
	}

	@GetMapping("/getDesc")
	public String getDesc() {
		return appDesc;
	}

}