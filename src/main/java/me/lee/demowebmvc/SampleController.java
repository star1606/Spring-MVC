package me.lee.demowebmvc;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// 클래스 레벨로 설정도 가능 @RequestMapping(method = RequestMethod.GET)
public class SampleController {

	// @RequestMapping(value = "/hello", method = {RequestMethod.GET,
	// RequestMethod.PUT})
	// @GetMapping("/hello?") // ? 뒤에 한글자가 와야됨, * 뒤에 여러글자, ** 뒤에 path 상관없이
//	@RequestMapping("/{name:[a-z] +}") //정규식 가능
//	@ResponseBody
//	public String hello(@PathVariable String name) {
//		return "hello" + name;
//	}

	// JSON요청만 처리하겠다 -> 헤더에 json설정해서 보내야됨(contentType)
	@GetMapping(value = "/hello", 
				consumes = MediaType.APPLICATION_JSON_VALUE,
				produces = MediaType.TEXT_PLAIN_VALUE
	// plain text의 응답을 원하는 요청만 처리해줌
	)
	@ResponseBody
	// @GetMapping(value = "/hello", params = "name=lee")
	public String hello() {
		return "hello";
	}

	@GetHelloMapping
	@ResponseBody
	public String helloPost() {
		return "hello";
	}

	///////////////////////////////////////////////////////////////////////////////////////

	@GetMapping("/events/form")
	public String eventsForm(Model model) {
		Event newEvent = new Event();
		newEvent.setLimit(50);
		// 화면에 어떤 model(데이터, 뷰)을 제공할 것인가에 대한 내용
		model.addAttribute("event", newEvent); // Event 객체를 넘겨준다.
		return "events/form";
	}

	// @GetMapping("/events/{id}?name=keesun") param string

//	@PostMapping("/events")
//	@ResponseBody
//	public Event getEvent(@RequestParam String name, 
//						  @RequestParam Integer limit)
//	{
//		Event event = new Event();
//		event.setName(name);
//		event.setLimit(limit);
//		return event;
//	}

	@PostMapping("/events/name/{name}")
	@ResponseBody
	//먼저 @ModelAttribute로 데이터 바인딩되고 @Valid 수행
	//그 다음 에러를 bindingResult에다가 담음
	public Event getEvent(@Valid @ModelAttribute Event event, BindingResult bindingResult) {
		// @ModelAttribute 복합객체를 받아올 수 있다.
		// 복합객체에다가 데이터와 바인딩한다
		// 반드시 쿼리파라미터, 폼데이터만 데이터 바인딩하는 것이 아니다
		// BindingResult과 관련된 에러를 담아주고 요청이 처리됨
		if(bindingResult.hasErrors()) {
			System.out.println("===========================");
			bindingResult.getAllErrors().forEach(c -> {
				System.out.println(c.toString());
			});
		} // 폼을 보여주면서 당신의 코드가 문제가 있다고 보여주는 것
		return event;
	}

	// postman으로 테스트하는게 더 편하다

}
