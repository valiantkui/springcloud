package kui.fegin_client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient("service-hi")
@Service
public interface HiService {

	@RequestMapping("/hello")
	public String hello();
}
