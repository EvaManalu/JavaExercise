package com.example;

import java.util.Scanner;
import java.util.InputMismatchException;

// Define a shape inteface
interface Shape{ //one of implementation of Polymorphism
     void draw (int height);
}


    class drawTriangleSS implements Shape {
        @Override
        public void draw(int triangleHeight) {
            for (int i = 1; i <= triangleHeight; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    class drawTriangleSK implements Shape {
        @Override //overriding (mengganti secara paksa content dari function dalam polymorpishm)
        public void draw(int triangleHeight) {
            for (int i = 1; i <= triangleHeight; i++) {
                for (int j = 1; j <= triangleHeight - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

public class ShapeDrawerPolyMorph {
    Scanner scanner = new Scanner(System.in);

    public void drawShape (int choice){
        try {
            switch (choice) {
                case 1:
                    System.out.println("Masukkan berapa tinggi segitiga siku-siku: ");//segitiga siku2
                    int triangleHeight = scanner.nextInt();
                    new drawTriangleSS().draw(triangleHeight);
                    break;
                case 2:
                    System.out.println("Masukkan berapa tinggi segitiga sama kaki ");
                    int triangleHeight2 = scanner.nextInt();
                    new drawTriangleSK().draw(triangleHeight2);
                    break;
                case 3:
                    break;
//                default:
//                    System.out.println("Invalid input"); //segitiga sama kaki
           }
        }
        catch (InputMismatchException ime){
            System.out.println("Please enter valid integer");
            scanner.next();
        }
    }


    public void displayMenu(){
       System.out.println("selamat datang di ASCII gambar!");
       System.out.println("PIlih Gambar:");
       System.out.println("1. Segitiga siku-siku");//nasted loop
       System.out.println("2. Segitiga sama kaki");//nested loop, tapi inner loop ada 2
       System.out.println("3. Exit");
   }

   public void run(){
       //loop while untuk aplikasi terus running samoai ada exit
       while (true){
           displayMenu();
           System.out.println("Masukkan pilihan anda: ");
           try {
               int choice = scanner.nextInt();
               drawShape(choice); //dimana ada conditional
               System.out.println();
           }
           catch (InputMismatchException ime){
               System.out.println("Please enter valid integer");
               scanner.next();;
           }
       }
   }


    public static void main(String[] args) {
        //inheritance (oop)
        //untuk running
        
        ShapeDrawerPolyMorph drawer = new ShapeDrawerPolyMorph();
        drawer.run();
    }
}
