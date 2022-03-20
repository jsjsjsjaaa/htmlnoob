package Demo;

import java.util.Scanner;
public class g {
    public static void main(String[] args){
        int height9,height8,height7;
        Scanner hs=new Scanner(System.in);
        height9=hs.nextInt();
        height8=hs.nextInt();
        height7=hs.nextInt();
        int a=height7>height8?height9:height8;
        int b=a>height7?a:height7;
        System.out.println("maxheight:"+b);

    }
}
