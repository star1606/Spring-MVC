package me.lee.demowebmvc;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Documented // 문서화에 포함되게 끔 javadoc 
@Target(ElementType.METHOD) // 어느부분에 쓸지
@Retention(RetentionPolicy.RUNTIME)
@RequestMapping(method = RequestMethod.GET, value = "/hello")
public @interface GetHelloMapping {

}
