package Academy.SmarthAcademy.service;
//Aurich
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Academy.SmarthAcademy.entities.Equipamento;
import Academy.SmarthAcademy.repository.SelectFluxo;
import Academy.SmarthAcademy.repository.SelectRepo;

@Service
public class ServiceSQL implements iServiceSQL{
	
	@Autowired
	private SelectRepo repoSelect;
	@Autowired
	private SelectFluxo fluxoSelect;

	@Override
	public String getFluxoEquip(int i) {
		String fluxoEquip = repoSelect.trazerqt(i);
		return fluxoEquip;
	}

	@Override
	public String getFluxoUsu(int i) {
		String fluxoUsu = fluxoSelect.trazerFluxoUsu(i);
		return fluxoUsu;
	}

}
