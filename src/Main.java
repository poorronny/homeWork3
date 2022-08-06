public class Main {
    public static void main(String[] args) {

        //task 1

        //int clients = 1;
        //if (clients == 0) {
        //System.out.println("Установите версию приложения для Android по ссылке");
        //}else if (clients==1){
        // System.out.println ("Установите версию приложения для iOS по ссылке");
        //} else {
        // System.out.println("Версия OS не установлена");}


        //task 2

        int clientOS = 1;
        short clientDeviceYear = 2014;

        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Версия OS не установлена");
        }


        //task 3

        short year = 2001;
        if (year % 4 == 0 && year % 100 != 0 || year % 400==0){
            System.out.println( year + "год является високосным");
        } else {
            System.out.println( year + " год не является високосным");
        }


        //task4

        int deliveryDistance=61;
        if (deliveryDistance<20){
            System.out.println("Доставка карты займет один день");
        } else if (deliveryDistance>=20 && deliveryDistance<60){
            System.out.println( "Доставка карты займет два дня");
        } else if (deliveryDistance >=60 && deliveryDistance<100){}
        System.out.println("Доставка карты займет три дня");

        //page 5

      int  monthNumber = 56;

      switch (monthNumber){
          case 1:
              System.out.println("Зима");
              break;
          case 2:
              System.out.println("Зима");
              break;
          case 3:
              System.out.println("Весна");
              break;
          case 4:
              System.out.println("Весна");
              break;
          case 5:
              System.out.println("Весна");
              break;
          case 6:
              System.out.println("Лето");
              break;
          case 7:
              System.out.println("Лето");
              break;
          case 8:
              System.out.println("Лето");
              break;
          case 9:
              System.out.println("Осень");
              break;
          case 10:
              System.out.println("Осень");
              break;
          case 11:
              System.out.println("Осень");
              break;
          case 12:
              System.out.println("Зима");
              break;}

              if (monthNumber > 12) {
            System.out.println("Такого сезона нет в нашей цивилизации xD");

          }








      }



}







