import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		String fName;
		String lName;
		Scanner t=new Scanner(System.in);
		System.out.println("What is your first Name?");
		fName=t.nextLine();
		System.out.println("What is your last Name?");
		lName=t.nextLine();
		System.out.println("Your full name is "+ fName + " "+ lName);

	}

}
