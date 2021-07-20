package com.atguigu.gulimall.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author 刘波华
 * @Data 2021/6/17 15:11
 * @Description
 **/

@EnableDiscoveryClient
@SpringBootApplication
public class GulimallThirdPartyApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallThirdPartyApplication.class,args);
    }
}
