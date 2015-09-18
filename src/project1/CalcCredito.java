package project1;

import java.text.DecimalFormat;
import java.util.Scanner;


public class CalcCredito {


    public static void CalcCredito() {
        
        Double montoc, interesc;
        int tiempoc;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print ("Ingrese el Monto de su Crédito:  ");
        montoc = sc.nextDouble();
        
        System.out.print ("Ingrese la Tasa de Interes Mensual:  ");
        interesc = sc.nextDouble();
        
        System.out.print ("Ingrese el Tiempo de Pago (Meses):  ");
        tiempoc = sc.nextInt();  
        
      
        CalcC(montoc, interesc, tiempoc);
        
        
    }
 
    public static void CalcC(double montoc, double interesc, int tiempoc){
        
    DecimalFormat decimales = new DecimalFormat("0.00");
        
        double saldo, mensualidad = 0;
        double interes2 = 0;
        double calculo1 = 0, calculo3 = 0, calculo4 = 0, calculo5 = 0, calculo6 = 0, calculo7 = 0, calculo8 = 0, calculo9 = 0;
        int i;
        
        Encabezado();
        
        
        calculo1 = montoc / tiempoc;
        
        
        for (i = 1; i <= tiempoc; i++){
            
            //Calcular Interes y Total de Interes
            calculo3+=interes2;
            interes2 = (((montoc*interesc)/tiempoc)/100);
            
            calculo4 = calculo3+interes2;
            
            //Calcular Mensualidad y Total de Mensualidad
            
            calculo5+=mensualidad ;
            mensualidad = calculo1 + interes2;
            
            calculo6 = calculo5 + mensualidad;
           
            //Calcular Total Monto
            calculo7+=calculo1;
            calculo8 = calculo7;
            //Fin Calculo Total Monto
                        
            saldo = montoc - calculo1;
            
            Impresion(i,montoc,interes2,calculo1,mensualidad,tiempoc);
            
            montoc = saldo;
            
            calculo9 = montoc - montoc;
        }
        
            ImpresionTot(calculo9,calculo4,calculo6,calculo8);
        
            System.out.println("\n\nCifras Expresadas en Quetzales");
            
        
    }
    
    public static void Encabezado(){
        
        int i;
        System.out.println("\nTabla de Amortización");
        for(i=0;i<62;i++)  System.out.print("-");
        
        System.out.format("\n%-8s%-12s%-14s%-14s%-14s\n","Mes","Saldo","Interés","Cuota","Mensualidad");
        for(i=0;i<62;i++)  System.out.print("-");
        System.out.println (" ");

    }
    
    public static void Impresion(int i, double montoc, double interes2, double calculo1, double mensualidad, int tiempoc){
        
        DecimalFormat decimales = new DecimalFormat("0.00");
        
        System.out.format("%-8s%-12s%-14s%-14s%-14s",i,decimales.format(montoc),decimales.format(interes2),decimales.format(calculo1),decimales.format(mensualidad));
        System.out.println ("");
        
        
    }
    
    public static void ImpresionTot(double calculo9, double calculo4, double calculo6, double calculo8){
        
        DecimalFormat decimales = new DecimalFormat("0.00");
        int i;
        for(i=0;i<62;i++)  System.out.print("-");
        System.out.println (" ");
                
        System.out.format("%-8s%-12s%-14s%-14s%-14s","TOTAL: ",decimales.format(calculo9),decimales.format(calculo4),decimales.format(calculo8),decimales.format(calculo6));
        
        System.out.println ("");
        for(i=0;i<62;i++)  System.out.print("-");
        System.out.println (" ");
        
        
    }
    
    
    
    
}
