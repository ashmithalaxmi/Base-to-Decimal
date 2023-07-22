import java.util.Scanner;

public class BaseToDecimal {
    static void base_to_decimal(int a, int b){
        int remainder=0;
        int decimal=0;
        int power =0;
        while(a>0){
            remainder=a%10;
            a= a/10;
            decimal += remainder *Math.pow(b, power);
            power++;
        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        base_to_decimal(a,b);
    }
}
