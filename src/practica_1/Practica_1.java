/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica_1;

import java.util.Scanner;
import sun.security.util.Length;

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
        int est=0, i=0, j=0;     
        boolean conti=true, dollar=false;
        
        System.out.print("Ingresa la cadena:");
        cadena=scanner.next();
        char[] c = cadena.toCharArray();
        String[] Vmay={"A","E","I","O","U"},Vmin={"a","e","i","o","u"}, Dig={"1","2","3","4","5","6","7","8","9"}, imp={"1","3","5","7","9"};
        while(conti==true&&c!=null){
            switch(est){
                //Lectura del primer digito donde si es @ sigue recto para verificar si hay un #
                //Si hay $ se salta ese paso al case 2
                case 0:
                    if(c[i]=='@'){
                        i++;
                        est++;
                    }
                    else if(c[i]=='$'){
                        i++;
                        est=est+2;
                        //Boolean que verifica si al final sera mayus o minus la vocal
                        dollar=true;
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
                    else {
                        conti=false;
                        System.out.print("Valor invalido");
                    }
                        break;
                    case 2:
                        boolean haydig= false;
                        for(int k=0; k<c.length;k++){
                          char dig=c[k];
                              for(int d=0;d<Dig.length;d++){
                                if(dig==Dig[d].charAt(0)){
                                haydig=true;
                                }
                              }
                        }
                        if(haydig){
                          i++;
                          est++;
                        }
                        else{
                          conti=false;
                          System.out.print("Valor invalido");
                        }
                        
                    break;
                    case 3:
                        boolean haydig2;
                        haydig2 = false;
                        for(int k=0; k<c.length;k++){
                        char dig=c[k];
                        for(int d=0;d<Dig.length;d++){
                            if(dig==Dig[d].charAt(0)){
                                haydig2=true;
                            }
                        }
                        
                    }
                        if(haydig2){
                        i++;
                        est++;
                    }
                         else{
                         conti=false;
                         System.out.print("Valor invalido");
                    }
                    break;
                    
                    case 4:
                        boolean haydig3;
                        haydig3 = false;
                        for(int k=0; k<c.length;k++){
                        char dig=c[k];
                        for(int d=0;d<imp.length;d++){
                            if(dig==imp[d].charAt(0)){
                                haydig3=true;
                            }
                        }
                        
                    }
                        if(haydig3){
                        i++;
                        est++;
                    }
                         else{
                         conti=false;
                         System.out.print("Valor invalido");
                    }
                    break;
                    case 5:
                        if(dollar){
                        boolean haydig4;
                        haydig4 = false;
                        for(int k=0; k<c.length;k++){
                        char dig=c[k];
                        for(int d=0;d<Vmin.length;d++){
                            if(dig==Vmin[d].charAt(0)){
                                haydig4=true;
                            }
                        }
                        
                    }
                        if(haydig4){
                        i++;
                        est++;
                        System.out.print("Valor Valido");
                        conti=false;
                    }
                         else{
                         conti=false;
                         System.out.print("Valor invalido");
                    }
                        }    
                        else {
                        boolean haydig5;
                        haydig5 = false;
                        for(int k=0; k<c.length;k++){
                        char dig=c[k];
                        for(int d=0;d<Vmay.length;d++){
                            if(dig==Vmay[d].charAt(0)){
                                haydig5=true;
                            }
                        }
                        
                    }
                        if(haydig5){
                        i++;
                        est++;
                        System.out.print("Valor Valido");
                        conti=false;
                        
                    }
                         else{
                         conti=false;
                         System.out.print("Valor invalido");
                    }
                        }
                    break;
            
        
    }
}
    }}