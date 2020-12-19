package fun.franxx.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication // 声明引导类
@EnableEurekaServer // 开启eureka服务
public class MarketRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketRegistryApplication.class, args);
    }

}
