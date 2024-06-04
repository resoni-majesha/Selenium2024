package week1.day124;

public class ControlStatements {

	public static void main(String[] args) {
		
		int number = 0;
		
		if(number > 0) {
			
			System.out.println("Positive Number");
		} else if(number == 0) {
			
			System.out.println("Neutral Number");
			
		} else {
			System.out.println("Negative Number");
		}

	}

}

// Output : Neutral Number

/*
 * Control Statement
 * 
 * define the flow of the program
 * Provide the basic flow
 * Control - Selection, Iteration & Jump
 * Selection - if else - when yu have few conditions Report - Pass/Fail, 
 * switch case - Launch based on browser types - when I've multiple conditions
 * Iteration - for, for each, while, do while
 * Jump - break, continue
 * 
 * if else syntax
 * 
 * if(x > y){
 * 
 * }
 * 
 * if
 * 
 * int age = 18;
 * if(age>=18){
 *  syso("vote")
 * }else {
 *  syso("Not vote")
 * }
 * 
 * if, else if, else
 * 
 * int mark = 0;
 * if(mark>=35){
 *  syso("pass");
 * } else if(marks < 35){
 *  syso("fail);
 * }else {
 *  syso("absent");
 * }
 * 
 */