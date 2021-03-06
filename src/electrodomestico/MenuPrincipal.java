
package electrodomestico;

import java.util.Scanner;

/** 
 * clase encargada de leer los datos para el funcionamiento logico del programa
 * @author EDGAR ANDRES KREJCI BAUTISTA
 * @Michael Leandro Cardenas Villamil
 */
public class MenuPrincipal{
 
 int total=0;
 
 /**
  * encargado de guardar la eleccion de calcular la tv o la lavadora
  */
 int seleccion=0;
 
 /**
  * Variable encargada de almacenar la suma total de todos los objetos 
  */
 double totalSuma=0;
 /**
  * creacion del objeto de la clase Scanner para el manejo de lectura de datos 
  */
 Scanner sc= new Scanner(System.in);
 
 /**
  * creacion del array de objetos de 10 posiciones de la superclase
  */
 Electrodomestico[] vector= new Electrodomestico[10];
 
 /**
  * metodo publico que reune dos metodos mas privados
  */
    public MenuPrincipal() {
        instanciarObjetos();
        imprimirCalculos();
        leerColor();
    }
    
    /**
     * metodo que usa polimorfismo para que la superclase cambie de atributos y pide 
     * los datos necesario para guardarlos en objetos
     */
    private void instanciarObjetos(){
        for (int i=0;i<10;i++){
        System.out.println("INGRESE 1 SI DESEA PROCESAR TELEVISON O 2 SI DESEA PROCESAR LAVADORA EN CASO DE QUE DESSE DEJAR DE INGRESAR OBJETOS INGRESE 3");
         seleccion=sc.nextInt();
         
         if (seleccion==1){
           System.out.println("HA INGRESADO EL OBJETO TELEVISION");
           ImprimirMenu(); //llama a la funcion imprimir menu
           seleccion=sc.nextInt();
           /**
            * creacion del objeto tipo electrodomestico
            */
             Electrodomestico e = new Television();
             vector[i]=e;
             
           if (seleccion==2){
                int precioBase,peso;
                System.out.println("INGRESE EL PRECIO BASE DEL TELEVISOR");
                precioBase=sc.nextInt();
                System.out.println("INGRESE EL PESO DEL TELEVISOR");
                peso=sc.nextInt();
                /**
                 * creacion del objeto y guardara los datos que recibe
                 */
                Electrodomestico h = new Television(precioBase,peso); 
                vector[i]=h;
                }
           if (seleccion==3){
                    int precioBase,peso,resolucion;
                    int color,letra;
                    boolean tdt;
                    System.out.println("INGRESE EL PRECIO BASE DEL TELEVISOR");
                    precioBase=sc.nextInt();
                    System.out.println("INGRESE EL PESO DEL TELEVISOR");
                    peso=sc.nextInt();
                    System.out.println("INGRESE true SI TIENE TDT EN CASO CONTRARIO INGRESE false");
                    tdt=sc.nextBoolean();
                    System.out.println("INGRESE LA RESOLUCION DEL TELEVISOR");
                    resolucion=sc.nextInt();
                    System.out.println("INGRESE EL COLOR DEL TELEVISOR 1. PARA BLANCO, 2 PARA NEGRO,3 PARA ROJO,4 PARA AZUL,5 PARA GRIZ");
                    color=sc.nextInt();
                    System.out.println("INGRESE EL TIPO DE CONSUMO 1 PARA A, 2 PARA B , 3 PARA C, 4 PARA D ,5 PARA E, 6 PARA F");
                    letra=sc.nextInt();
                    Electrodomestico k = new Television(resolucion,tdt,precioBase,tipoColor(color),tipoConsumoEnergetico(letra),peso);
                    vector[i]=k;
                }   
            }
         else if (seleccion==2){
                 System.out.println("HA INGRESADO EL OBJETO LAVADORA");
                 ImprimirMenu();
                 seleccion=sc.nextInt();
                 if (seleccion==1){
                    Electrodomestico l = new Lavadora();
                    vector[i]=l;
                    }
                if (seleccion==2){
                    int precioBase,peso;
                    System.out.println("INGRESE EL PRECIO BASE DE LA LAVADORA");
                    precioBase=sc.nextInt();
                    System.out.println("INGRESE EL PESO DE LA LAVADORA");
                    peso=sc.nextInt();
                    Electrodomestico l = new Lavadora(precioBase,peso);
                    vector[i]=l;
                    }
                if (seleccion==3){
                     int precioBase,peso,carga;
                     int color,letra;
                     System.out.println("INGRESE EL PRECIO BASE DE LA LAVADORA");
                     precioBase=sc.nextInt();
                     System.out.println("INGRESE EL PESO DEL LA LAVADORA");
                     peso=sc.nextInt();
                     System.out.println("INGRESE EL COLOR DE LA LAVADORA 1. PARA BLANCO, 2 PARA NEGRO,3 PARA ROJO,4 PARA AZUL,5 PARA GRIZ");
                     color=sc.nextInt();
                     System.out.println("INGRESE EL TIPO DE CONSUMO 1 PARA A, 2 PARA B , 3 PARA C, 4 PARA D ,5 PARA E, 6 PARA F");
                     letra=sc.nextInt();
                     System.out.println("INGRESE LA CARGA DE LA LAVADORA");
                     carga=sc.nextInt();
                     Electrodomestico l = new Lavadora(carga,precioBase,tipoColor(color),tipoConsumoEnergetico(letra),peso);
                     vector[i]=l;
                 }   
             }
                else if (seleccion==3){
                     break;
              } 
         }
    }
    
