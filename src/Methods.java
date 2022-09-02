import java.time.LocalDate;

public class Methods {

    //task1
    public static String checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return year+" ...год является високосным";
        } else {
            return year+" ...год не является високосным";
        }
    }

    //task2
    public static String checkOS(int clientDeviceYear, boolean clientOS) {
        String result = null;
        if (clientOS && clientDeviceYear < 2015) {
            result = "Установите облегченную версию приложения для iOS по ссылке.";
        } else if (clientOS && clientDeviceYear >= 2015) {
            result = "Установите версию приложения для iOS по ссылке.";
        }

        if (!clientOS && clientDeviceYear < 2015) {
            result = "Установите облегченную версию приложения для Android по ссылке.";
        } else if (!clientOS && clientDeviceYear >= 2015) {
            result = "Установите версию приложения для Android по ссылке.";
        }
        return result;
    }
    //task3
    public static int checkDayOfDelivery(int deliveryDistance){
        int result = 0;
        if(deliveryDistance<=20){
            result=1;
        }else if(deliveryDistance>20&&deliveryDistance<=60){
            result=2;
        }else if(deliveryDistance>60&&deliveryDistance<=100){
            result=3;
        }
        return result;
    }

    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        System.out.println(checkYear(2015));
        System.out.println(checkOS(currentYear-20,false));
        System.out.println(checkDayOfDelivery(100));
    }


}
