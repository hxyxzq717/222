package homework;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args){
        float x;
        float y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextFloat();
        y=sc.nextFloat();
        System.out.println(x+x*y);
        System.out.println(x+x*y*2);
        System.out.println(x+x*y*3);
    }
}
