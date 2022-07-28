package InterviewProject;

import java.util.Scanner;

/**
 * 
 * @author travis hart
 *
 */

public class InterviewProject {
	static String mathFunction(int num1, int num2, int num3) {
		String operands = "";
        if(num1 + num2 == num3){
            operands += "+";
        }
        if(num1 - num2 == num3){
            operands += "-";
        }
        if(num1 * num2 == num3){
            operands += "*";
        }
        if(num1 / num2 == num3){
            operands += "/";
        }
        if(operands==""){
            operands += "None";
        }
        return operands;
    }
	    


	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int num1 = scnr.nextInt();
	
	System.out.print("Enter second number: ");
	int num2 = scnr.nextInt();
	
	System.out.print("Enter third number: ");
	int num3 = scnr.nextInt();
	
	scnr.close();
	
	System.out.println(InterviewProject.mathFunction(num1, num2, num3));
	
	}
}