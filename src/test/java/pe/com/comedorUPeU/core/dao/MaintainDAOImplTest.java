package pe.com.comedorUPeU.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.comedorUPeU.core.domain.Comensal;
import pe.com.comedorUPeU.core.domain.Person;
import pe.com.comedorUPeU.core.domain.StatusComensal;
import pe.com.comedorUPeU.core.domain.StatusPerson;


public class MaintainDAOImplTest extends AbstractUnitTest {

	@Autowired
	protected MaintainDAO maintainDAO;
//	List<Person> findAllPerson();
//	void savePerson(Person person);
	
	public void testFindAllPerson(){
		System.out.println(":::"+maintainDAO);
	}
	
	public void testSavePerson() {
//		testFindAllPerson();
		
		Person person = new Person();
		
		person.setId(1L);
		person.setAddress("Cusco jr: Tullquipata");
		person.setName("Amilcar");
		person.setLastName("Caceres");
		person.setLastNameM("Huachaca");
		
		StatusPerson status=new StatusPerson();
		status.setTypeCode(StatusPerson.Status.PERSON_ACT.toString());
		
		maintainDAO.savePerson(person);
		testFindAllPerson();
		setComplete();
		}	
		public void testFindPersonById(){
			
			System.out.println("::: "+maintainDAO.findPersonById(1L));
			Person person = maintainDAO.findPersonById(1L);
			
			System.out.println("Name: "+person.getName());
			System.out.println("Address: "+person.getAddress());
			
		}
		public void testDeletePerson(){
			Person person = maintainDAO.findPersonById(2L);
			maintainDAO.deletePerson(person);
			setComplete();
		
	}
		public void testFindAllComensal(){
			System.out.println(":::"+maintainDAO);
		}
		
		public void testSaveComensal(){
			Comensal comensal = new Comensal();
			
			
			StatusComensal statusComensal = new StatusComensal();
			statusComensal.setTypeCode(StatusComensal.Status.COMENSAL_ACT.toString());
			comensal.setStatusComensal(statusComensal);
			
			Person person = new Person();
			person.setLastName("Amilcar");
			
			StatusPerson statusPerson = new StatusPerson();
			statusPerson.setTypeCode(StatusPerson.Status.PERSON_ACT.toString());
			person.setStatusPerson(statusPerson);
			
			
			comensal.getPerson();
					
			maintainDAO.saveComensal(comensal);
			testFindAllComensal();
			setComplete();
		}
		public void testFindComensalById(){
			
			System.out.println("::: "+maintainDAO.findComensalById(1L));
			Comensal comensal = maintainDAO.findComensalById(1L);
			
			System.out.println("typeComensal: "+comensal.getTypeComensal());
			}
		
		
		public void testDeleteComensal(){
			Comensal comensal = maintainDAO.findComensalById(1L);
			maintainDAO.deleteComensal(comensal);
			setComplete();
		
		

		}
	
}
