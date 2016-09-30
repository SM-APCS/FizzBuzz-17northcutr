
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
        for(int i=1; i<100; i++){
            if(i%3 == 0){
                if(i%5 == 0){
                    System.out.println("FizzBuzz");
                }
                System.out.println("Fizz");
            }
            else if(i%5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
    
}
