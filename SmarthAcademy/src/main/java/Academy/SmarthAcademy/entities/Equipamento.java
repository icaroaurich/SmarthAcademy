package Academy.SmarthAcademy.entities;

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
	private int index;
	private String horario;
	private int status;
	
	public int getIndex() {return index;}
	//public void setIndex(String index) {this.index = index;}
	
	public String getHorario() {return horario;}
	//public void setNome(String nome) {this.nome = nome;}
	
	public int getStatus() {return status;}
	//public void setNome(String nome) {this.nome = nome;}
	
	
}
