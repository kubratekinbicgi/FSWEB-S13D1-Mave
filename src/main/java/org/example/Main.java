package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true, 2));
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(isCatPlaying(true, 10));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Genişliği girin: ");
        double width = scanner.nextDouble();

        System.out.print("Yüksekliği girin: ");
        double height = scanner.nextDouble();

        double result = area(width, height);

        if (result == -1) {
            System.out.println("Hatalı giriş! Alan negatif olamaz.");
        } else {
            System.out.println("Dikdörtgenin alanı: " + result);
        }

        System.out.print("Yarıçapı girin: ");
        double radius = scanner.nextDouble();

        double circleResult = area(radius);

        if (circleResult == -1) {
            System.out.println("Hatalı giriş! Yarıçap negatif olamaz.");
        } else {
            System.out.println("Dairenin alanı: " + result);
        }

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }
        if(isBarking && (clock < 8 || clock > 19)) {
            return true;
        }
        return false;

    }
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       return (firstAge >= 13 && firstAge <= 19) ||
               (secondAge >= 13 && secondAge <= 19) ||
               (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int upperLimit;

        if (isSummer) {
            upperLimit = 45;
        } else {
            upperLimit = 35;
        }

        if (temp >= 25 && temp <= upperLimit) {
            return true;
        } else {
            return false;
        }
    }



    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }else{
        return width * height;
    }
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }

}

