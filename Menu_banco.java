/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_banco;


import java.util.Scanner;

/**
 *
 * @author Nauzet
 */
public class Menu_banco {
            
    public static void main(String[]args)throws Exception{
        Scanner keyboard = new Scanner(System.in);
        give = new Solicitud();
        int option;//Guardamos la opción del usuario
        CuentaBancaria menu_aplication = new CuentaBancaria();
        boolean close = false;
        
        
      
        do{
            
            
            
            System.out.println("============================== M E N Ú ===================================");
            System.out.println("| Opción 1: Ver el número de cuenta completo (CCC - Código Cuenta Cliente|");
            System.out.println("| Opción 2: Ver el titular de la cuenta                                  |");
            System.out.println("| Opción 3: Ver el código de la entidad                                  |");
            System.out.println("| Opción 4: Ver el titular de la oficina                                 |");
            System.out.println("| Opción 5: Ver el número de cuenta                                      |");
            System.out.println("| Opción 6: Ver los dígitos de control de la cuenta                      |");
            System.out.println("| Opción 7: Realizar un ingreso                                          |");
            System.out.println("| Opción 8: Retirar efectivo                                             |");
            System.out.println("| Opción 9: Consultar saldo                                              |");
            System.out.println("| Opción 10: Salir de la aplicación                                      |");
            System.out.println("| Introduce tu opción a continuación                                     |");
            option = keyboard.nextInt();
            System.out.println("Ejecutando opción" + option + "...");
            
            
            
            switch(option){
                case 1:
                    menu_aplication
                    break;
                case 2:
                    menu_aplication
                    break;
                case 3:
                    menu_aplication
                    break;
                case 4:
                    menu_aplication
                    break;
                case 5:
                    menu_aplication
                    break;
                case 6:
                    menu_aplication
                    break;
                case 7:
                    menu_aplication
                    break;
                case 8:
                    menu_aplication
                    break;
                case 9:
                    menu_aplication
                    break;
                case 10:
                    menu_aplication
                    break;
                default:
                    System.out.println("Introduzca un opción del 1 al 10");
                    break;                
            }
            
            
        }while(!close);
        
        
        
        
        
        
    }
}
