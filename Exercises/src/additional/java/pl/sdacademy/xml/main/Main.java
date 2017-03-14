package pl.sdacademy.xml.main;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		XMLExercise xmle = new XMLExercise();
//		List<Person> persons = xmle.readXMLFile("staff.xml");
		
		xmle.readXMLFile("staff.xml");
		
//		xmle.writeXMLFile("example.xml");
		
		double avg = xmle.getAvgSalary();
		System.out.println("Średnia pensja: " + avg);
		
		ArrayList<String> names = xmle.getNames();
		
		for(String n : names) {
			System.out.println("Imie i nazwisko: " + n);
		}
		
		xmle.getMinMaxStaffID();
		
		
	}
}
