# springcloud
<ul>
  <li>fefe</li>
</ul>


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


# 概念理解
### 微服务
  通过服务调用技术，接受从微服务集群传送数据过程，就是一种微服务调用
  微服务集群(众多服务器)独立部署，独立访问，水平扩展(没有服务框架概念时，需要第三方技术支持水平扩展)服务单元组成一个组；需要自主维护异常逻辑
### springcloud
  基于springboot实现的微服务框架开发工具；使用ss框架开发的项目无法实现springcloud，因为springcloud依赖非常复杂，starter-pom;
  利用springboot为微服务框架提供了一种简化的开发模式；提供了非常多的微服务组件:
- 服务治理组件Euraka(所有服务的管理中心)
- 客户端负载均衡组件Ribbon
- 服务容错保护组件Hystrix(try catch只能捕捉内部代码逻辑错误，http请求失败)
- 声明式的服务调用组件Fegin(Ribbon升级)
-   API网关治理组件Zuul(路由)
-   消息总线Bus(服务调服务)
