package kui.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableDiscoveryClient
public class RibbonClientStarter 
{
    public static void main(String[] args )

    {
        System.out.println( "Hello World!" );
        SpringApplication.run(RibbonClientStarter.class, args);
    }
    
    @Bean(name="restTemplate")//其他代码可以注入使用
    @LoadBalanced//利用这个对象访问服务，底层的负载均衡需要指定这个注解，轮询
    public RestTemplate getResource() {
    	return new RestTemplate();
    }
    
}
