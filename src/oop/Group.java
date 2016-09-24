package oop;
import java.net.URL;
import java.util.Set;

public class Group {
	private String title;
	private String tags;
	private String location; 
	private URL website;
	private String groupType;
	private String rules;
	private Bookshelf bookshelfe;
	
	private Set<Discussion> discussions;
	//TreeSet to be sorted alphabetically
	private Set<User> members;
}
