package service;

import org.springframework.stereotype.Service;

import dao.PersonDao;
import model.Person;

@Service
public class PersonService {
	private final PersonDao personDao;
	
	public PersonService(PersonDao personDao) {
		this.personDao = personDao;
	}
	public int addPerson(Person person) {
		return personDao.insertPerson(person);
	}

}
