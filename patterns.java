import java.util.*;
import java.util.concurrent.TimeUnit;
public class patterns{
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        // ****
        // ****
        // ****
        // ****

        // for(int line=1; line<=4; line++){
        //     System.out.println("****");
        // }





        // *
        // **
        // ***
        // ****

        // for(int line = 1; line<=4; line++){
        //     for(int star=1; star<=line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }





        // ****
        // ***
        // **
        // *

        //     int n = 4;
        //     for(int i=1; i<=n ; i++){
        //         for(int j=1; j<=n-i+1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }






        // 1
        // 12
        // 123
        // 1234

        // int n = 4;
        // for(int i= 1; i<=n; i++){
        //         for(int j=1; j<=i; j++){
        //             System.out.print(j);
        //         }
        //         System.out.println();
        //     }





        // A
        // BC
        // DEF
        // GHIJ

        // int n = 5;
        // char ch = 'A';
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }






        // *****
        // *   *
        // *   *
        // *****

        // int n = 4;
        // int m = 5;
        // for (int i=1; i<=n; i++){
        //     for(int j=1; j<=m; j++){
        //         if(i == 1 || i == n || j == 1 || j == m){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }





        //    *
        //   **
        //  ***
        // ****


        // int n = 4;

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for (int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }






        // 12345
        // 1234
        // 123
        // 12
        // 1

        // int n = 5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }






        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15


        // int n = 5;
        // int k = 1;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(k + " ");
        //         k++;
        //     }
        //     System.out.println();
        // }






        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1


        // int n = 5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         if((i+j) % 2 == 0){
        //             System.out.print("1 ");
        //         }
        //         else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }






        // *             * 
        // * *         * * 
        // * * *     * * * 
        // * * * * * * * * 
        // * * * * * * * * 
        // * * *     * * * 
        // * *         * * 
        // *             * 


        // int n = 4;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }

        //     for(int j=1; j<=2*(n-i); j++){
        //         System.out.print("  ");
        //     }

        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }

        //     for(int j=1; j<=2*(n-i); j++){
        //         System.out.print("  ");
        //     }

        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }







        //           * * * * * 
        //         * * * * * 
        //       * * * * * 
        //     * * * * * 
        //   * * * * * 


        // int n = 5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }

        //     for(int j=1; j<=n; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }





        //           * * * * * 
        //         *       *
        //       *       *
        //     *       *
        //   * * * * *

  
        // int n = 5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }

        //     for(int j=1; j<=n; j++){
        //         if( i == 1 || i == n || j == 1 || j == n ){
        //         System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }





        //       *
        //     * * *
        //   * * * * *
        // * * * * * * *
        // * * * * * * *
        //   * * * * *
        //     * * *
        //       *


        // int n = 4;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }

        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }

        //     for(int j=1; j<=i-1; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }

        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }

        //     for(int j=1; j<=i-1; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


// SECOND METHOD WITH LESS LOOPS (MY METHOD)

        // int n = 4;
        // int m = 0;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }

        //     for(int j=1; j<=i+m; j++){
        //         System.out.print("* ");
        //     }
            
        //     System.out.println();
        //     m++;
        //     if(m  == n+m){
        //         break;
        //     }
        // }

        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }

        //     for(int j=1; j<=i+m-1; j++){
        //         System.out.print("* ");
        //     }
            
        //     System.out.println();
        //     m--;
        //     if(m  == n+m){
        //         break;
        //     }
        // }


// THIRD METHOD WITH LESS LOOPS AND LESS VARIABLE (BEST (APLHA 3.0))

        // int n = 4;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }

        //     for(int j=1; j<=(2*i)-1; j++){
        //         System.out.print("* ");
        //     }
            
        //     System.out.println();
        // }

        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }

        //     for(int j=1; j<=(2*i)-1; j++){
        //         System.out.print("* ");
        //     }
            
        //     System.out.println();
        // }








































    }
}
