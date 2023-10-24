package Academy.SmarthAcademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Academy.SmarthAcademy.entities.Equipamento;

public interface SelectFluxo extends JpaRepository<Equipamento,String>{
	
	@Query(nativeQuery = true, value = """
			select contagem from academy.usuario_fluxo
				""")
	public String trazerFluxoUsu(int i);

}

// @Query(nativeQuery = true, value = """ SELECT email FROM usuarios WHERE id = :i  """)
