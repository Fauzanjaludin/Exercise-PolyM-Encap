package encapsulation;

//import java.util.Scanner;

public class main {


		public static void main(String[] args) {
			//Scanner myObj = new Scanner(System.in);
			saga s=new saga();
			//System.out.print("Enter Model (lowercase):");
			
			//String name = myObj.next();
			
			//myObj.close();
			
			
			//switch(name) {
			//case "saga":
			System.out.println("Proton Saga");
			s.wheels();
			s.FuelEffiecient();
			s.petrol();
			s.powerwindow();
			s.tyresaga();
			s.setradio("Tek");
			System.out.println("Radio Brand: "+s.getradio());
			s.run();
			s.price(16,57);
			s.defColor();
			s.transmission();
			//break;
			
			//case "x70":
			x70 x=new x70();
			
			System.out.println("Proton X70");
			x.tyre();
			x.AutoPark();
			x.wheels();
			x.petrol();
			x.powerwindow();
			x.price(16,57,99);
			x.defColor();
			x.setcheight("1.69 m");
			x.run();
			x.transmission();
			System.out.println("Car height : "+x.getcheight());
			
			//break;
			
			//case "x50":
			System.out.println("Proton X50");
			x50 x5=new x50();
			x5.tyre();
			x5.feat();
			x5.petrol();
			x5.price(69,420,360);
			x5.defColor();
			x5.setglass("A+");
			System.out.println("Window glass Quality : "+x5.getglass());
			x5.run();
			x5.transmission();
			//break;
			
			//default:
				//System.out.println("Wrong");
			//break;
			
		//}
			
	

	
		
		}
}
