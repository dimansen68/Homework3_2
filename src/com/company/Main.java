package com.company;

public class Main {

    public static void main(String[] args) {
	// Написать программу, которая описывает введенное число. Отрицательное оно число или положительное (или нулевое),
        // чётное или нечётное.
        double a = 5;

        if (a==0) { System.out.println(a + " - это нулевое число;");}
        else {System.out.println(a + " - это ненулевое число;");};

        if (a>0) { System.out.println(a + " - это положительное число;");}
        else {System.out.println(a + " - это отрицательное число;");};

        if (a%2==0) { System.out.println(a + " - это четное число.");}
        else {System.out.println(a + " - это нечетное число.");};
    }
}
