import java.util.*;
public class array_2D{


    public static void search_matrix(int matrix[][],int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("fount at cell (" + (i+1) + "," + (j+1) + ")");
                }
            }
        }
        System.out.println("key not fount");
    }






    public static void print_spiral(int matrix[][]){
        int start_row = 0;
        int start_col = 0;
        int end_row = matrix.length-1;
        int end_col = matrix[0].length-1;

        while(start_row <= end_row && start_col <= end_col){

            // top
            for(int j=start_col; j<=end_col; j++){
                System.out.print(matrix[start_row][j] + " ");
            }

            // right
            for(int i=start_row+1; i<=end_row; i++){
                System.out.print(matrix[i][end_col] + " ");
            }

            // bottom
            if(start_row == end_row){
                break;
            }
            for(int j=end_col-1; j>=start_col; j--){
                System.out.print(matrix[end_row][j] + " ");
            }

            // left
            if(start_col == end_col){
                break;
            }
            for(int i=end_row-1; i>=start_row+1; i--){
                System.out.print(matrix[i][start_col] + " ");
            }

            // condition update
            start_row ++;
            start_col ++;
            end_row --;
            end_col --;

        }
        System.out.println();
    }




    public static void diagonal_sum(int[][] matrix){

        // FOR BOTH DIAGONAL SUM SEPARATELY AND THEN COMBAINED
        int size = matrix.length;
        int primary_diagonal_sum = 0;
        int secondary_diagonal_sum = 0;
        int diagonal_sum = 0;

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(i==j){
                    primary_diagonal_sum += matrix[i][j];
                }
                if(i+j == size-1){
                    secondary_diagonal_sum += matrix[i][j];
                }
            }
        }
        if(size % 2 != 0){
            diagonal_sum = primary_diagonal_sum + secondary_diagonal_sum - matrix[(size-1)/2][(size-1)/2];
        }
        else{
            diagonal_sum = primary_diagonal_sum + secondary_diagonal_sum;
        }
        System.out.println("sum of primary diagonal = " + primary_diagonal_sum);
        System.out.println("sum of secondary diagonal = " + secondary_diagonal_sum);
        System.out.println("sum of both the diagonals = " + diagonal_sum);

        // FOR DIAGONAL SUM ONLY 
        // int sum = 0;
        // int size = mat.length - 1;
        // for(int i=0; i<=size; i++){
        //     for(int j=0; j<=size; j++){
        //         if(i==j || (i+j)==size){
        //             sum += mat[i][j];
        //             System.out.println(sum);
        //         }
        //     }
        // }

    }



    public static void diagonal_sum_one_loop(int[][] matrix){

        // UZAIR
        int sum = 0;
        int size = matrix.length - 1;
        for(int i=0; i<=size; i++){
            sum += matrix[i][i] + matrix[i][size-i];
        }
        if((size+1) % 2 != 0){
            sum -= matrix[size/2][size/2];
        }
        System.out.println(sum);

        // RASHID
//         int sum=0;
//         for(int i=0,j=0;i<matrix.length;i++,j++){
//             sum=sum+matrix[i][j];
//         }
//         int j=matrix.length-1;
//         for(int i=0;i<matrix.length && j>=0 ; i++,j--){
//             if(i==j)
//             continue;

//             sum=sum+matrix[i][j];
//         }
//         return sum;
//     }



    }


// TIME COMPLEXITY IS O(N+M)  MAXIMUM DISTANCE TRAVELED IS N+M
// FOR A MATRIX N>>>M TIME COMLEXITY IS O(N)
// FOR A MATRIX M>>>N TIME COMLEXITY IS O(M)
    public static void search_sorted_matrix_topRight(int[][] matrix,int key){
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        int n=0;
        int cell;
        while(n<=row && col >=0){
            cell = matrix[n][col];
            if(cell == key){
                System.out.println("Index of key is [" + row + "," + col + "]");
                break;
            }
            else if(key > cell){
                n++;
            }
            else if(key < cell){
                col--;
            }
        }
        if(!(n<=row && col >=0)){
            System.out.println("Key not found");
        }
    }
    




    public static void search_sorted_matrix_bottomLeft(int [][] matrix, int key){
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        int n=0;
        int cell;
        while(row>=0 && n<=col){
            cell = matrix[row][n];
            if(cell == key){
                System.out.println("Index of key is [" + row + "," + col + "]");
                break;
            }
            else if(key > cell){
                n++;
            }
            else if(key < cell){
                row--;
            }
        }
        if(!(row>=0 && n<=col)){
            System.out.println("Key not found");
        }
    }


















    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        

        // int matrix[][] = new int[3][3];
        // int n = matrix.length;
        // int m  = matrix[0].length;


        // // input
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }


        // // output
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        // // search
        // search_matrix(matrix, 5);



        //print spiral
        // int matrix[][] = {{1,2,3,4},
        //                   {5,6,7,8},
        //                   {9,10,11,12},
        //                   {13,14,15,16}};

        // print_spiral(matrix);


        // diagonal sum (always nxn matrix only)(no diagonall for nxm matrix)
        // int matrix1[][] = {{1,2,3,4},
        //                   {5,6,7,8},
        //                   {9,10,11,12},
        //                   {13,14,15,16}};

        // int matrix2[][] = {{1,2,3},
        //                   {4,5,6},
        //                   {7,8,9}};

        // // diagonal_sum(matrix1);
        // // diagonal_sum(matrix2);

        // diagonal_sum_one_loop(matrix1);



        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        
        // search_sorted_matrix_topRight(matrix,33);
        search_sorted_matrix_bottomLeft(matrix, 30);









    }
}