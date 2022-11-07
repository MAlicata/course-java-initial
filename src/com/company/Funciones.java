package com.company;

public class Funciones {
    public static void main(String[] args) {
        holaMundo();
        holaMundo("Matias");
        String hola = devolverHola();
        System.out.println(hola);
        holaMundo(5);
    }

    public static void holaMundo() {
        System.out.println("Hola mundo desde un método");
    }
    private static void holaMundo(String name) {
        System.out.println("Hola " +name);
    }
    //sobrecarga
    private static void holaMundo(String name, String surname) {
        System.out.println("Hola " +name + " " + surname);
    }
    private static void holaMundo(int number) {
        System.out.println("Hola " +number);
    }
    private static String devolverHola() {
            return "Deolver texto";
    }
    private static int sum(int num1, int num2){
        return num1 + num2;
    }

}
