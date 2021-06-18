package com.hwadee.scu.common.config;//package com.example.demo.conf;

//import com.example.demo.converter.MyDataConverter;
//import com.example.demo.interceptor.LoginInterceptor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.format.FormatterRegistry;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration//注解作用：声明这是一个注解类
//public class MyConf implements WebMvcConfigurer {
//    @Bean //Bean作用：声明这个方法返回一个Bean实例，并把这个实例交给Spring容器管理
//    public LoginInterceptor loginInterceptor(){
//        return new LoginInterceptor();
//    }
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(loginInterceptor()).addPathPatterns("/user/**");
//    }
//    @Bean
//    public MyDataConverter myDataConverter(){
//        return new MyDataConverter();
//    }
//
//    @Override
//    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(myDataConverter());
//    }
//}
