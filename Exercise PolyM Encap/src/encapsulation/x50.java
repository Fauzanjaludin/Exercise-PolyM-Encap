package encapsulation;

public class x50 extends x70 {

	public void feat() {
		x70 x=new x70();
		
		System.out.println(x.autop+"\n"+x.suv);
	}
	
	void defColor() {
		System.out.println("default color: Gunmetal");
	}
	
	private String glass;
	
	public String getglass() {//encapsulation getter
		return glass;
	}
	
	public void setglass(String g) {//encapsulation setter
		this.glass=g;
	}
	
	void run() {//polymorphism
		super.run();
		System.out.println("The x50 is Running!");
		
	}
	
	void transmission() {
		
		System.out.println("Transmission : 7 speed Auto ");
		
	}
	
}
