import java.util.*;
public class practice_questions

 {
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


/* Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N) */

/* 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = (a+b+c)/3;
        System.out.println("average is :"+ avg);

*/

/*Question 2: In a program, input the side of a square. You have to output the area of the
square.
(Hint : area of a square is (side x side)) */

/* 
        int side = sc.nextInt();
        float area = (float)(side*side);
        System.out.println("area is :"+ area);

*/

/*Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

/* 
    float pencil = sc.nextFloat();
    float pen = sc.nextFloat();
    float eraser = sc.nextFloat();
    float total = (float)pencil+pen+eraser;
    float total_after_gst = total+ (float)(0.18*total);

    System.out.println("Price of pencil : "+ pencil);
    System.out.println("Price of pen : "+ pen);
    System.out.println("Price of eraser : "+ eraser);
    System.out.println("Total price : "+ total);
    System.out.println("Total price + GST : "+ total_after_gst);

*/        

/*calculator */
/* 
    int answer = 0;
    System.out.println("Enter A ");
    int A = sc.nextInt();

    System.out.println("Select -->  +,-,*,/,%");
    char oprator = sc.next().charAt(0);

    System.out.println("Enter B ");
    int B = sc.nextInt();
    switch(oprator){
        case '+' : answer = (int)A+B;
        break;
        case '-' : answer =  (int)A-B;
        break;
        case '*' : answer =  (int)A*B;
        break;
        case '/' : answer =  (int)A/B;
        break;
        case '%' : answer =  (int)A%B;
        break;
        default : System.out.println("choose from the given options");

    }
    if (oprator == '+' || oprator == '-' || oprator == '*' || oprator == '/' || oprator == '%' ){
    System.out.print(A);    
    System.out.print(oprator);    
    System.out.print(B);
    System.out.print(" is " + answer);
    }
*/

/*Question 5 : Write a Java program that takes a year from the user and print whether that
year is a leap year or not */
/* 
    System.out.println("Enter a year");
    int year = sc.nextInt();

    if (year % 4 ==0 && year % 100 != 0){
        System.out.println(year + " is a leap year");
    }
    else if (year % 4 ==0 && year % 100 == 0){
        if (year % 400 == 0){
        System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }
    else{
        System.out.println(year + " is not a leap year");
    }
*/        
    }
}

