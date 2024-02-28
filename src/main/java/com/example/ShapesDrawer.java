package com.example;

import java.util.Scanner;

public class ShapesDrawer {
    Scanner scanner = new Scanner(System.in);

    public void drawShape (int choice){
        switch (choice){
            case 1:
                System.out.println("Masukkan berapa tinggi segitiga: ");
                int triangleHeight  = scanner.nextInt();
                drawTriangle(triangleHeight);
                break;
            case 2:
                System.out.println("Masukkan berapa panjang sisi persegi: ");
                int squareSide  = scanner.nextInt();
                drawSquare(squareSide);
                break;
            case 3:
                System.out.println("Masukkan berapa tinggi persegi panjang: ");
                int rectangleHeight  = scanner.nextInt();
                System.out.println("Masukkan berapa lebar persegi panjang: ");
                int rectangleWidth = scanner.nextInt();
                drawRectangle(rectangleHeight, rectangleWidth );
                break;
            case 4 :
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    public void drawTriangle(int triangleHeight){
        //nested loop
        //outer loop
        for (int i = 1; i <= triangleHeight;i++){
            //innerloop (take care the column)
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void drawSquare(int squareSide) {
        for (int k = 0; k < squareSide; k++) {
            for (int l = 0; l < squareSide; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void drawRectangle(int rectangleHeight, int rectangleWidth) {
        for (int m = 0; m < rectangleHeight; m++) {
            for (int n = 0; n < rectangleWidth; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public void displayMenu(){
        System.out.println("selamat datang di ASCII gambar!");
        System.out.println("Pilih Gambar:");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Exit");
    }

    public void run(){
        //loop while untuk aplikasi terus running samoai ada exit
        while (true){
            displayMenu();
            System.out.println("Masukkan pilihan anda: ");
            int choice = scanner.nextInt();
            drawShape(choice); //dimana ada conditional
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //inheritance (oop)
        //untuk running

        ShapesDrawer drawer = new ShapesDrawer();
        drawer.run();
    }
}
