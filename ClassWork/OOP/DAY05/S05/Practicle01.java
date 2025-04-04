class Paper{
	int length,width;
	String text;
}

class Document{
	String name;
	Paper p;
	
	public static void main (String[] args){
			Document d=new Document();
			System.out.println("Created a Document Object d");
			d.name = "My First Document";
			System.out.println("Name of the Document d is : " + d.name);
			d.p=new Paper();
			d.p.text = "This is the text in the paper of the document" + d.name);
			System.out.println("Size (l * w ) of the paper the document d is " + d.p.length + "*" + d.p.width);
			
			Document d2=new Document();
			System.out.println("Created a object d2");
			d2.name = "My Second Documnet";
			System.out.println("Name of my Second Document is : "+d2.name);
	}
}