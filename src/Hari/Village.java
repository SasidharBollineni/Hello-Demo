package Hari;

//Parent class
class Summer{
	void travelling() {
		System.out.println("Travelling for summer holidays");
	}
}
//child class
class Arun extends Summer{
	void travelling() {
		System.out.println("Arun is enjoy summer holidays in Araku");
	}
}
class Kiran extends Summer{
	void travelling() {
		System.out.println("Kiran will visit Ooty and Kodaicanal");
	}
}
class Sandya extends Summer{
	void travelling() {
		System.out.println("Sandya went to Bombay for summer holidays");
	}
}
//Main class
public class Village {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Summer s = new Summer();
		s = new Arun();
		s.travelling();
		s = new Kiran();
		s.travelling();
		s = new Sandya();
		s.travelling();
		

	}

}
