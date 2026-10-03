import java.util.*;

public class shoping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the prize of product: ");
        int price = sc.nextInt();
        System.out.print("Enter the quantity of the product: ");
        int num = sc.nextInt();
        int totalbill = price*num;
        if(totalbill >= 1000){
            totalbill = totalbill -100;
            System.out.println("The total bill is : "+totalbill);
        }
        else{
            System.out.println(totalbill);
        }
    }
    
}
