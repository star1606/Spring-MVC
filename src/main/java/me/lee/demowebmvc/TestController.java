package me.lee.demowebmvc;

import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
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
	public String events(InputStream requestBody, OutputStream responseBody) {
		return "events";
	}
	
	// InputStream requestBody, OutputStream responseBody
	// InputStream으로 요청의 본문의 데이터를 읽어 오는 것(Reader)
	// OutputStream으로 응답 본문에다가 씀 (Writer)
	// 위에 부분은 서블릿 API
	
	
	
	// PushBuilder를 쓰면 중간의 과정 전에 바로 서버가 보내줌
	// 응답코드에따라 데이터 타입 다르게 쓰려면 ResponseEntity 사용
	
	
	
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
	
	
	
	@GetMapping("/events/{id}")
	@ResponseBody
	// 문자열을 Integer로 자동으로 바꿔줌
	// Optional<> null 존재 여부 확인 가능함
	public Event getEvent(@PathVariable Integer id, @MatrixVariable String name) {
		Event event = new Event();
		event.setId(id);
		event.setName(name);
		return event;
	}
	
	
}
