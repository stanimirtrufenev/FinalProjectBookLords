package oop;

import java.util.Date;
import java.util.Set;

import exceptions.InvalidDataException;

public class Author extends User {

	// where + date
	private String born;
	private Date died;
	private Set<Genre> genre;
	private Date memberSince;
	private String biography;

	// TreeSet to be sorted by rating asc:
	private Set<Book> books;

	public Author(String name, String email, String password, String born, String biography, Date memberSince)
			throws InvalidDataException {
		super(name, email, password);
		super.isValidString(born);
		super.isValidString(biography);
		this.memberSince = memberSince;
	}

}
