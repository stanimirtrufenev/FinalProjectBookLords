package oop;
import java.net.URL;
import java.util.Set;

public class Book {
	private String title;
	private Author author;
	private float rating;
	private long numberOfRatings;
	private long reviews;
	private Rating ratings;
	private int pages;
	private String editionLanguage;
	private URL url;
	private String series;
	// LinkedHashSet to be in the order in which they came:
	private Set<Character> characters;
	// country, year:
	private String setting;
	// LinkedHashSet to be in the order in which they came: 
	private Set<Comment> comments;
	
}
