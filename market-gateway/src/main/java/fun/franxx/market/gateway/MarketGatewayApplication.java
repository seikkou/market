package fun.franxx.market.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy // 开启zuul网关
public class MarketGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketGatewayApplication.class, args);
    }

}
