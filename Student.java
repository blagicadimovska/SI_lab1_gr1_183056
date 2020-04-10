class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> labPoints;


	//TODO constructor
     Student(String index, String firstName, String lastName){
     	this.index=index;
     	this.firstName=firstName;
     	this.lastName=lastName;
	 }
	//TODO seters & getters
	public static void setIndex(String newIndex){
		indeks=newIndex;
	}
	public static void setIndex(String newFirstName){
		firstName=newFirstName;
	}
	public static void setIndex(String newLastName){
		lastName=newLastName;
	}
	public String getFirstName(){
     	return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}



	public double getAverage() {
		//TODO
	}

	public boolean hasSignature() {
		//TODO
	}
}

class Course {
	List<Student> Studenti;

	public double Average() {
		
	}
	public boolean Signature() {
		
	}
	
}
