package Academy.SmarthAcademy.entities;
//Aurich
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Equipamento {
	
	@Id
	private Long id;
	private String horario;
	private int status;

	public Equipamento() {}

	public Equipamento(Long id, String horario, int status) {
		super();
		this.id = id;
		this.horario = horario;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
