package me.lee.demowebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// 클래스 레벨로 설정도 가능 @RequestMapping(method = RequestMethod.GET)
public class SampleController {

	@RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.PUT})
	@ResponseBody
	public String hello() {
		return "hello";
	}
	
	
}
