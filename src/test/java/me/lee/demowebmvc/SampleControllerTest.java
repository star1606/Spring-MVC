package me.lee.demowebmvc;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

//@ExtendWith(SpringRunner.class)
@WebMvcTest
public class SampleControllerTest {

	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void helloTest() throws Exception {
		mockMvc.perform(get("/hello")
				.header(HttpHeaders.FROM, "localhost")
				// header에 [From:"localhost"] 이렇게 보내짐
				.param("name", "lee")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
		)
		
			.andDo(print())
			.andExpect(status().isOk())
			//.andExpect(content().string("hello"))
			//.andExpect(status().isMethodNotAllowed())
		;
	}
	
}
