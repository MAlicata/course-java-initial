package com.company;

public class While {
    public static void main(String[] args) {

        boolean check = true;
        int count=0;
        while(count<10){
            count++;
            if(count == 6)
                continue;
            System.out.println("Hola Mundo"+count);

        }
        System.out.println("fin");
    }
}
