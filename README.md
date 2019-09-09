# 1. Spring Cloud 入门
## 1.1. eureka-server
-启动server，访问 http://localhost:1010/，出现如图
![](_v_images/20190906163009689_17750.png)
- 未启动client端，图中是没有服务的
## 1.2. eureka-client
- 启动client端，访问http://localhost:2020/client
出现如图
![](_v_images/20190906163943024_10016.png)

- 再次刷新server端，如图，表示服务已经上来
 ![](_v_images/20190906164015824_10971.png)
## 1.3. eureka-consumer
- 访问http://localhost:3030/consumer
![](_v_images/20190906174812595_24039.png)
## 1.4. eureka-consumer-ribbon
- 访问http://localhost:3030/consumer
![](_v_images/20190906174812595_24039.png)

## 1.5. eureka-consumer-feign
- 访问http://localhost:3030/consumer
![](_v_images/20190906174812595_24039.png)