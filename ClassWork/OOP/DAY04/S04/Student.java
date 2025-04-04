class Student {
	String Name;
	int marks;
	
	//this is the constructor that is in this class that help us create an objects
	
	Student () {
		Name = null;
		marks = 0;
	}
	
	Student(String Name, int marks){
		this.Name = Name;
		this.marks = marks;
	}
	
	
	Student(String n){
		Name = n;
	}
}

//a blueprint we use this block //

class StudentDemo{
	public static void main(String[] ar){
		System.out.println("From StudentDemo Class");
		System.out.println("Create an Object of Student Class");
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println("Create an Object of Student Class");
		
		s1.Name = "nav";
		s1.marks = 95;
		
		System.out.println("Name Value of the object is: " + s1.Name);
		System.out.println("marks Vlaue of the object is: " + s1.marks);
		
		s2.Name = "batman";
		s2.marks = 100;
		
		System.out.println("Im " + s2.Name);
		
		Student s4 = new Student("naveen",45);
		System.out.println(s4.Name);
		
		
		Student s5 = new Student("mal");
		System.out.println(s5.Name);
		
		
	}
}
