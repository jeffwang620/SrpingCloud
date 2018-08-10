package xman.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Configclient")
@RestController
public class ConfigClientController {

	@Value("${appDesc}") // git配置文件里的key
	String appDesc;

	@Value("${spring.cloud.test.testName}")
	String appName;

	@Value("staticvalue")
	String staticValue;

	@Value("combined '${appDesc}'value")
	String combValue;

	@Value("${xman.test.cofigserver.testdata}")
	String testDatafromGit;

	@GetMapping("/hi")
	public String hi() {
		return appDesc;
	}

	@GetMapping("/getDesc")
	public String getDesc() {
		return appDesc;
	}

}