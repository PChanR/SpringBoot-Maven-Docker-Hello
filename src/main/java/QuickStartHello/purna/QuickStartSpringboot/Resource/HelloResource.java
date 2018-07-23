package QuickStartHello.purna.QuickStartSpringboot.Resource;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/hello")
public class HelloResource {

	@GetMapping
	public String hello() throws UnknownHostException {
		return "Hey folks! Welcome to New World, We are here: "+ InetAddress.getLocalHost().getHostAddress();
	}
}
