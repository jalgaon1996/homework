package day9;
//wap to ask name ,age and salary of user using command line argument 
public class commandlineTest {

	public static void main(String[] args) {
 
		 String name=args[0];
		 int age    = Integer.parseInt(args[1]);
		 float salary= Float.parseFloat(args[2]);
		 
		 System.out.println(name + "  "+ age+" "+salary);


	}

}