    /**
     * metodo que imprime la opcion a escojer
     */
    public void ImprimirMenu() {
        System.out.println("SI DESEA INGRESAR AL CONSTRCTOR VACIO DEL OBJETO  TODOS LOS CALCULOS SE HARAN CON LOS VALORES PREDETERMINADOS INGRESE 1");
        System.out.println("SI DESEA INGRESAR AL CONSTUCTOR EN DONDE INGRESARA EL PRECIO Y EL PESO CON EL RESTO POR DEFECTO INGRESE 2");
        System.out.println("SI DESEA INGRESAR AL CONSTRUCCTOR EN DONDE SE VA A INGREASAR TODA LA INFORMACION INGRESE 3");
    }
    
    /**
     * metodo valida el valor correcto para cada letra
     * @param letra variable que recibe y la usa 
     * @return devuelve el resultado final
     */
    private Letra tipoConsumoEnergetico(int letra){
        if (letra==1){
            return Letra.A;
        }
        if (letra==2){
            return Letra.B;
        }
        if (letra==3){
            return Letra.C;
        }
        if (letra==4){
            return Letra.D;
        }
        if (letra==5){
            return Letra.E;
        }
        if (letra==6){
            return Letra.F;
        }
        else {
            return Letra.F;
        }
    }
    
    /**
     * metodo que valoda el valor correcto segun el color
     * @param color lo recibe y con este realiza las comparaciones
     * @return 
     */
    private Colores tipoColor(int color){
        if (color==1){
            return Colores.BLANCO;
        }
        if (color==2){
            return Colores.NEGRO;
        }
        if (color==3){
            return Colores.ROJO;
        }
        if (color==4){
            return Colores.AZUL;
        }
        if (color==5){
            return Colores.GRIS;
        }
        else {
            return Colores.BLANCO;
        }
    }
    
    /**
     * metodo que imprime los calculos finales
     */
    private void imprimirCalculos(){
         for (int i=0;i<10;i++){
             if (vector[i]!=null){
                 if (vector[i].getTipo()==1){
                 System.out.print("TELEVISOR    ");
                 }
                 if (vector[i].getTipo()==2){
                     System.out.print("                           LAVADORA ");
                 }
                 vector[i].precioFinal();
                 totalSuma+=vector[i].getPrecioBase();
                }
         }
         System.out.println("LA SUMA TOTAL DE LOS OBJETOS ES DE:"+totalSuma);
    }
    /**
     * Metdo encargado de verificar el color ingresado por el usuario y el que se encuentre instaciado por defecto
     */
    private void leerColor(){
        byte ingrese;
        int color;
        for (int i=0;i<10;i++){
            if (vector[i]!=null){
                System.out.println("INGRESE 1 SI DESEA VERIFICAR COLOR DEL OBJETO EN LA POSICION  "+i+" ,2 PARA SALR ,EN CASO DE QUE DESEE EVALUAR EL SIGUIENTE OBJETO ESCRIBA OTRO NUMERO");
                ingrese=sc.nextByte();
                if (ingrese==1){
                    System.out.println("INGRESE EL COLOR A VERIFICAR");
                    System.out.println("1 PARA BLANCO,2 PARA NEGRO, 3 PARA ROJO,4 PARA AZUL Y 5 PARA GRIS");
                    color=sc.nextInt();
                    System.out.println(vector[i].comprobarColor(tipoColor(color)));
                }
                if (ingrese==2){
                    break;
                }
            }
        }
    }
}
