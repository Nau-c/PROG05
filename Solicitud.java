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
//Clase donde se hacen las recogida de la información por teclado
public class Solicitud {
    Scanner read_keyboard = new Scanner(System.in);
    
    //Método donde pedimos el nombre del titular de la cuenta
    public String ask_holder(){//Pedimos el titular
    String headline = "x";//Titular de la cuenta
    do{
        System.out.println("Introduce el nombre del titular de la cuenta");
        headline = read_keyboard.nextLine();
       }while ((headline.length() <5) || (headline.length() >20));
       return headline;
    }//Ya nuestro metodo tiene un control de caráteres usando un bucle "while" y usando función "length" 
    //letras especificamso un rago de menos 5 a menso 20
    
    
    //Creamo un método para solicitar el número de cuenta
    public String ask_numberaccount(){
        boolean check_numberaccount = false;
        String number_account = "x";
        do{
        System.out.println("Introduce el número de la cuenta");  
        number_account = read_keyboard.next();
        //Realizamos un control para comprobar que se introduce un número de cuenta
        if(number_account.length() != 20){ //La cuenta no puede ser distinta de 20 digitos
           System.out.println("La cuenta no tiene 20 digítos");
           check_numberaccount = false;
        }else{//Si llegamos a este punto la cuenta tiene 20 digitos
            
        }
            
        
        
        
    }while (!check_numberaccount);
    return number_account;
  }
   
    
    
    
    
}
