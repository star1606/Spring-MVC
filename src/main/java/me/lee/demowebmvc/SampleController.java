package me.lee.demowebmvc;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// 클래스 레벨로 설정도 가능 @RequestMapping(method = RequestMethod.GET)
public class SampleController {

	//@RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.PUT})
	//@GetMapping("/hello?") // ? 뒤에 한글자가 와야됨, * 뒤에 여러글자, ** 뒤에 path 상관없이
//	@RequestMapping("/{name:[a-z] +}") //정규식 가능
//	@ResponseBody
//	public String hello(@PathVariable String name) {
//		return "hello" + name;
//	}
	
	
	// JSON요청만 처리하겠다 -> 헤더에 json설정해서 보내야됨(contentType)
	@GetMapping(
			value = "/hello",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.TEXT_PLAIN_VALUE
			// plain text의 응답을 원하는 요청만 처리해줌
	)
	@ResponseBody
	//@GetMapping(value = "/hello", params = "name=lee")
	public String hello() {
		return "hello";
	}
	
	
	@GetHelloMapping
	@ResponseBody
	public String helloPost() {
		return "hello";
	}
	
	

	
	
	
	
	
	
	
}
