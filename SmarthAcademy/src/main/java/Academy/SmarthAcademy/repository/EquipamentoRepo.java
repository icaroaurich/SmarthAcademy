package Academy.SmarthAcademy.repository;
//Aurich
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Academy.SmarthAcademy.entities.Equipamento;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipamentoRepo extends JpaRepository<Equipamento,String>{
	
	@Query(nativeQuery = true, value = """
			select sum(presenca) from (select presenca from academy.equipamento_fluxo WHERE equipamentoid = :i order by horario desc limit 10) as t
				""")
	String trazerqt(int i);

}

// @Query(nativeQuery = true, value = """ SELECT email FROM usuarios WHERE id = :i  """)
