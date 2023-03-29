package rsikspr.lab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class RsiksprApplication {

	@GetMapping("/health")
	public String getStatus() {
		return "OK!";
	}

	public static void main(String[] args) {
		SpringApplication.run(RsiksprApplication.class, args);
	}


}
