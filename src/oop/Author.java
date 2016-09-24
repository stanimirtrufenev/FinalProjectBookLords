package oop;
import java.util.Date;
import java.util.Set;

public class Author extends User {
	// where + date
	private String born;
	private Date died;
	private Set<Genre> genre;
	private Date memberSince;
	private String biography;
	
	//TreeSet to be sorted by rating asc:
	private Set<Book> books;
	
}
