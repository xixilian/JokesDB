import package JokesFilter;
import java.sql.*;
import java.io.*;

/**
 * Jokes are tagged here.
 * @author Xizhe Lian
 * @version 0.0
 */
public class Tagger {
	//private String s;
	//private StringBuffer sb;
	enum Tags tags;
	private String tname;
	private List<String> taggedJokes;
	
	Tagger(){
		tname = null;
        taggedJokes = new ArrayList<String>(); 
	}
	
	public String getTagName(){
		return this.tname;
	}
	
	/**
	 * for test, try to read in jokes from sql
	 * @param argv
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
		Statement sql_stmt = null;
		Connection con = null;
		/*ich verstehe nicht ganz...gibts error :/ Xizhe*/
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1433:@jokes","xizhe","jiji");
			sql_stmt = con.createStatement();
		}
		catch (Exception e){
			System.err.println("Following error occured:" + e);
			System.exit(-1);
		}
		
		String s = new String();
		StringBuffer sb = new StringBuffer();
		
		try{
			FileReader fr = new FileReader(new File("/Users/Gee/Desktop/HIWI/40KJokesDatabase/wp.sql.gz"));
			BufferedReader br = new BufferedReader(fr);
			
			while ((s = br.readLine()) != null) {
				sb.append(s);
			}
			br.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		}
}
