package kui.fegin_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@Controller
public class FeginClientStarter 
{
    public static void main( String[] args )
    {
        SpringApplication.run(FeginClientStarter.class, args);
    }
    
    @RequestMapping("/")
    @ResponseBody
    public String index() {
    	return "index";
    }
}
