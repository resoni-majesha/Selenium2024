package week1.day221;

import java.util.Scanner;

public class GetDataFromUser {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //To read the read/ read the input, pass System.in args
		
		System.out.println("Enter the first number");
		
        int nextInt = scan.nextInt(); // Method to read an integer value
        
        System.out.println("Enter the second number");
        
        int nextInt2 = scan.nextInt();
        
        System.out.println(nextInt+nextInt2);
        
        System.out.println("Enter your name");
        
        String next = scan.next(); // if yu use, next it will take only reso, if yu use nextLine, then reso maje
        
        System.out.println(next);
		
	}

}

/*
Enter the first number
8
Enter the second number
9
17
Enter your name
reso maje
reso
*/

/*
Scanner class methods
=====================
byte - nextBytes()
short - nextShort()
int - nextInt()
long - nextlong()

float - nextfloat()
double - nextdouble()

boolean - nextBoolean()

char - next().charAt(0)
char - nextLine().charAt(0)

String - next()
String - nextLine()
*/