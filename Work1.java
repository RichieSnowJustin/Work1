import java.util.Scanner;

public class Work1 {
        //Declare variables
	double BasicStatistic;
	double ComputerNetworking;
	double Operatingsystem;
	double WebDesign;
	double ResearchMethods;
	double ObjectOrientedProgramming;
	double SystemAnaysisandDesign;
//The end of variable
	
	public static void main(String[] args) { // This is main method.
		
		Scanner S = new Scanner(System.in); // Calling user input from the the keybroard
		
		System.out.println("this is dailyincome");
		System.out.println("===================");
		
		System.out.println("Enter BasicStatistic marks");
		double BasicStatistic = S.nextInt();
		
		System.out.println("Enter  Computer Networking marks");
		double Geographic = S.nextInt();
		
		System.out.println("Enter  Operatingsystem marks");
		double Operatingsystem = S.nextInt();
		
		System.out.println("Enter WebDesign marks");
		double WebDesign = S.nextInt();
		
		System.out.println("Enter ResearchMethods marks");
		double ResearchMethods = S.nextInt();
		
		System.out.println("Enter ObjectOrientedProgramming marks");
		double ObjectOrientedProgramming = S.nextInt();
		
		System.out.println("Enter SystemAnaysisandDesign marks");
		double SystemAnaysisandDesign = S.nextInt();
		
		double Total_Marks = BasicStatistic + Operatingsystem + WebDesign + ResearchMethods + ObjectOrientedProgramming + SystemAnaysisandDesign; 
		
		System.out.println("this is total marks:" + " " + Total_Marks);
		System.out.println("===================");
		
		double Average = Total_Marks /5;
		System.out.println("this is total Averge:" + " " + Average);
		System.out.println("===================");
		
		if (Average>=90) {
			System.out.println("Grade A+");
			
		}else if (Average >=80) {
			System.out.println("Grade A");
			
		}else if (Average >=75) {
			System.out.println("Grade B");
			
		}else if (Average >=65) {
			System.out.println("Grade c");
			
		}else if (Average >=55) {
			System.out.println("Grade D");
			
		}else if (Average >=30) {
			System.out.println("Grade F");
			
		}
		
	}


}

