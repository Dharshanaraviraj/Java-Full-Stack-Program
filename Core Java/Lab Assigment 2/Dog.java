package Assigment;

public class Dog {
	String dogName;
	String dogBreed;
	
	Dog(String dogName,String dogBreed) {
		this.dogName = dogName;
		this.dogBreed = dogBreed;
	}

	void setName(String dogName) {
		this.dogName=dogName;
	}
	
	void setBreed(String dogBreed) {
		this.dogBreed=dogBreed;
	}
	
	void getName(String dogName) {
		this.dogName=dogName;
	}
	
	void getBreed(String dogBreed) {
		this.dogBreed=dogBreed;
	}
	
	void display(){
		 System.out.println("DogName : " + dogName);
	     System.out.println("DogBreed : " + dogBreed);
	}
	public static void main(String[] args) {
		Dog dog1 = new Dog("Boochi","Indi");
		Dog dog2 = new Dog("Puppy","Retriever");
		
		System.out.println("Original Variety : ");
		dog1.display();
		dog2.display();
		
		dog1.setName("Shero");
		dog1.setBreed("shitzhu");
		
		dog2.setName("Milo");
		dog2.setBreed("Toddler");
		
		
		System.out.println("Updated Variety");
		dog1.display();
		dog2.display();
		
	}

}
