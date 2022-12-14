package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*xml
 * <context:component-scan base-package =a.b.test">
 * @ComponentScan(basepackage="a.b.test")
 * */
@SpringBootApplication
//1. 스프링부트 시작 클래스 - tomcat 시작 (application.properties파일 server.port=8081)
//@ComponentScan(basepackage="com.example.demo") 숨어있다
// 다른 @ComponentScan 이 생기면 자동으로 사라진다

@ComponentScan //현재패키지 annotation 인식
@ComponentScan(basePackages = "mycontroller")
@ComponentScan(basePackages = "upload")
@ComponentScan(basePackages = "board.spring.mybatis")

//@Mapper스캔설정
@MapperScan(basePackages = "board.spring.mybatis")
@MapperScan(basePackages = "upload")
public class Myboot1Application {

	public static void main(String[] args) {
		SpringApplication.run(Myboot1Application.class, args);
	}

}
