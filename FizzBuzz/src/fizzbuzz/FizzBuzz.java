
package fizzbuzz;

/**
 *
 * @author T.Rex Northcut
 * @class AP CSA
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1; i<100; i++){ //for loop to count to 100 from 1
            if(i%3 == 0){ //checks if i is divisible by 3
                if(i%5 == 0){ //if i is also divisible by 5 print FizzBuzz
                    System.out.println("FizzBuzz");
                }
                //else just print Fizz
                System.out.println("Fizz");
            }
            else if(i%5 == 0){ //if i wasn't divisible by 3, but is divisible by 5 print Buzz
                System.out.println("Buzz");
            }
            else{ //otherwise just print the number
                System.out.println(i);
            }
        }
    }
    
}
