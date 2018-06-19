package com.bs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication

//这里是扫描mapper接口的包，用于识别mybatis
@EnableScheduling
@MapperScan(basePackages = "com.bs.mapper")
public class BsDemo01Application {

	public static void main(String[] args) {

		SpringApplication.run(BsDemo01Application.class, args);
	}
}
