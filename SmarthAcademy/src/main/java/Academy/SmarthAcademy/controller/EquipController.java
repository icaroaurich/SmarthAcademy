package Academy.SmarthAcademy.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Academy.SmarthAcademy.service.EquipamentoService;

@CrossOrigin
@RestController
@RequestMapping(value = "/equip")
public class EquipController {

	private final EquipamentoService equipamentoService;

	public EquipController(EquipamentoService equipamentoService) {
		this.equipamentoService = equipamentoService;
	}

	@GetMapping("/{id}") // 
	public String getEquip(@PathVariable int id) {
		String fluxoEquip = equipamentoService.getFluxoEquip(id);
		return fluxoEquip;
	}

}








































