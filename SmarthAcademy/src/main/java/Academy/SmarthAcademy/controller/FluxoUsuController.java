package Academy.SmarthAcademy.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Academy.SmarthAcademy.service.ServiceSQL;

@CrossOrigin
@RestController
@RequestMapping(value = "/fluxo")
public class FluxoUsuController {
	
	@Autowired
	ServiceSQL service; // service
	
	@GetMapping("/") // 
	public String getFluxoUsu() {
		String fluxoUsu = service.getFluxoUsu(1);	 		
		return fluxoUsu;
	}

}








































