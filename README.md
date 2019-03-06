# springcloud
## 测试案例1-ribbon：
1. 首先启动eureka-server
2. 启动之后，在浏览器打开http://localhost:8000/;(注册中心)
3. 观看Instances currently registered with Eureka这个栏目(当前注册到该注册中心服务的客户端)
4. 分别启动eureka-client和eureka-client1
5. 再次观看Instances currently registered with Eureka这个栏目，可以看到会多两个客户端，服务名称为service-hi,端口号分别为9000和9001
6. 然后我们再启动ribbon-client（它占用的端口为9090）,由于ribbon的配置，它也会注册到eureka-server（注册中心）
7. 我们再次观看Instances currently registered with Eureka这个栏目，可以看到此栏目下又多出了一个ribbon的实例客户端。
8. 此时我们就可以在浏览器通过输入地址：http://localhost:9090/hello来转发访问到http://localhost:9000/hello和http://localhost:9001/hello的请求，此时就做到了负载均衡，比nginx的可靠性更好
## 测试案例2-feign：
1. 首先启动eureka-server
2. 启动之后，在浏览器打开http://localhost:8000/;(注册中心)
3. 观看Instances currently registered with Eureka这个栏目(当前注册到该注册中心服务的客户端)
4. 分别启动eureka-client和eureka-client1
5. 再次观看Instances currently registered with Eureka这个栏目，可以看到会多两个客户端，服务名称为service-hi,端口号分别为9000和9001
6. 然后我们再启动fegin-client（他占用的端口为9090），和ribbon配置一样，它也会注册到eureka-server（注册中心）
7. 我们再次观看Instances currently registered with Eureka这个栏目，可以看到此栏目下又多出了一个feign的实例客户端。
8. 此时我们就可以在浏览器通过输入地址：http://localhost:9090/hello来转发访问到http://localhost:9000/hello和http://localhost:9001/hello的请求，此时就做到了负载均衡，比nginx的可靠性更好
