package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("My name is eva");

        //looping 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        int a = 10;
        int b = 2;
        float c = 3;
        String nama = "Eva";
        char q = 'Y';
        boolean flag = false;

        float result; //sebelumnya int diubah jadi float
       // result = a/b; //10 devide 2 (both int)
       int resultType = (int) (a/c); // type casting
        result = a/c;
        System.out.println(result);
        System.out.println(resultType);

        int timeStart = 8;
        int timeFinish = 17;
        int waktuSaya = 7;
        int waktuPulang = 12;
        //Karyawan tepat waktu  dan pulang dapat selamat
        if (waktuSaya <= timeStart && waktuPulang >= timeFinish ) {
            System.out.println("Selamat kamu tepat waktu datang dan pulang");
            System.out.println("Anda datang " + (timeStart - waktuSaya) + " jam lebih cepat");
            System.out.println("Anda pulang " + (waktuPulang - timeFinish) + " jam lebih cepat");

            //Karyawan datang duluan, pulang cepat, dicengin
        } else if (waktuSaya <= timeStart&& waktuPulang <= timeFinish) {
            System.out.println("Dateng awal, pulcep nih yee");

            //karyawan telat, pulang lama dimaafkan
        } else if (waktuSaya >= timeStart && waktuPulang >= timeFinish) {
            System.out.println("Dimaafkan datang telatnya");

        //karyawan telat dan pulang cepat disoraki.
        }else{
            System.out.println("YEU TELAT");
            System.out.println("Anda telat " + (waktuSaya - timeStart) + " jam");
            System.out.println("Anda pulang duluan " + (timeFinish - waktuPulang) + " jam lebih cepat");
        }

        int day = 3;
        switch (day){
            case 1:
                System.out.println("Saya WFO");
                break;
            case 2 :
                System.out.println("Saya libur/cuti");
                break;
            case 3 :
                System.out.println("Saya WFH");
                break;
            default:
                System.out.println("Liburan alis weekend");
                break;
        }
        System.out.println("Hehehehe");
    }

    //loop
    //while loop and for loop, foreach
}