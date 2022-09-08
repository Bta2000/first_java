
import java.util.*;
public class PR1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        ///////////////////////////////////////////////first program//////////////////////////////////////////////////

        // The star pattern until n :
        //* 
        //* * 
        //* * * 
        //..........

        System.out.println("Enter number of row of stars : \n");
        int n = input.nextInt();

        for(int i=1;i<=n;i++){  

            for(int j=1;j<=i;j++){  

                System.out.print(" * ");  
                    
            }  
            //to go new line
            System.out.println();  

        }  

        System.out.println();

        System.out.println(".....................................................................\n");

        //////////////////////////////////////////////second program////////////////////////////////////////////////////

        //Find divosors of num
        System.out.println("Find divosors of n & check is it prime number or not : \n");
        System.out.println("enter your number : ");
        int num = input.nextInt();
        for(int j=1;j<=num;j++){
            if(num % j == 0){
                System.out.format("%d\t",j);
            }
        }
        System.out.println(" ");


        System.out.println(".....................................................................\n");

        //////////////////////////////////////////////Third program/////////////////////////////////////////////////////

        // Check prime number
        int count = 0;
        for(int k=1;k<=num;k++){
            if(num % k == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.format("the number %d is a prime number\n", num);
        }
        else{
            System.out.format("the number %d is not a prime number\n", num);
        }


        System.out.println(".....................................................................\n");

        
        ///////////////////////////////////////////////////fourth program//////////////////////////////////////////////////////

        //to Check Palindrome Number
        // for example 545,5554555,323,...
        System.out.println("Check Palindrome Number\n");

        System.out.println("Enter your number to check Palindrome Number : \n");
        int m = input.nextInt();
        int org = m;
        int reverse = 0;
        
        //to find reverse
        while(m != 0){

            int remainder = m % 10;  
            reverse = reverse * 10 + remainder;  
            m = m/10;

        }

        if(org == reverse){
            System.out.format("%d is a Palindrome number\n",org);
        }else{
            System.out.format("%d is not a Palindrome number\n",org);
        }






    }


    
}
