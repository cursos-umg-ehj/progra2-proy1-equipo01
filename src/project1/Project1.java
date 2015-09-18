
package project1;

import java.util.Scanner;

public class Project1 {

    public static void Menu(){
              
        int op;
        do{
        Scanner sc=new Scanner(System.in);
        
        System.out.println ("     Menú de Opciones    ");
        System.out.println ("1. Calculadora de Ahorro");
        System.out.println ("2. Calculadora de Crédito");
        System.out.println ("3. Salir");
        System.out.println (" ");
        System.out.print ("Digite una opción:  ");
        op = sc.nextInt();
        
        if(op > 0 && op <4 ){
        
        switch (op){
            
            
            case 1:
                CalcAhorro a = new CalcAhorro();
                a.CalcAhorro();
                System.out.println("\nPresione Enter para continuar");
                sc.nextLine();
                sc.nextLine();
                break;
                
            case 2:
                CalcCredito b = new CalcCredito(); 
                b.CalcCredito();
                System.out.println ("\nPresione Enter para continuar");
                sc.nextLine();
                sc.nextLine();
                break;
                
                      
        }
        
        }else{
            System.out.println ("Ingrese un Valor Valido");
            sc.nextLine();
            sc.nextLine();
            
            
        }
        }while (op != 3);
     
        
    }
        
    public static void main(String[] args) {

        Menu();
        
        
    }
    
}