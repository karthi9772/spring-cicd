package learn;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class A {

	@GetMapping("/")
	String meth() {
		return "Helloooo";
	}
}
