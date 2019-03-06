package kui.eureka_client;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableEurekaClient
@SpringBootApplication
@Controller
public class EurekaClientStarter {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientStarter.class, args);
    }
    
    @Value("${server.port}")
    private String port;
    
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
    	return "hello im client,"+port;
    }
}
