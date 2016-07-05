package pe.com.comedorUPeU.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class CoreDAOImplTest extends AbstractUnitTest {

	@Autowired
	protected CoreDAO coreDAO;
//	List<Person> findAllPerson();
//	void savePerson(Person person);
	
	public void testFindAllPerson(){
		System.out.println(":::"+coreDAO);
	}

}
