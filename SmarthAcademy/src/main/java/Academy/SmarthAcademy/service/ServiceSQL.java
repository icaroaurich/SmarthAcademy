package Academy.SmarthAcademy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Academy.SmarthAcademy.entities.Equipamento;
import Academy.SmarthAcademy.repository.SelectRepo;

@Service
public class ServiceSQL implements iServiceSQL{
	
	@Autowired
	private SelectRepo repoSelect;

	@Override
	public String getFluxoEquip(int i) {
		String teste = repoSelect.trazerqt(i);
		return teste;
	}

}
