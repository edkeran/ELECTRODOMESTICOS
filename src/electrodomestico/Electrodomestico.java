
package electrodomestico;
/**
 * clase Padre o superclase de aqui heredan todas las hijas o subclases 
 * ademas implementa una interface que hace las subclases lo hagan tambien
 * @author Edgar Kreicj
 * @author Michael Cardenas
 */
public abstract class  Electrodomestico implements Interface {
    public static final double precioDefecto = 100;
    
    /**
     * variable que no cambia y se comparte a todas las clases
     */
    
    public static final int pesoDefecto = 5;
    /**
     * atributo para guardar el precio base de los eletrodomesticos
     */
    
    private double precioBase;
    /**
     * atributo  tipo enum que tiene ya predeterminado los colores
     */
    
    private Colores color;
    /**
     * atributo tipo enum que ya tiene predeterminado los valores
     */
    
    private Letra consumoEnergetico ;
    /**
     * atributo que manejara el peso de los electrodomesticos
     */
    
    private int peso;
    /**
     * atributo que hace las veces de bandera cuando no existe el consumo 
     * energetico
     */
    
    private int aux=0;
    /**
     * atributo encargado de manejar el tipo de electrodomestico tv o lavadora
     */
    private int tipo=0;
    
    /**
     * constructor que inicializa los atributos de la clase
     */
    public Electrodomestico() {
        this.color = Colores.BLANCO;
        this.consumoEnergetico = Letra.F;
        this.precioBase = precioDefecto;
        this.peso = pesoDefecto;
    }
/**
 * Constructor que recibe parametros y los inicializa
 * @param precioBase
 * @param color
 * @param consumoEnergetico
 * @param peso 
 */
    public Electrodomestico(int precioBase, Colores color, Letra consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    
/**
 * Cosntructor que inicializa los atributos de la clase tambien pero solo el precio y el peso
 * @param precioBase recibe el precio base de la clase
 * @param peso recibe el peso de los electrodomesticos
 * 
 */
    public Electrodomestico(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = Colores.BLANCO;
        this.consumoEnergetico = Letra.F;
    }
    
    /**
     * Metodo encargado de comprobar si la letra "consumo energetico es correcta"
     * @param letra recibe el parametro de la clase enum 
     * @return 
     */
    protected String comprobarConsumoEnergetico(Letra letra){
        if(getConsumoEnergetico() == Letra.A | getConsumoEnergetico() == Letra.B | getConsumoEnergetico() == Letra.C 
           | getConsumoEnergetico() == Letra.D | getConsumoEnergetico() == Letra.E | getConsumoEnergetico() == Letra.F){
            return "Consumo energetico correcto; letra correcta";
        }
        else{
            return "Consumo energetico incorrecto; letra erronea";
        }
}
   /**
    * metodo encargado de comprobar si el color es correcto
    * @param color recibe como parametro la clase enum de Colores
    * @return 
    */ 
    protected   String comprobarColor(Colores color){
        if(getColor() == Colores.AZUL | getColor() == Colores.BLANCO | getColor() == Colores.GRIS | getColor() == Colores.NEGRO
              | getColor() == Colores.ROJO){
                    return "Color correcto";
        }
        else{
            return "Color erroneo";
        }
    }
    
    /**
     * metodo encargado de calcular el precio final dependiendo del consumo energetico 
     * 
     */
    public void precioFinal(){
        if(getConsumoEnergetico() == Letra.A){
            precioBase = 100+precioBase;
        }
        else if((getConsumoEnergetico() == Letra.B)){
            precioBase = 80+precioBase;
        }
        else if(getConsumoEnergetico() == Letra.C){
            precioBase = 60+precioBase;
        }
        else if((getConsumoEnergetico() == Letra.D)){
            precioBase = 50+precioBase;
        }
        else if(getConsumoEnergetico() == Letra.E){
            precioBase = 30+precioBase;
        }
        else if((getConsumoEnergetico() == Letra.F)){
            precioBase = 10+precioBase;
        }
        else{
            aux=1;
            System.out.println("...No existe...");
        }
        if (aux==0){
        peso();
        }
        
    }
    
    /**
     * metodo encargado de calcular el precio base dependiendo del peso del electrodomestico
     */
    private void peso(){
    if(getPeso()>80){
        precioBase+=100;
      }
    else if ((getPeso()<=79)&&(getPeso()>=50)){
            precioBase+=80;
        }
    else if ((getPeso()<=49)&&(getPeso()>=20)){
            precioBase+=50;
        }
    else if ((getPeso()<=19)&&(getPeso()>=0)){
            precioBase+=10;
        }
    }
    
    /**
     * metodo de obtener precioBase
     * @return precioBase devuelve el contenido de este atributo
     */
    public double getPrecioBase() {
        return precioBase;
    }

    /**
     * setea o modifica el valor del atributo
     * @param precioBase recibe el precioBase
     */
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    
    /**
     * obtener color
     * @return color accede a este atributo
     */
    public Colores getColor() {
        return color;
    }
    
    /**
     * modificar
     * @param color  setea o modifica el color
     */
    public void setColor(Colores color) {
        this.color = color;
    }
    
    /**
     * obtener 
     * @return consumoEnergetico obtiene este atributo y maneja debido a que es privado 
     * eso hacen los getters
     */
    public Letra getConsumoEnergetico() {
        return consumoEnergetico;
    }
    
    /**
     * modificar o setear el valor del atributo si es necesario
     * @param consumoEnergetico  setear este valor que recibe
     */
    public void setConsumoEnergetico(Letra consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    
    /**
     * obtener 
     * @return peso obtiene y maneja este atributo
     */
    public int getPeso() {
        return peso;
    }
    
    /**
     * modifica o setea el valor que recibe
     * @param peso  recibe peso y si es necesario lo modifica
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }


    /**
     * obtener el atributo y manejarlo
     * @return tipo de electrodomestico
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * modifica o setea el valor que recibe
     * @param tipo setea este valor
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
