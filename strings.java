import java.util.*;
public class strings {

    public static void print_letters(String str){
        int length = str.length();
        for(int i=0; i<length; i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }





    public static boolean is_string_palindrome(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }





    public static void shortest_path(String str){
        int length = str.length();
        int count = length;
        int x = 0;
        int y = 0;
        for(int i=0; i<length; i++){
            char n = str.charAt(i);
            if(n =='E' || n =='e'){
                x++;
            }
            else if(n =='W' || n =='w'){
                x--;
            }
            else if(n =='N' || n =='n'){
                y++;
            }
            else if(n =='S' || n =='s'){
                y--;
            }
            else{
                System.out.println("Enter a valid direction");
                break;
            }
            count--;
        }
        if(count == 0){
            System.out.println(Math.sqrt((x*x)+(y*y)));
        }
    }






    public static void stringCompress(String str){
        StringBuilder newStr = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count > 1){
                newStr.append(count.toString());
            }
        }
        System.out.println(newStr);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // String name = sc.next();
        // System.out.println(name);


        // String name = sc.nextLine();
        // System.out.println(name);


        // String name = "Mohd Uzair";
        // System.out.println(name.length());


        // String firstName = "Mohd";
        // String lastNmae = "Uzair";
        // String fullName = firstName + " " + lastNmae;
        // System.out.println(fullName);


        // String name = "Mohd Uzair";
        // System.out.println(name.charAt(5));


        // String name = "Mohd Uzair";
        // print_letters(name);


        // String ToCheck = "racecar";
        // System.out.println(is_string_palindrome(ToCheck));


        // String direction = "WNEENESENNN";
        // shortest_path(direction);


        String str = "aaabbbcdd";
        stringCompress(str);

        
    }
}
