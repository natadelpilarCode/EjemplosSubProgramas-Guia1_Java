/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubprogramaPackage;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digita el primer número");
        num1 = leer.nextInt();
        System.out.println("Digita el segundo número");
        num2 = leer.nextInt();
        EsMultiplo(num1,num2);
    }
    
    public static void EsMultiplo(int num1,int num2)
    {
        if(num1%num2==0)
        {
            System.out.println("El número " + num1 + " es múltiplo de " + num2);
        }
        else
        {
            System.out.println("El número " + num1 + " NO es múltiplo de " + num2);
        }
    }
    
}
