package pe.com.comedorUPeU.core.dao;

import java.util.List;

import pe.com.comedorUPeU.core.domain.Comensal;
import pe.com.comedorUPeU.core.domain.Person;
import pe.com.comedorUPeU.core.domain.StatusComensal;
import pe.com.comedorUPeU.core.domain.StatusPerson;
import pe.com.comedorUPeU.core.domain.TypeDocument;

public interface MaintainDAO {
	
	void deleteComensal(Comensal comensal);
	
	Comensal findComensalById(Long id);
	
	List<Comensal> findComensal();
	
	void updateComensal(Comensal comensal);
	
	void saveComensal(Comensal comensal);
	
	List<StatusComensal> findStatusComensal();

	
	List<Person> findAllPerson();

	void savePerson(Person person);

	Person findPersonById(Long id);

	void deletePerson(Person person);

	List<StatusPerson> findStatusPerson();
	
	List<TypeDocument> findTypeDocument();


}
