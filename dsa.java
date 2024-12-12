import java.util.*;
public class dsa {


    public static void previous_greatest(int arr[]){
        int n = arr.length;
        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0; i<n; i++){
            while(stack.empty() == false && stack.peek() < arr[i]){
                stack.pop();
            }
                if(stack.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    System.out.println(stack.peek());
                }
                stack.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        // PREVIOUS GREATEST
        int arr[] ={20,30,10,5,15};
        previous_greatest(arr);


    }
}
