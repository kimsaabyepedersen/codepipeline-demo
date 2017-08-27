package dk.anno1980.aws.codepipeline.demo;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@RestController
	@RequestMapping(path = "/")
	class MyController{

		@GetMapping
		String hello(){
			return "Hello world! The time is: "+ LocalDateTime.now().toString();
		}

	}
}
