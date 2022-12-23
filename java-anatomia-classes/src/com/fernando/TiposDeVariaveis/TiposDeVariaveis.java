package com.fernando.tiposdevariaveis;

public class TiposDeVariaveis {
    public static void main(String[] args) {
        //A variável não é afetada.
        int n1 = 5;
        System.out.println(- n1);// -5
        System.out.println(n1);// 5
        
        //A variável é afetada
        int n2 = 4;
        n2 = -n2;
        System.out.println(n2); //-4

        //Tornando a variável positiva novamente
        n2 = -1*n2;
        System.out.println(n2);
    }
}
