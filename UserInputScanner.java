
import java.util.Scanner;

public class UserInputScanner{
	public static void main(String[] args){
		Scanner kin = new Scanner(System.in);
System.out.print("What is your name? ");
String name = kin.nextLine();
System.out.print("What is your last name?");
String lastName = kin.nextLine();
System.out.println("Hello " + name +  lastName + ", it's nice to meet you!");
System.out.print("What is your stret address?");
String address = kin.nextLine();
System.out.print("What is you City?");
String city = kin.nextLine();
System.out.print("What is your State?");
String state = kin.nextLine();
System.out.print("What is your Zip?");
String zip = kin.nextLine();
System.out.println(name + " " + lastName );
System.out.println(address);
System.out.println(city state zip);
    }
}
