package kui.fegin_client.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kui.fegin_client.service.HiService;

@RestController
public class HiController {

	@Autowired
	private HiService hiService;
	
	@RequestMapping("/hello")
	public String hello() {
		return hiService.hello();
	}
	
}
