import java.util.*;
public class array {

    



    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] += 1;
        }
    }





    public static int linear_search(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if (numbers[i] == key){
                return i;
            }
        }
        return -1;
    }





    public static int largest_number(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    
    
    
    
    
    public static int smallest_number(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }





    public static int binary_search(int numbers[], int key){
        int start = 0;
        int end = numbers.length-1;

        while (start <= end) {
            int mid = (start + end)/2;

            if (numbers[mid] == key){
                return mid;
            }
            if (numbers[mid] < key){
                start = mid+1;
            }
            else {
                end = mid-1;
            }

        }
        return -1;
    }





    public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;

        while(first < last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first ++;
            last --;
        }
    }





    public static void Pairs(int numbers[]){

        int total_pairs = 0;

        for(int i=0; i<numbers.length; i++){
            int current = numbers[i];

            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + current + "," + numbers[j] + ")");
                total_pairs ++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairts are : " + total_pairs);
    }





    // MY METHOD              
    public static void sub_arrays_M1(int numbers[]){
        int total = 0;
        int counter = 1;
        for(int i=0; i<numbers.length;i++){
            System.out.print("[" + numbers[i] + "] ");
            while(counter < numbers.length){

                System.out.print("[" + numbers[i]);
                
                for(int j=i+1; j<=counter; j++){
                    System.err.print("," + numbers[j]);
                }
                System.out.print("] ");
                total ++;
                counter ++;
            }
            total ++;
            counter = i+2;
            System.out.println();
        }
        System.out.println("Total subarrays are : " + total);
    }


    // APNA COLLAGE(ALPHA 3.0) METHOD           
    // no need of start and end take i and j direct

    public static void sub_arrays_M2(int numbers[]){
        int total = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;

            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k] + " ");
                }
                total ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays are : " + total);
    }




    // This method is brute force
    public static void max_sub_arrays_sum(int numbers[]){
        int total = 0;
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                System.err.print("[");
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k]);
                    if(k<j){
                        System.err.print(",");
                    }
                    sum += numbers[k];
                }
                System.err.println("]");
                System.err.println("Sum of the sub array is : " + sum);
                if(sum > max_sum){
                    max_sum = sum;
                }
                sum = 0;
                total ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays are : " + total);
        System.out.println("Max sum of sub array is : " + max_sum);
    }



    // PREFIX Array method

    public static void max_sub_arrays_sum_prefix_array(int numbers[]){
        int sum;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){

                if(i == 0){
                    sum = prefix[j];
                }
                else{
                    sum = prefix[j] - prefix[i-1];
                }
                if(max_sum < sum){
                    max_sum = sum;
                }
            }
        }
        System.err.println("Max sub array sum is : " + max_sum);
    }



    // KADANE'S ALGORITHM 

    public static void max_sub_arrays_sum_kadanes_algorithm(int numbers[]){
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;

        for(int i=0; i<numbers.length; i++){
            current_sum += numbers[i];
            if(current_sum < 0){
                current_sum = 0;
            }
            max_sum = Math.max(max_sum,current_sum);
        }
        System.out.println("Max subarray sum is : " + max_sum);
    }




    // KADANE'S ALGORITHM halndling all negetive numbers

    public static void max_sub_arrays_sum_kadanes_algorithm_all_negative(int numbers[]){
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        boolean positive = false;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > 0){
                positive = true;
                break;
            }
        }

        if(positive == true){
            for(int i=0; i<numbers.length; i++){
                current_sum += numbers[i];
                if(current_sum < 0){
                    current_sum = 0;
                }
                max_sum = Math.max(max_sum,current_sum);
            }
            System.out.println("Max subarray sum is : " + max_sum);
        }
        else{
            int max = Integer.MIN_VALUE;
            for(int i=0; i<numbers.length; i++){
                if(max < numbers[i]){
                    max = numbers[i];
                }
            }
            System.out.println("Max subarray sum is : " + max);
        }
    }





    public static void trapping_rainwater(int height[]){
        // calculate left max
        int left_max[] = new int[height.length];
        left_max[0] = height[0];

        for(int i=1; i<height.length; i++){
            left_max[i] = Math.max(height[i],left_max[i-1]);
        }

        // calculate right max
        int right_max[] = new int[height.length];
        right_max[height.length-1] = height[height.length-1];

        for(int i=height.length-2; i>=0; i--){
            right_max[i] = Math.max(height[i],right_max[i+1]);
        }

        // loop
        int trapped_water = 0;
        int water_level = 0;
        for(int i=0; i<height.length; i++){
            water_level = Math.min(left_max[i],right_max[i]);
            trapped_water += water_level - height[i];
        }
        System.err.println("Traped amount of water is " + trapped_water + " units");
    }





    public static void buy_and_sell_stocks(int prices[]){
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i=0; i<prices.length; i++){
            if(buy_price < prices[i]){
                int profit = prices[i] - buy_price;    //today's profit
                max_profit = Math.max(max_profit,profit);  //max profit
            }
            else{
                buy_price = prices[i];
            }
        }
        System.out.println(max_profit);
    }













    /**
     * @param args
     */
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);










        // UPDATING


        // int marks[] = {88,72,68,59,78};
        // update(marks);
        // for(int i=0; i<marks.length; i++){
        //     System.out.print(marks[i] + " ");
        // }
        // System.out.println();
        









        // LINER SEARCH


        // int numbers[] = {2,4,5,6,8,9,10,14,17,19};
        // int key = 10;
        // int index = linear_search(numbers, key);

        // if (index == -1){
        //     System.out.println("Element not found");
        // }
        // else{
        //     System.out.println("key is at index : " + index);
        // }











        // LARGEST NUMBER


        // int numbers[] = {68,11,72,5,8,46,25,48,69,47,56,25};
        // System.out.println("Largest number is : " + largest_number(numbers));










        // SMALLEST NUMBER


        // int numbers[] = {68,11,72,5,8,46,25,48,69,47,56,25};
        // System.out.println("Largest number is : " + smallest_number(numbers));











        // BINARY SEARCH


        // int numbers[] = {2,4,6,7,9,10,11,12,17,22,23,25,36,72,81};
        // int key = 10;
        // int index = binary_search(numbers, key);

        // if (index == -1){
        //     System.out.println("Element not found");
        // }
        // else{
        //     System.out.println("key is at index : " + index);
        // }










        // REVERSE OF ARRAY


        // int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        // reverse(numbers);

        // System.out.println("Reversed array is : ");

        // for(int i=0; i<numbers.length; i++){
        //     System.out.print(numbers[i] + " ");
        // }
        // System.out.println();










        // PAIRS IN AN ARRAY


        // int numbers[] = {2,4,6,8,10};
        // Pairs(numbers);










        // SUB-ARRAYS


        // int numbers[] = {2,4,6,8,10};
        // sub_arrays_M1(numbers);

        // int numbers[] = {2,4,6,8,10};
        // sub_arrays_M2(numbers);









        // MAX SUBARRAY SUM(brute force)


        // int numbers[] = {2,4,6,8,10};
        // max_sub_arrays_sum(numbers);
        
        // Array from user
        // System.err.println("Enter the number of elements in array : ");
        // int n = sc.nextInt();
        // System.err.println("Enter the elements : ");
        // int numbers[] = new int[n];
        // for(int i=0; i<n; i++){
            //     numbers[i] = sc.nextInt();
            // }
            // max_sub_arrays_sum(numbers);










        // MAX SUBARRAY SUM(prefix array)


        // int numbers[] = {2,4,6,8,10};
        // int numbers[] = {1,-2,6,-1,3};
        // max_sub_arrays_sum_prefix_array(numbers);

        
        
        
        
        
        
        
        // MAX SUBARRAY SUM(kadane's algorithm)
        
        
        // int numbers[] = {2,4,6,8,10};
        // int numbers[] = {1,-2,6,-1,3};
        // max_sub_arrays_sum_kadanes_algorithm(numbers);




        // MAX SUBARRAY SUM(kadane's algorithm) FOR ALL NEGATIVE NUMBERS


        // int numbers[] = {-8,-10,-5,-7,-2,-3};
        // int numbers[] = {-1,-10,5,-4,6,7};
        // max_sub_arrays_sum_kadanes_algorithm_all_negative(numbers);










        // TRAPPING RAINWATER

        // int height[] = {4,2,0,6,3,2,5};
        // trapping_rainwater(height);










        // STOCK PRICE
        // int prices[]={7,1,5,3,6,4};
        int prices[]={5,1,10,7,8,3,20};
        buy_and_sell_stocks(prices);








































































    }
}
