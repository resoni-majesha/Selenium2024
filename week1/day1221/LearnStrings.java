package week1.day1221;

public class LearnStrings {

	public static void main(String[] args) {
		
                String str1 = "Welcome"; // Declare using string literal
                
                String str2 = "Welcome";
                
                String str3 = new String("Welcome"); // Declare using new keyword
                
                System.out.println(str1 == str2); // Will compare the memory address of the variable - same memory
                
                System.out.println(str1 == str3); // Different memory address
                
                System.out.println(str1.equals(str2)); // To compare the value
                
                System.out.println(str1.equals(str3));
                
                String str4 = "welcome";
                
                System.out.println(str1.equals(str4));
                
                System.out.println(str1.equalsIgnoreCase(str4)); // To ignore the case sensitive
                
                System.out.println(str1+str4); // To concatenate 2 string
                
                int num = 123;
                
                System.out.println(str1+num ); // Concatenates 2 diff datatype
                
                System.out.println(str1.concat(str4));
                
                String str5 = "COME"; // If t is COME123, then it will print false
                
                System.out.println(str1.contains(str5));
                
                // 0,1,2,3,4,5,6
                String str6 ="Welcome"; // Each character in string saved with index. Index starts with 0
                
                System.out.println(str6.length()); // To get the number of characters in the string
                
                System.out.println(str6.length()-1); // length()-1 to get the last character
                
                System.out.println(str6.charAt(3)); // To get single char
                
                System.out.println(str6.charAt(str1.length()-1)); // To get the last character
                
                String str7 = "Welcome";
                
                // To print the string in reverse order
                
                for (int i = str7.length()-1; i >= 0; i--) {
                	
                	System.out.print(str7.charAt(i)); // Remove ln to print in the same line
					
				}
                
                String str8 = "Welcome";
                
                // Another method to print string in reverse order
                
                char[] charArray = str8.toCharArray(); //It will convert the string into character of array
                
                for (int i = charArray.length-1; i >= 0; i--) {
                	
					System.out.println(charArray[i]);
                	
				}
                
        	   String str9 = "Welcome";
        	   
        	   System.out.println(str1.replace("e", "x"));
        	   
        	   // To find the number of occurence of character 'e'
        	   
        	   String str10 = "Welcome";
        	   
        	   int length1 = str10.length();
        	   
        	   String replace = str10.replace("e", "");
        	   
        	   int length2 = replace.length();
        	   
        	   System.out.println(length1 - length2);
        	   
        	   String str11 = "Welcome123";
        	   
        	   System.out.println(str11.replaceAll("[0-9]", "")); 
        	   
        	   System.out.println(str11.replaceAll("[a-zA-Z]", ""));
        	   
        	   String str12 = "Welcome";
        	   
        	   System.out.println(str12.substring(3)); // Print from beginning from index 3 to end
        	   
        	   System.out.println(str12.substring(2,6)); // Print from 2 to 5
        	   
        	   String str13 = "Welcome to Java Session";
        	   
        	   String[] split = str13.split(" "); // Whenever there is a space it will split
        	   
        	   System.out.println(split[2]); // Check until index 2
        }
		
	}


/*
true
false
true
true
false
true
Welcomewelcome
Welcome123
Welcomewelcome
false
7
6
c
e
emocleWe
m
o
c
l
e
W
Wxlcomx
2
Welcome
123
come
lcom
Java
*/


/*
 * String is a sequence of characters
 * String is a class
 * Non - Primitive Data Type
 * 
 * 2 ways to declare a string
 * 1. String Literal
 * 2. New keyword
 * 
 * String str1 = "Welcome"; 
 * String str2 = "Welcome";
 * Here, for str1, str2 - the values are same "Welcome", if the values are same for 2 variables, then
 * Java will check the string constant pool in the memory
 * Whenever we declare using string literal, the value will be stored in an area called string constant pool
 * 
 * If we create another string using new keyword with same value "Welcome", it will be created in the heap memory
 * So, the memory address of the string literal and heap memory will be different
 * 
 * equals() - Method to compare 2 values
 * equalsIgnoreCase() - to compare values of 2 string by ignoring the case
 * concat() - to concatenate 2 diff datatypes
 * contains() - to compare partially
 * length() - To get the number of characters in the string
 * charAt(index) - To get the single character from the string
 * toCharArray() - to convert the string into character array (char[])
 * replace() - to replace old char with a new char
 * replaceAll() - with regEx
 * subStr()
 * split()
 * 
*/
