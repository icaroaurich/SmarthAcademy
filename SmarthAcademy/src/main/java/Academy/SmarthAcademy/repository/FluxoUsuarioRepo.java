package Academy.SmarthAcademy.repository;

import Academy.SmarthAcademy.entities.FluxoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FluxoUsuarioRepo extends JpaRepository<FluxoUsuario,String> {

    @Query(nativeQuery = true, value = """
			select contagem from academy.usuario_fluxo
				""")
    String trazerFluxoUsu(int i);

}
