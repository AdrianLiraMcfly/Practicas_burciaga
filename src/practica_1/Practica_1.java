/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica_1;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Practica_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner= new Scanner(System.in);
        
        String cadena;
        int est=0, i=0;     
        boolean conti=true;
        
        System.out.print("Ingresa la cadena:");
        cadena=scanner.next();
        char[] c = cadena.toCharArray();
        while(conti==true&&c!=null){
            switch(est){
                case 0:
                    if(c[i]=='@'){
                        i++;
                        est++;
                    }
                    else if(c[i]=='$'){
                        i++;
                        est++;
                    }
                    else {
                        System.out.print("Valor invalido");
                        conti=false;
                    }
                    break;
                case 1:
                    if(c[i]=='#'){
                        i++;
                        est++;
                    }
                    else if(c[i]=='$'){
                        i++;
                        est++;
                    }
                    else {
                        conti=false;
                        System.out.print("Valor invalido");
                    }
            }
        }
    }
}