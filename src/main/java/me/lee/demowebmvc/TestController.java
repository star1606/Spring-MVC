package me.lee.demowebmvc;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE) 클래스로 전체 설정할 때
public class TestController {

	
	// 1번
	@GetMapping("/events")
	@ResponseBody
	public String events() {
		return "events";
	}
	
	// 2번
	@GetMapping("/events/{id}")
	@ResponseBody
	public String getEvents(@PathVariable int id) {
		return "events";
	}
	
	
	// 3번
	@PostMapping(
			value = "/events",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String createEvent() {
		return "event";
	}
	
	
	// 4번
	@DeleteMapping("/events/{id}")
	@ResponseBody
	public String removeEvents(@PathVariable int id) {
		return "event";
	}

	
	// 5번
	@PutMapping(
			value = "/events",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String updateEvent() {
		return "event";
	}
	
}
