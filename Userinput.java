import java.util.*;
public class Userinput {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of voter:");
        int num = sc.nextInt();
        if(num>= 18){
            System.out.println("Eligible");
        }
        else {
            System.out.println("Not eligible");
        }
    }
}
