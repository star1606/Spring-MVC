package me.lee.demowebmvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

//@ExtendWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@WebMvcTest
public class TestControllerTest {

//	@Autowired
//	MockMvc mockMvc;
	
	// 1번
//	@Test
//	public void getEvents() throws Exception {
//		mockMvc.perform(get("/events"))
//				.andExpect(status().isOk());		
//			
//	}
	
	// 2번
//	@Test
//	public void getEventsWithId() throws Exception {
//		mockMvc.perform(get("/events/1"))
//				.andExpect(status().isOk());	
//		mockMvc.perform(get("/events/2"))
//				.andExpect(status().isOk());	
//		mockMvc.perform(get("/events/3"))
//				.andExpect(status().isOk());	
//			
//	}
	
	// 3번
//	@Test
//	public void createEvent() throws Exception {
//		mockMvc.perform(
//				post("/events")
//					.contentType(MediaType.APPLICATION_JSON)
//					.accept(MediaType.APPLICATION_JSON)			
//		).andExpect(status().isOk());
//	}
	
	
	// 4번
//	@Test
//	public void deleteEvent() throws Exception {
//		mockMvc.perform(delete("/events/1"))
//				.andExpect(status().isOk());	
//		mockMvc.perform(delete("/events/2"))
//				.andExpect(status().isOk());	
//		mockMvc.perform(delete("/events/3"))
//				.andExpect(status().isOk());	
//			
//	}
	
	
	// 5번
//	@Test
//	public void updateEvent() throws Exception {
//		mockMvc.perform(
//				put("/events")
//					.contentType(MediaType.APPLICATION_JSON)
//					.accept(MediaType.APPLICATION_JSON)			
//		).andExpect(status().isOk());
//	}
	
	
}
