package com.calc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        //Constructor
        Calculadora calc = new Calculadora(6,9);

        
        System.out.println("La suma de 6 y 9 es: "+calc.suma());
    }
}
