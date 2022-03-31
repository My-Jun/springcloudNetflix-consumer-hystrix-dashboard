package org.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
// 开启dashboard
@EnableHystrixDashboard
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class DeptConsumer_9001 {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer_9001.class, args);
	}

}
