package Java.box-color-java;

import  java.util.Scanner;

public class boxColor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String box = sc.next();

        switch(box) {
            case "red":       System.out.println("1"); break;
            case "green":     System.out.println("2"); break;
            case "black":      System.out.println("3"); break;
            default:    System.out.println("Pick Again"); break;
    }
        
    }
}