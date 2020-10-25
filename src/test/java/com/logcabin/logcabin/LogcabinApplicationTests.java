package com.logcabin.logcabin;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LogcabinApplicationTests {

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	
	public class TestClasses {
		public static void main(String[] args){
		Result result = JUnitCore.runClasses(TestClasses.class);
		for (Failure failure: result.getFailures()){
		System.out.println)failure.toString());	
	   }
	 }
	}


}
