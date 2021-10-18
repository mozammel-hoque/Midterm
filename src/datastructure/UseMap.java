package datastructure;

import databases.ConnectDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class UseMap {

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        /*
		* Demonstrate how to use Map that includes storing and retrieving elements.
		* Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		* Use For Each loop and while loop with Iterator to retrieve data.
		*
	    * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		*/


        //implementation here


        //connect to database

		ConnectDB ct = new ConnectDB();

		Map<String, String> personalInfo = new HashMap<>();
		personalInfo.put("first name:", "Mozammel");
		personalInfo.put("last name:", "Hoque");
		personalInfo.put("cellphone:", "111111111111");
		personalInfo.put("email address:", "mh@gmail.com");

		System.out.println(personalInfo.get("cellphone"));
		for (Map.Entry entry : personalInfo.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
		List<String> StatesOfUSA = new ArrayList<>();
		StatesOfUSA.add("LA");
		StatesOfUSA.add("CA");
		StatesOfUSA.add("FL");
		List<String> citiesOFBangladesh = new ArrayList<>();
		citiesOFBangladesh.add("Dhaka");
		citiesOFBangladesh.add("Chittagong");
		citiesOFBangladesh.add("Feni");
		List<String> citiesOfAustralia = new ArrayList<>();
		citiesOfAustralia.add("Sydney");
		citiesOfAustralia.add("New Castle");
		citiesOfAustralia.add("Brisbane");

		Map<String, List<String>> map = new HashMap<>();
		map.put("USA", StatesOfUSA);
		map.put("Bangladesh", citiesOFBangladesh);
		map.put("Australia", citiesOfAustralia);

		System.out.println(map.get("USA"));

		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}







