package com.projeto.atribuicaoreferencia;

public class Main {

    public static void main(String[] args) {
        //Atribuição de tipos primitivos
        int intA = 1;
        int intB = intA;

        System.out.println("intA=" + intA + " intB=" + intB);

        intA = 2;

        System.out.println("intA=" + intA + " intB=" + intB);
        //Atribuição de objetos
        MeuObj objA = new MeuObj(1);
        MeuObj objB =objA;

        System.out.println("objA=" + objA + " objB=" + objB);

        objA.setNum(2);

        System.out.println("objA=" + objA + " objB=" + objB);




    }
}
