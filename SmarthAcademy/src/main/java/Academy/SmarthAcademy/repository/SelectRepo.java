package Academy.SmarthAcademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Academy.SmarthAcademy.entities.Equipamento;

public interface SelectRepo extends JpaRepository<Equipamento,String>{
	
	@Query(nativeQuery = true, value = """
			select sum(presenca) from (select presenca from academy.equipamento_fluxo WHERE equipamentoid = :i order by horario desc limit 10) as t
				""")
	public String trazerqt(int i);

}

// @Query(nativeQuery = true, value = """ SELECT email FROM usuarios WHERE id = :i  """)
