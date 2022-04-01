package n;
import java.util.Scanner;
public class p{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        if (x%2==0) {
            System.out.print("这个数是偶数");
        }else {
            System.out.print("这个数是奇数");
        }
        System.out.print("结束");

    }
}
