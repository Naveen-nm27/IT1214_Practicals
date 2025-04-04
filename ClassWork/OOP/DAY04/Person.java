public class Person{
	private string name;
	
	//getter
	public String getName(){
		return name;
	}
	
}

//SETTER
public void setName(String newName){

this.name = newName;
	
}

public class Main{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.name = "john";
		System.out.println(p1.getName());
		
	}
}