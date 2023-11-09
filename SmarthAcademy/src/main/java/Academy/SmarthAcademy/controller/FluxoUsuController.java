package Academy.SmarthAcademy.controller;

import Academy.SmarthAcademy.service.FluxoUsuarioService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/fluxo")
public class FluxoUsuController {


	private final FluxoUsuarioService fluxoUsuarioService;

	public FluxoUsuController(FluxoUsuarioService fluxoUsuarioService) {
		this.fluxoUsuarioService = fluxoUsuarioService;
	}

	@GetMapping("/") //
	public String getFluxoUsu() {
		String fluxoUsu = fluxoUsuarioService.getFluxoUsu(1);
		return fluxoUsu;
	}

}








































