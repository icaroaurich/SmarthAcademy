package Academy.SmarthAcademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Academy.SmarthAcademy.entities.Equipamento;

public interface SelectRepo extends JpaRepository<Equipamento,String>{
	
	@Query(nativeQuery = true, value = """
			select count(*) from icaro.supino01 where status > 0 limit 10
				""")
	public String trazerqt(int i);

}

// @Query(nativeQuery = true, value = """ SELECT email FROM usuarios WHERE id = :i  """)
