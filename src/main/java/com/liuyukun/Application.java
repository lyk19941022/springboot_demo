package com.liuyukun;

import com.liuyukun.listener.MyHttpSessionListener;
import com.liuyukun.servlet.MyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@ServletComponentScan
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/*@Bean
	public ServletRegistrationBean<MyServlet> getServletRegistrationBean(){
		ServletRegistrationBean<MyServlet> bean = new ServletRegistrationBean<>(new MyServlet());
		bean.setLoadOnStartup(1);
		return bean;
	}*/

	@Bean
	public ServletListenerRegistrationBean listenerRegist(){
		ServletListenerRegistrationBean srb = new ServletListenerRegistrationBean();
		srb.setListener(new MyHttpSessionListener());
		System.out.println("listener");
		return srb;
	}

}
