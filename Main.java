package com.company;

public class Main {

    public static void main(String[] args) {


        int u = 10;
        int i = 1;
        while ( i <= 10 ){
            System.out.print(i + " ");
          i++;}
            System.out.println("");


       for (; u >= 1; u--){
           System.out.print(u + " ");
       }
       int Friday = 5;
       for (; Friday <= 31;  Friday += 7){
           System.out.println("\n" + "Сегодня пятница," + Friday + "-e число. Необходимо подготовить отчет.");
       }

       int OurDate = 2021;
       int FutureDate = OurDate + 100;
       int PastDate = OurDate - 200;
       int InterimDate = 79;
       for (int y = PastDate; y < FutureDate; y ++){
           if (y % InterimDate == 0){
               System.out.println(y);
           }
       }



    }
}
