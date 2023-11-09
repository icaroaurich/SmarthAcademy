package Academy.SmarthAcademy.service;

import org.springframework.stereotype.Service;

import Academy.SmarthAcademy.repository.EquipamentoRepo;

@Service
public class EquipamentoService {

	private final EquipamentoRepo equipamentoRepo;

	public EquipamentoService(EquipamentoRepo equipamentoRepo) {
		this.equipamentoRepo = equipamentoRepo;
	}

	public String getFluxoEquip(int i) {
		String fluxoEquip = equipamentoRepo.trazerqt(i);
		return fluxoEquip;
	}

}
