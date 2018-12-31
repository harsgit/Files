package lab2_5;

public class Person {
	private String lastName;
	private String firstName;
	private char gender;
	 private int age;
	 private int phoneNumber;
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	 Person() {
			this("Divya", "Bharathi", 'F', 22);
		}
	int getPhoneNumber(int PhoneNumber)
	{
		this.phoneNumber=PhoneNumber;
		return phoneNumber;
	}
	

	

	public Person( String firstName,String lastName, char gender, int age) {

		
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		
	}
	void Display()
	{
		System.out.println("Personal Details");
		System.out.println("-----------------");
		System.out.println("First Name :" + " " + firstName);
		System.out.println("Last Name :" + " " + lastName);
		//System.out.println("Gender :" + " " + gender);
		System.out.println("Age:" + " " + age);
	    System.out.println("phone Number :"+" "+phoneNumber);
	}

	


}
