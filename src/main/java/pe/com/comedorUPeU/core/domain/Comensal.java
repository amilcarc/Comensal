package pe.com.comedorUPeU.core.domain;

import java.io.Serializable;

public class Comensal extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String codeStudent;
	private TypeComensal typeComensal;
	private StatusComensal statusComensal;
	
	private Person person;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getCodeStudent() {
		return codeStudent;
	}
	public void setCodeStudent(String codeStudent) {
		this.codeStudent = codeStudent;
	}
	public TypeComensal getTypeComensal() {
		return typeComensal;
	}
	public void setTypeComensal(TypeComensal typeComensal) {
		this.typeComensal = typeComensal;
	}
	public StatusComensal getStatusComensal() {
		return statusComensal;
	}
	public void setStatusComensal(StatusComensal statusComensal) {
		this.statusComensal = statusComensal;
	}
	
}
