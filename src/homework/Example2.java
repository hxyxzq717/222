package homework;

import java.util.Scanner;

public class Example2 {
    static final float Pl=3.14159f;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float radius=sc.nextFloat();
        System.out.println("圆的周长是:"+2*Pl*radius);
        System.out.println("圆的面积是："+Pl*radius*radius);
    }
}
