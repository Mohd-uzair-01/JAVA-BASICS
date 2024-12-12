import java.util.*;
public class sorting {






    public static void print_array(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }





    public static void print_array_descending(int arr[]){
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }






    public static void bubble_sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int swap = 0;
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap ++;
                }
            }
            if(swap == 0 ){
                break; //no need to check further array is shorted
            }
            swap = 0;
        }
    }





    public static void selection_sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int min_position = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min_position] > arr[j]){
                    min_position = j;
                }
            }
            int temp = arr[min_position];
            arr[min_position] = arr[i];
            arr[i] = temp;
        }
    }





    
    public static void inertion_sort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct pos to insert
            while (prev >=0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
    }





    public static void reverse_inertion_sort(int arr[]){
        for(int i=arr.length-2; i>=0; i--){
            int curr = arr[i];
            int prev = i+1;
            // finding out the correct pos to insert
            while (prev < arr.length && arr[prev] > curr) {
                arr[prev-1] = arr[prev];
                prev++;
            }
            // insertion
            arr[prev-1] = curr;
        }
    }




    // for small range (range != value) value badi ho skti hai range kam honi chahiye
    public static void counting_sort(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i=0; i<count.length; i++){
            while (count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }






    public static void reverse_counting_sort(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j = arr.length-1;
        for(int i=0; i<count.length; i++){
            while (count[i] > 0){
                arr[j] = i;
                j--;
                count[i]--;
            }
        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // BUBBLE SORT
        // int arr[] = {5,4,1,3,2};
        // int arr[] = {1,2,3,4,5};
        // bubble_sort(arr);
        // print_array(arr);





        // SELECTION SORT
        // int arr[] = {5,4,1,3,2};
        // selection_sort(arr);
        // print_array(arr);






        // INERTION SORT
        int arr[] = {5,4,1,3,2};
        // selection_sort(arr);
        reverse_inertion_sort(arr);
        print_array(arr);





        // COUNTING SORT
        // int arr[] = {2,3,6,2,1,0,6,4,2,4,8,6};
        // counting_sort(arr);
        // reverse_counting_sort(arr);
        // print_array(arr);





















        
    }
}
