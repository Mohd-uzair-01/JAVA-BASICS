import java.util.*;
public class basics{

    public static void check(int[] banned, int n, int maxSum) {
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = i+1; 
        }
        for(int i=0; i<banned.length; i++){
            if(banned[i] <= n){
                arr[banned[i]-1] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        int count = 0;
        int sum = 0;
        int checkSum = 0;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] == 0){
                continue;
            }
            checkSum = sum += arr[i];
            if(checkSum <= maxSum){
                checkSum = 0;
                sum += arr[i];
                System.out.println(sum);
                count++;
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = 5;
        int[] arr = {1,6,5};
        int maxsum = 6;
        check(arr,n,maxsum);
        
        // System.out.println("hello world");
        // System.out.println("hello world");
        // System.out.println("hello world");

        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // int a= 10;
        // int b=5;
        // String name="uzair";
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(name);

        // a=50;
        // System.out.println(a);
        // a=b;
        // System.out.println(a);
      
        // int a= 10;
        // int b=5;
        // int sum=a+b;
        // System.out.println(sum);
          
        // String input = sc.next();
        // System.out.println(input);

        // String input = sc.nextLine();
        // System.out.println(input);
        
        // int input = sc.nextInt();
        // System.out.println(input);
         
        // float input = sc.nextFloat();
        // System.out.println(input);
         
        // boolean input = sc.nextBoolean();
        // System.out.println(input);
        
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println(sum);
        
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int product = a*b;
        // System.out.println(product);
        
        // int r = sc.nextInt();
        // float area = 3.14f*r*r;
        // System.out.println(area);
        
        // float a = 25.58f;
        // int b = (int) a;
        // System.out.println(b);
        
        // char a = '%';
        // int b = a;
        // System.out.println(b);
        
        // int a = 10;
        // int b = 5;
        // System.out.println("add = " + (a+b));
        // System.out.println("subtract = " + (a-b));
        // System.out.println("multiply = " + (a*b));
        // System.out.println("divide = " + (a/b));
        // System.out.println("remainder = " + (a%b));

        // int a = 10;
        // int b = ++a;
        // System.out.println(a);
        // System.out.println(b);

        // int a = 10;
        // int b = a++;
        // System.out.println(a);
        // System.out.println(b);
        
        // int a = 10;
        // int b = --a;
        // System.out.println(a);
        // System.out.println(b);
        
        // int a = 10;
        // int b = a--;
        // System.out.println(a);
        // System.out.println(b);

        // int a = 10;
        // int b = 5;
        // System.out.println(a==b);
        
        // int a = 10;
        // int b = 10;
        // System.out.println(a==b);
        
        // int a = 10;
        // int b = 5;
        // System.out.println(a!=b);
        
        // int a = 10;
        // int b = 10;
        // System.out.println(a!=b);
        
        // int a = 10;
        // int b = 5;
        // System.out.println(a>b);
        
        // int a = 10;
        // int b = 5;
        // System.out.println(a<b);










        // CONDITIONS

        // int a = 6;
        // int b = 5;
        // if (a>b){
        //      System.out.println("A is largest");
        // }
        // else{
        //     System.out.println("B is largest");
        // }
        

        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // if (n%2 == 0){
        //     System.out.println(n + " is Even");
        // }
        // else{
        //     System.out.println(n + " is Odd");
        // }


        // System.err.println("Enter your income");
        // int income = sc.nextInt();
        // int tax;
        // if (income < 500000){
        //     tax = 0;
        // }
        // else if (income >= 500000 && income <= 1000000){
        //     tax = (int) (income * 0.2);
        // }
        // else{
        //     tax = (int) (income * 0.3);
        // }
        // System.err.println("Your tax is : " + tax);


        // int n = 4;
        // String type = (n%2==0)?"even":"odd";
        // System.err.println(type);


        // int number = 2;
        // switch(number){
        //     case 1 : System.err.println("samosa");
        //     break;
        //     case 2 : System.err.println("burger");
        //     break;
        //     case 3 : System.err.println("mango shake");
        //     break;
        //     default : System.err.println("wake up !!!");
        // }










        // LOOPS

        // int counter = 0;
        // while(counter<=100){
        //     System.out.println(counter);
        //     counter++;
        // }


        // System.out.println("Enter the last number");
        // int counter = sc.nextInt();
        // int n = 1;
        // while(n<=counter){
        //     System.out.println(n);
        //     n++;
        // }


        // System.out.println("Enter the last number");
        // int counter = sc.nextInt();
        // int i = 1;
        // int sum = 0;
        // while(i<=counter){
        //     sum = sum + i;
        //     i++;
        // }
        // System.out.println(sum);


        // for(int i=1; i<=10; i++){
        //     System.out.println(i);
        // }


        // int counter = 1;
        // do{
        //     System.out.println(counter);
        //     counter++;
        // }
        // while(counter <= 10);


        // while(true){
        //     System.out.print("Enter a multiple of 10 : ");
        //     int number = sc.nextInt();
        //     if(number % 10 == 0){
        //         break;
        //     }
        // System.out.println(number);
        // }


        // do{
        //     System.out.print("Enter a multiple of 10 : ");
        //     int number = sc.nextInt();
        //     if(number % 10 == 0){
        //         break;
        //     }
        // System.out.println(number);
        // }
        // while(true);


        // do{
        //     System.out.print("Enter your number : ");
        //     int n = sc.nextInt();
        //     if (n % 10 == 0){
        //         continue;
        //     }
        //     System.out.println(n);           
        // }
        // while(true);

        

        // System.out.println("Enter the first number :");
        // int a = sc.nextInt();
        
        // System.out.println("Enter the second number :");
        // int b = sc.nextInt();

        // System.out.println(" Minimum is : " + Math.min(a,b));
        // System.out.println("Maximum is : " + Math.max(a,b));
        // System.out.println("Square root is : " + Math.sqrt(a));
        // System.out.println("a raise to power b is : " + Math.pow(a,b));
        // System.out.println("Absolute positive is : " + Math.abs(a));





















        // ARRAY

        





































    }
}