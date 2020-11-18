package me.lee.demowebmvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.options;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

//@ExtendWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@WebMvcTest
public class SampleControllerTest {

	@Autowired
	MockMvc mockMvc;
//	
//	@Test
//	public void helloTest() throws Exception {
//		mockMvc.perform(options("/hello")
//				.header(HttpHeaders.FROM, "localhost")
//				// header에 [From:"localhost"] 이렇게 보내짐
//				.param("name", "lee")
//				.contentType(MediaType.APPLICATION_JSON)
//				.accept(MediaType.APPLICATION_JSON)
//		)
//		
//			.andDo(print())
//			.andExpect(status().isOk())
//			.andExpect(header().stringValues(HttpHeaders.ALLOW, 
//					hasItems(
//							containsString("GET"),
//							containsString("POST"),
//							containsString("HEAD"),
//							containsString("OPTIONS")
//							)))
			//.andExpect(content().string("hello"))
			//.andExpect(status().isMethodNotAllowed())
//		;
//	}
	
	
	
	// URI 패턴 Test
//	@Test
//	public void deleteEvent() throws Exception {
//		mockMvc.perform(get("/events/1"))
//			.andDo(print())
//			.andExpect(status().isOk())
//			.andExpect(jsonPath("id").value(1))
//		;
//	}
	
	
//	@Test
//	public void postEvent() throws Exception {
//		mockMvc.perform(post("/events/?name=keesun"))
//			.andDo(print())
//			.andExpect(status().isOk())
//			.andExpect(jsonPath("name").value("keesun"))
//		;
//	}
	
	
	@Test 
	public void postEvent() throws Exception {
		mockMvc.perform(post("/events/name/keesun")
				.param("limit", "-10"))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(jsonPath("name").value("keesun"))
		;	
		
	}
	
}
