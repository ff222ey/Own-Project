package programHelper;

import java.util.ArrayList;

public class Elev {
	private String firstname;
	private String surname;
	private String gender;
	private ArrayList<String> history;
	
	public Elev (String first, String second, String gender) {
		this.firstname = first;
		this.surname = second;
		this.gender = gender.toLowerCase();
		history = new ArrayList<>();
	}
	public String getFirstname() {
		return firstname;
	}

	public String getSurname() {
		return surname;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public ArrayList<String> getHistory() {
		return history;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String toString() {
		return firstname +" " + surname;
	}
}
