package week3.day3221;

public class LearnMultipleInheritance {

}

/*
 * How to achieve multiple inheritance
 * A single child
 * 
 *       Class A                                    Class B
 *       
 *                            Class C
 * Class C extends Class A
 * Class C extends Class B                           
 *                         
 * If both super class Class A, Class B has the same method name m1, m1 ->then its a conflict
 * It is not possible at the class level
 * But, Class A m1(){}, Class B m1(){} have some implementation which is not possible to inherit
 * Imagine A and B are interface
 * 
 *      Interface A                                    Interface B
 *       
 *                            Class C
 * 
 * Interface A - m1(); & Interface B - m1();
 * Class C {
 *    m1() {
 *    
 *    }
 * }
 * 
 * It won't make any conflict, as we declare the interface m1() and writing the code inside the class for the same m1() method
 * Create 2 interface Mother, Wife
 * And a class named Home
 */
