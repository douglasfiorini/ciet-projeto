package ceit.projeto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	/**
	 * Comentário
	 */
	@RequestMapping("/ola")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Ola";
	}

}
