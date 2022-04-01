package n;
import java.util.Scanner;
public class a1 { public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int line=sc.nextInt();
    if(line<=1){
        System.out.println("需要输入大于1的自然数");
                }
                else {
                for (int i = 1; i <= line; i++) {
                for (int j = 1; j <= line-i; j++) {
                System.out.print("");
                }
                for (int a = 1; a <= 2 * 1 - 1; a++) {
                System.out.print("*");
                }
                System.out.println();
                }
                }}}