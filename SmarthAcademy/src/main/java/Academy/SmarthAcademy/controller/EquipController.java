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
@RequestMapping(value = "/equip")
public class EquipController {
	
	@Autowired
	ServiceSQL service;
	
	@GetMapping("/{id}") // 
	public String getEquip(@PathVariable int id) {
		String fluxoEquip = service.getFluxoEquip(id);	 		
		return fluxoEquip;
	}

}








































