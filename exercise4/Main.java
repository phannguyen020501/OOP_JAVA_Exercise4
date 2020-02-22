package exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		Scanner sc4=new Scanner(System.in);
		Scanner sc5=new Scanner(System.in);
		Scanner sc6=new Scanner(System.in);
		Scanner sc7=new Scanner(System.in);
		System.out.println("Enter number of families at the town:");
		int n=sc1.nextInt();
		Town town=new Town();
		List<Family> famiList=new ArrayList<Family>();
		for(int i=0;i<n;i++) {
			//input for eachFamily
			System.out.println("Input family: "+(i+1));
			System.out.println("Enter address:");
			String address=sc2.nextLine();
			//enter person number in family
			List<Person> people=new ArrayList<Person>();
			System.out.println("Enter number of people :");
			int number=sc3.nextInt();
			for(int j=0;j<number;j++) {
				System.out.println("Input person"+(j+1));
				System.out.println("Enter name:");
				String name=sc4.nextLine();
				System.out.println("Enter age:");
				int age=sc5.nextInt();
				System.out.println("Enter job:");
				String job=sc6.nextLine();
				System.out.println("Enter id:");
				String id=sc7.nextLine();
				Person ps=new Person(name, age, job, id);
				people.add(ps);
			}
			Family fami=new Family(address, people);
			famiList.add(fami);
			town.setFamilies(famiList);
		}
		
	}

}
