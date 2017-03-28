package pl.sdacademy.xml.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLExercise {
	private final String path = "platformJava\\pl\\sdacademy\\xml\\resources\\";
	private List<Person> persons;
	
	
	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public List<Person> readXMLFile(String filename) throws Exception {
		persons = new ArrayList<>();
		File f = new File(path + filename);

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		DocumentBuilder db = dbf.newDocumentBuilder();

		Document doc = db.parse(f);
		doc.getDocumentElement().normalize();

		NodeList nList = doc.getElementsByTagName("staff");

		for (int i = 0; i < nList.getLength(); i++) {
			Node n = nList.item(i);
			if (n.getNodeType() == Node.ELEMENT_NODE) {
				Element elem = (Element) n;
				Person p = new Person(Integer.parseInt(elem.getAttribute("id")),
						elem.getElementsByTagName("firstname").item(0).getTextContent(),
						elem.getElementsByTagName("lastname").item(0).getTextContent(),
						Double.parseDouble(elem.getElementsByTagName("salary").item(0).getTextContent()));
				persons.add(p);
			}
		}
		return persons;
	}

	public void writeXMLFile(String filename) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.newDocument();

		Element root = doc.createElement("root");

		Element person = doc.createElement("person");
		person.setAttribute("id", "13");

		Element name = doc.createElement("name");
		name.appendChild(doc.createTextNode("Kuba"));

		Element lastname = doc.createElement("lastname");
		lastname.appendChild(doc.createTextNode("Buba"));

		person.appendChild(name);
		person.appendChild(lastname);

		root.appendChild(person);

		doc.appendChild(root);

		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();

		DOMSource source = new DOMSource(doc);

		StreamResult sr = new StreamResult(new File(path + filename));

		t.transform(source, sr);
	}

	public double getAvgSalary() throws Exception {
		return persons.stream().mapToDouble(Person::getSalary).average().getAsDouble();
	}

	public ArrayList<String> getNames() {
		return (ArrayList<String>) persons.stream().map(p -> p.getFirstname() + " " + p.getLastname()).collect(Collectors.toList());
	}
	
	public void getMinMaxStaffID() {
		Integer max = persons.stream().map(Person::getId).max(Integer::compareTo).get();
		System.out.println("Najwyzsza pensja: " + max);
		Integer min = persons.stream().map(Person::getId).min(Integer::compareTo).get();
		System.out.println("Najnizsza pensja: " + min);
	}
}
