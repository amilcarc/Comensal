package pe.com.comedorUPeU.core.dao;

import java.util.List;

import pe.com.comedorUPeU.core.domain.Comensal;
import pe.com.comedorUPeU.core.domain.Person;
import pe.com.comedorUPeU.core.domain.StatusComensal;
import pe.com.comedorUPeU.core.domain.StatusPerson;
import pe.com.comedorUPeU.core.domain.TypeDocument;

public class MaintainDAOImpl extends BaseDAOHibernate implements MaintainDAO {

	
//	mantenimientos de usuario, comensales, horario
//	insert, update, delete, list and search or report
	
	public Comensal findComensalById(Long id) {
		return findById(Comensal.class, id);
		
	}
	public void deleteComensal(Comensal comensal) {
		delete(comensal);
	}
//	public List<Comensal> findAllComensal(){
//		return find(Comensal.class, "from Comensales");

	
	
	public List<Comensal> findComensal() {
		return find(Comensal.class, "from Comensales");
	}
	
	public void updateComensal(Comensal comensal){
		update(comensal);
	}
	
	public void saveComensal(Comensal comensal) {
		save(comensal);
	}
	
	public List<StatusComensal> findStatusComensal() {
		return find(StatusComensal.class, "from StatusComensal");
	}
		
//		public List<Person> findPerson() {
//			return find(Person.class, "from Person");
//	}
	public void savePerson(Person person){
		save(person);
		
	}
	
	public List<Person> findAllPerson() {
		return find(Person.class, "from Person");
		}
		
	public Person findPersonById(Long id){
		return findById(Person.class, id);
	}
	
	public void updatePerson (Person person){
		update(person);
	}
	
	public void deletePerson (Person person){
		delete(person);
	}
	public List<StatusPerson> findStatusPerson(){
		return find(StatusPerson.class, "from StatusPerson");
	}
	
	public List<TypeDocument> findTypeDocument(){
		return find(TypeDocument.class,"from typeDocument");
	}
	
}
