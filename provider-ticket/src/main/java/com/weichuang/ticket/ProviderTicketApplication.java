package com.weichuang.ticket;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、导入dubbo与zk的依赖
 * 2、编写配置文件
 * 3、标记业务配置类
 * 4、开启dubbo服务注解
 */
@SpringBootApplication
@EnableDubbo
public class ProviderTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderTicketApplication.class, args);
	}

}
