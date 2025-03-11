package fr.ynov.java.medium;

public class Square {

    public static double getSquare(double number) {
        return number * number;
    }

    public static void main(String[] args) {
        double number = 5;
        double result = getSquare(number);

        System.out.println("Le carré de " + number + " est : " + result);
    }
}