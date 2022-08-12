package decision.makig.with.java;

import java.awt.*;
import java.util.Scanner;

public class PracticeForDipto {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");

        num=sc.nextInt();

        //System.out.println("your entered " + num);

        switch (num){
            case 1:
                System.out.println("your pressed : 1");
                break;
            case 2:
                System.out.println("you pressed : 2 ");
                break;
            default:
                System.out.println("You entered wrong value ! ");
                break;
        }


    }
}
