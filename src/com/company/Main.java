package com.company;

public class Main {

    public static void main(String[] args) {
        int clientOS = 0;
        int clientDeviceYear = 2013;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        int year = 2021;
        if(year % 4 == 0) {
            if(year % 100 == 0 && !(year % 400 == 0)) {
                System.out.println(year + " год не является високосным.");
            } else {
                System.out.println(year + " год является високосным.");
            }
        } else {
            System.out.println(year + " год не является високосным.");
        }

        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день для доставки");
        } else if ((deliveryDistance > 20) && (deliveryDistance < 60)) {
            System.out.println("Потребуются 2 дня для доставки");
        } else {
            System.out.println("Потребуются 3 дня для доставки");
        }


        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            default:
                System.out.println("Такого сезона нет");
        }
    }
}
