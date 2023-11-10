package Academy.SmarthAcademy.service;

import Academy.SmarthAcademy.repository.FluxoUsuarioRepo;
import org.springframework.stereotype.Service;

@Service
public class FluxoUsuarioService {

    private final FluxoUsuarioRepo fluxoUsuarioRepo;

    public FluxoUsuarioService(FluxoUsuarioRepo fluxoUsuarioRepo) {
        this.fluxoUsuarioRepo = fluxoUsuarioRepo;
    }

    public String getFluxoUsu(int i) {
        String fluxoUsu = fluxoUsuarioRepo.trazerFluxoUsu(i);
        return fluxoUsu;
    }
}
