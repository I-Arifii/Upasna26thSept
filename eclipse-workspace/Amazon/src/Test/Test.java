package Test;

import java.util.Scanner;

import Customer.Customer;

public class Test {
	
	public static void main (String[] args) {
		Customer cust1=new Customer();
		//create new object and allocates memory to it
		cust1.username="Ismail";
		cust1.password="TreesAreBlue";
		cust1.email="Ismail@gmail.com";
		cust1.phone=27278338;
		cust1.address="London";
		cust1.changePassword();
		
		Customer cust2=new Customer();
		cust2.username="Bearr";
		cust2.password="MawlingisFun";
		cust2.email="Bearforhire@gmail.com";
		cust2.phone=44847354;
		cust2.address="Mountain";
		
		Customer cust3=new Customer();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter username");
		cust3.username=scn.nextLine();
		System.out.println("Enter password");
		cust3.password=scn.nextLine();
		System.out.println("Enter email");
		cust3.email=scn.nextLine();
		System.out.println("Enter phone");
		cust3.phone=scn.nextLong();
		System.out.println("Enter address");
		cust3.address=scn.nextLine();
		
		Customer cust4=new Customer();
		
		
		
	}

}
