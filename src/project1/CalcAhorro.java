package project1;

import java.util.Scanner;
import java.text.DecimalFormat;
public class CalcAhorro {

     
    
    public static void CalcAhorro() {

        Double monto, interes;
    
        int tiempo;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print ("Ingrese el Monto de su Inversión:  ");
        monto = sc.nextDouble();
        
        System.out.print ("Ingrese la Tasa de Interes Mensual:  ");
        interes = sc.nextDouble();
        
        System.out.print ("Ingrese el Tiempo de Ahorro (Meses):  ");
        tiempo = sc.nextInt();
    
        Encabezado();
        
        Calculadora (monto, interes, tiempo); 
        
        System.out.println ("\nCifras expresadas en Quetzales");
    }
    
    public static void Calculadora(double monto, double interes, int tiempo){
    
    DecimalFormat decimales = new DecimalFormat("0.00");
    double balance;
    double interes2 = (interes)/100;
    double calculo1, calculo2;
    int i;
    int b;
    
     System.out.println ("Información Sobre Cuenta: ");
     System.out.println ("Inversión Inicial: " + monto);
     System.out.println ("Tasa de Interes Mensual: " + interes + "%");
     System.out.println ("Meses de Ahorro: " + tiempo);
         
        for (b = 0; b < 40; b++) System.out.print ("-");
        System.out.println (""); 
     
    for (i = 0; i < tiempo; i++){
        
        calculo1 = monto * interes2;
        calculo2 = monto + calculo1;
        
        balance = (calculo2 + monto) - monto;
              
        
        monto = balance;
        
        System.out.print ("Mes " + (i+1) + ":  ");
        System.out.println(decimales.format(balance));
    
}
    }
    
    public static void Encabezado(){
        
        int a;
        
        
        System.out.println ("Calculo de Ahorro");
        for (a = 0; a < 40; a++) System.out.print ("-");
        System.out.println ("");
        
    }
}