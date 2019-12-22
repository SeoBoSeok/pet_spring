package kr.co.vetgate.pet.controller;

import org.junit.jupiter.api.Test; // junit5용
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
class HelloWorldControllerTest {
	@Autowired // bin을 주입하겠다는 의미, main source
	private HellloWorldController helloWorldController;
	
	private MockMvc mockMvc;
	
	@Test
	void helloWorld() {
//		fail("Not yet implemented");
		System.out.println(helloWorldController.helloWorld());
		
//		assertThat(helloWorldController.helloWorld()).isEqualTo("hello world"); // http 호출없이 함수 실행해서 test
	}
	
	@Test
	void mockMvcTest() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(helloWorldController).build();
		mockMvc.perform(MockMvcRequestBuilders.get("/api/helloworld"))
		.andDo(MockMvcResultHandlers.print())
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("HELLO WORLD"));
	}

}
