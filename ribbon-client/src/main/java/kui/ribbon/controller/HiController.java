package kui.ribbon.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HiController {
	@Resource(name="restTemplate")
	private RestTemplate template;
	@RequestMapping("/hello")
	public String hello() {
		//利用template对象访问服务
		//url是服务连接地址
		//http://service-hi对应了后台服务提供者的工程
		//hi?name=传入的参数
		//相当于用服务名称代替了工程访问的域名+端口号
		String hi = template.getForObject("http://service-hi/hello",String.class);
		return hi;
	}
	
	@RequestMapping("/ribbon")
	public String ribbon() {
			return "ribbon";
	}
}
