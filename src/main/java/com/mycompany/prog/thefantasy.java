package com.mycompany.prog;

import java.util.ArrayList;
import java.util.Scanner;

public class thefantasy {
    
    static double total = 0;
    static int presupuesto = 40_000_000;
    static int nuevopre=0;
    
    
    static ArrayList<String> jugadores;
    static ArrayList<String> posicion;
    static ArrayList<Integer> precios;
    
    static ArrayList<String> jugadoresf;
    static ArrayList<String> posicionf;
    
    static ArrayList<Integer> preciosf;
    
    static ArrayList<String> fichar;
   
    
    
    public static void main(String[] args) {
        
        String nom;
        String leido = null;
        int elegido;
        int nleido;
        String dispo;
        
        
       posicion =new ArrayList();
       jugadores =new ArrayList();
       precios =new ArrayList();
       boolean mlb=true;
       
       jugadoresf =new ArrayList();
       posicionf =new ArrayList();
       preciosf =new ArrayList();
       
       fichar=new ArrayList();
       
       
       
       Scanner sc = new Scanner(System.in);
         
         
         System.out.println("Bienvenido al mercado de fichajes de la MLB");
         
         System.out.println("");
         
         System.out.println("¿Como quieres que te llame?");
         
         nom = sc.nextLine();
         
         System.out.println("Perfecto " + nom + ", Empecemos");
         
         System.out.println(" ");
         
         rellenardatos(sc);
         while(mlb){
             System.out.println( nom + ", ¿Que quieres hacer?");
             System.out.println("1-.Mostar a los jugadores");
             System.out.println("2-.Fichar a jugador");
             System.out.println("3-.Ver jugadores por posición");
             System.out.println("s-.Salir");
             leido= sc.nextLine();
             switch (leido) {
                 case "1":
                     imprimefichajes();
                     break;
                 case "2":
                     imprimefichajes();
                     System.out.println("Introduce el numero del "
                            + "jugador a fichar: ");
                    nleido=sc.nextInt();
                    sc.nextLine();
                    fichar(nleido-1);
                     break;
                 case "3":
            System.out.println("Introduce la posición que quieres ver: ");
            dispo = sc.nextLine();
            imprimelaPosicion(dispo);
            break;    
                 case "s":
                     mlb=false;
                     break;
                 default:
                    System.out.println("Entrada no válida. Inténtalo de nuevo.");
                    break;    
                   
             }
         }
    }
         
    
    public static void jugadoresf() {
        
        jugadoresf =new ArrayList();

        
    }
    
    
    public static void posicionf() {
        
        posicionf =new ArrayList();
        

        
        
    }
    
    public static void preciosf() {
        
        preciosf =new ArrayList();
           
        
        
    
    }
    
    
    
    
    
    public static void posicion() {
        
        posicion =new ArrayList();
        

        posicion.add("P");
        posicion.add("RF");
        posicion.add("2B");
        posicion.add("3B");
        posicion.add("RF");
        posicion.add("LF");
        posicion.add("3B");
        posicion.add("LR"); 
        posicion.add("P");
        posicion.add("RF");
        posicion.add("2B");
        posicion.add("LF");
        posicion.add("Relevista");
        posicion.add("Relevista");
        posicion.add("1B");
        posicion.add("Relevista");
        posicion.add("Relevista");
        posicion.add("C"); 
        posicion.add("RF");
        posicion.add("LF");
        
        
    }
    
    public static void jugadores() {
        
        jugadores =new ArrayList();
        

        jugadores.add("Shohei Ohtani");
        jugadores.add("Ronald Acuña");
        jugadores.add("José Altuve");
        jugadores.add("Alex Bregman");
        jugadores.add("Bryce Harper");
        jugadores.add("Yordan Álvarez");
        jugadores.add("Pablo sandoval");
        jugadores.add("Bryan Abreu"); 
        jugadores.add("José Alvarado");
        jugadores.add("Nick Castellanos");
        jugadores.add("Jean Segura");
        jugadores.add("Ranger Suárez");
        jugadores.add("Héctor Neris");
        jugadores.add("Hunter Brown");
        jugadores.add("Yuli Gurriell ");
        jugadores.add("Blake Taylor ");
        jugadores.add("David Robertson");
        jugadores.add("Martín Maldonado"); 
        jugadores.add("Fernando Tatís Jr");
        jugadores.add("Juan Soto");
        
        
    }
    
    
    public static void precios() {
        
        precios =new ArrayList();
           
        precios.add(8_000_000);
        precios.add(4_000_000);
        precios.add(3_000_000);
        precios.add(5_000_000);
        precios.add(7_000_000);
        precios.add(7_000_000);
        precios.add(4_000_000);
        precios.add(2_000_000);
        precios.add(3_000_000);
        precios.add(2_000_000);
        precios.add(7_000_000);
        precios.add(2_000_000);
        precios.add(8_000_000);
        precios.add(7_000_000);
        precios.add(6_000_000);
        precios.add(5_000_000);
        precios.add(4_000_000);
        precios.add(3_000_000);
        precios.add(2_000_000);
        precios.add(6_000_000);
        
    
    }
    
    static void rellenardatos(Scanner sc){
        
        posicion();
        jugadores();
        precios();
        
        
    }
    
    static void imprimefichajes(){
    
    for (int i =0; i < precios.size(); i++){
            System.out.println(" " +posicion.get(i)+ "- " +
            jugadores.get(i)+ " : " +precios.get(i));
        }
    
    total = calculartotal();
        System.out.println("Precio total: "+ total );
        System.out.println("");
    

    }
    
    static void imprimirfichados(){
        
        System.out.println("");
        System.out.println("Estos son los jugadores fichados");
        for (int i =0; i < preciosf.size(); i++){
            System.out.println((i+1) +"  "+ posicionf.get(i)+ "- " +
            jugadoresf.get(i)+ " : " +preciosf.get(i));
        }
        System.out.println(+presupuesto);
        System.out.println("");
        
    }
    

    static double calculartotal(){
        for (double d:precios){
            total+=d;     
        }
        return total;
    }
    
    /*static void fichar(int n){
        
        posicionf.add(posicion.get(n));
        jugadoresf.add(jugadores.get(n));
        int p=precios.get(n);
        preciosf.add(p);
        presupuesto -=p;
        
        imprimirfichados();
        
        posicion.remove(n);
        jugadores.remove(n);
        precios.remove(n);
        
        
    }*/
    
    
    static void fichar(int n) {

        posicionf.add(posicion.get(n));
        jugadoresf.add(jugadores.get(n));
        int p=precios.get(n);
        preciosf.add(p);
        nuevopre = presupuesto  - p;
        
        
        
        System.out.println("Has fichado a " + jugadores.get(n) + " por " + p + " millones.");
        imprimirfichados();
        
        System.out.println("Ahora tienes un presupuesto de "+nuevopre);
        posicion.remove(n);
        jugadores.remove(n);
        precios.remove(n);
        
        
}
    
    static void imprimelaPosicion(String pos){
        System.out.println("");
        System.out.println(pos+" DISPONIBLES:");
        for (int i = 0; i <precios.size(); i++) {
            if (pos.equals(posicion.get(i))) {
                System.out.println((i+1)+ " "+posicion.get(i)+" "+
                    jugadores.get(i)+ " " +precios.get(i));
            }
        }
        System.out.println("");
    }
    
    
     
}
