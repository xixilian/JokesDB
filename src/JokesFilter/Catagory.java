package JokesFilter;

import java.util.List;

/**
 * This class represents a catagory. A catagory can use not only one tags.
 * @author Xizhe
 * @version 0.0
 */
public class Catagory {

	private String cata_name;
	private List<String> sortedJokes;
	private List<Tagger> taggedJokes;
	
	public Catagory(List<Tagger> ts){
		this.cata_name = setUpName(ts);
	}
	
	private String setUpName(List<Tagger> ts){
		String n = null;
		while(ts.next != null){
			n = n.concat(ts.getTagName);
		}
	}
	public void sortByCata(List<Tagger> ts){}
}
