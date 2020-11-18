package encapsulation;

public class proton {
	String brand;
	int tyre;
	
	proton(){
	this.brand="Goodyear";
	this.tyre=14;
	
	}
	
	proton(int t,String b){
	this.brand=b;
	this.tyre=t;	
	}	
	
	
	public void wheels() {
		System.out.println("This car is Front wheel drive");
	}
	
	public void petrol() {
		System.out.println("This car uses petrol");
	
	}
	
	public void powerwindow() {
		System.out.println("This car has power window");
		
	}
	
	void run() {//polymorphism
		System.out.println("The vehicle is running!");
	}	
	
	void transmission() {
		System.out.println("Transmission : Manual And Auto ");
	}
	
	void price(int p1, int p2) {
		System.out.println("Price :"+(p1+p2));
	}
	void price(int a1, int a2,int a3){//overload
		System.out.println("Price :"+(a1+a2+a3));
	}	
	
	void defColor() {
		System.out.println("default color: Milky White");
	}
	
}
