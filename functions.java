// import java.util.*;
// public class functions{

//     public static int sum(int a,int b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter first number :");
//         int a = sc.nextInt();
//         System.out.println("Enter second number :");
//         int b = sc.nextInt();

//         int sum = sum(a,b);
//         System.out.println(sum);

//     }
// }
















// import java.util.*;
// public class functions{

//     public static void swap(int a,int b){
//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println("a = " + a);
//         System.out.println("b = " + b);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = 5;
//         int b = 10;

//         swap(a, b);

//         System.out.println("a = " + a);
//         System.out.println("b = " + b);

//     }
// }

















// import java.util.*;
// public class functions{

//     public static int multiply(int a, int b){
//         return a*b;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter first number :");
//         int a = sc.nextInt();

//         System.out.println("Enter second number :");
//         int b = sc.nextInt();

//         int product = multiply(a, b);
//         System.out.println(product);
//     }
// }

















// import java.util.*;
// public class functions{

//     public static int fact(int n){
//         int f = 1;
//         for (int i=1; i<=n; i++){
//             f = f*i;
//         }
//         return f;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number :");
//         int n = sc.nextInt();
//         int fact = fact(n);
//         System.out.println(fact);
//     }
// }














// nCr CALCULATOR



// import java.util.*;
// public class functions{


//     public static int factorial(int n){
//         int f = 1;
//         for (int i=1; i<=n; i++){
//             f = f*i;
//         }
//         return f;
//      }



//      public static int binomial_coefficient(int n, int r){
//         int n_fact = factorial(n);
//         int r_fact = factorial(r);
//         int nmr_fact = factorial(n-r);

//         int bin_coeff = n_fact/(r_fact * nmr_fact);
//         return bin_coeff;
//      }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter value of n :");
//         int n = sc.nextInt();

//         System.out.println("Enter value of r :");
//         int r = sc.nextInt();

//         int ncr = binomial_coefficient(n,r);
//         System.out.println("binomial coefficient is : " + ncr);

//     }
// }














// FUNCTION OVERLOADING USING PARAMETERS


// import java.util.*;
// public class functions{

//     public static int sum(int a, int b){
//         return a+b;
//     }

//     public static int sum(int a, int b, int c){
//         return a+b+c;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println(sum(3,4)); 
//         System.out.println(sum(3,4,5)); 

//     }
// }














// FUNCTION OVERLOADING USING DATA TYPES


// import java.util.*;
// public class functions{

//     public static int sum(int a, int b){
//         return a+b;
//     }

//     public static float sum(float a, float b){
//         return a+b;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println(sum(3,4)); 
//         System.out.println(sum(3.1f,4.6f)); 

//     }
// }













//  AVERAGE OF THREE NUMBERS


// import java.util.*;
// public class functions{

//     public static void average(int a, int b, int c){
//         float average = (a+b+c)/3f;
//         System.out.println("average is " + average);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the first number :");
//         int a = sc.nextInt();

//         System.out.println("Enter the second number :");
//         int b = sc.nextInt();

//         System.out.println("Enter the third number :");
//         int c = sc.nextInt();

//         average(a, b, c);

//     }
// }















import java.util.*;
public class functions{

    public static boolean iseven(int number){
        if (number % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int number = sc.nextInt();
        System.out.println(iseven(number));

    }
}































// import java.util.*;
// public class functions{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        

//     }
// }