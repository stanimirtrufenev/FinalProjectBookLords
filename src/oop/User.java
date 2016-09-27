package oop;

import java.net.URL;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import exceptions.InvalidDataException;

public class User {
	private String name;
	private String email;
	private String password;
	private URL website;
	private String details;
	private Activity activity;
	private String interests;
	private String aboutMe;
	private int ratings;
	private int reviews;

	// List ?
	private List<Bookshelf> bookshelves;

	// TreeSet to be sorted alphabetically:
	private Set<User> followedPeople = new TreeSet<>();
	private Set<User> followers = new TreeSet<>();
	private Set<User> friends = new TreeSet<>();
	private Set<Author> favouriteAuthors;

	// LinkedHashSet to be in the order in which they came:
	private Set<Quote> quotes = new LinkedHashSet<Quote>();
	private Set<Comment> comments;

	//
	private Set<Group> groups;
	private Set<Discussion> discussions;

	public User(String name, String email, String password) throws InvalidDataException {
		isValidString(name);
		isValidString(email);
		isValidString(password);
	}

	public void isValidString(String string) throws InvalidDataException {
		if (string != null && string.trim().length() > 0) {
			this.name = string;
		} else {
			throw new InvalidDataException("Invalid information entered!");
		}
	}

}
