package ceit.projeto;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("carga")
public class ApiController {

	@RequestMapping(method=RequestMethod.POST)
	public void salvaCarga(@RequestBody CargaVO carga) {
	}		
		
}
