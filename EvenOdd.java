import java.util.Scanner;
public class EvenOdd{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hi!, can you enter your name:");
        String st = scanner.nextLine();

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        if(num % 2 == 1)
        {
            System.out.println(num + ",Hooray....It's odd number!");
            
              if(num % 2 == 1 && num >= 32 && num <= 45)
              {
                  System.out.println("Hello beauty " + st);
              }
        }
        else if(num % 2 == 0)
        {
            System.out.println(num + ",Hooray....It's even number");
            
            if(num % 2 == 0 && num >= 25 && num <= 35)
            {
                System.out.println("No cryy....haaaa #alwayssmiles=)");
            }

        }
                        
    }
}