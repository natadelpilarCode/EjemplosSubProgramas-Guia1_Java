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
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frase="";
        do {
            System.out.println("Digite una frase y finalice con punto (.)");
            frase = leer.nextLine();
            //System.out.println(frase);
        } while (!".".equals(frase.substring(frase.length()-1,frase.length())));
        
        System.out.println("Frase ingresada");
        System.out.println(frase);
        System.out.println("Frase reemplazada con replace");
        System.out.println(frase.replace("a","@").replace("e", "#").replace("i", "$"));
        frase = Codificar(frase);
        System.out.println("Frase codificada");
        System.out.println(frase);
    }
    
    public static String Codificar(String frase)
    {
        String fraseCodificada = "";
        String letra;
        for (int i = 0; i < frase.length(); i++) {
            letra = frase.substring(i,i+1);
            switch(letra){
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;    
                case "u":
                    letra = "*";
                    break;
            }
            fraseCodificada = fraseCodificada.concat(letra);
        }
        return fraseCodificada;
    }
    
}
