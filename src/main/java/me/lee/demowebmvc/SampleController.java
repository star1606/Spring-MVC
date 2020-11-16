package me.lee.demowebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// 클래스 레벨로 설정도 가능 @RequestMapping(method = RequestMethod.GET)
public class SampleController {

	//@RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.PUT})
	//@GetMapping("/hello?") // ? 뒤에 한글자가 와야됨, * 뒤에 여러글자, ** 뒤에 path 상관없이
	@RequestMapping("/{name:[a-z] +}") //정규식 가능
	@ResponseBody
	public String hello(@PathVariable String name) {
		return "hello" + name;
	}
	
	
}
