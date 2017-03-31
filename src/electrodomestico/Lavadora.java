
package electrodomestico;
/**
 * clase que manejara las caracteristicas y funciones de la lavadora y hereda de la superclase
 * @author Edgar Kreicj
 * @author Michael Cardenas
 */
public  class Lavadora extends Electrodomestico{
    /**
     * guardara el peso del electrodomestico
    */
    
    private int carga;
    
    /**
     * variable inicializada en una carga de 5kg
     */
    public  int cargaDefecto = 5;
    
    /**
     * Variable estatica que nunca cambiara en el programa.
     */
    public static final int adicional=50;
    
    /**
     * manejara el precio de la lavadora
     */
    double precio;
    
    /**
     * constructor de la clase y que llama e inicializa un atributo de  la clase padre y lo setea con el valor 2
     */
    public Lavadora() {
        carga=cargaDefecto;
        super.setTipo(2);
    }
    
    /**
     * Constructor que recibe el precio base y el peso y los inicializa y llama y setea un atributo de la clase padre
     * @param precioBase
     * @param peso 
     */
    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
        carga=cargaDefecto;
        super.setTipo(2);
    }

    /**
     * Constructor que contiene atributos de la propia clase y ademas los de la superclase
     * @param carga recibe y inicializa
     * @param precioBase recibe y inicializa
     * @param color recibe y inizializa
     * @param consumoEnergetico recibe e inizialliza
     * @param peso recibe y inicializa
     */
    public Lavadora(int carga, int precioBase, Colores color, Letra consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
        super.setTipo(2);
    }

    /**
     * obtener y manejar el dato carga
     * @return carga es el dato que devuelve
     */
    public int getCarga() {
        return carga;
    }
    
    /**
     * setea o modifica el valor si es necesario
     * @param carga lo modifica 
     */
    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    /**
     * Metodo especializado que heredo de la clase padre pero se mejoro aqui y solo tomara en cuanta este
     * es obligatorio para todas las clases debido a que se encapsulo en la interface
     * calcula el precio de la lavadora
     */
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(getCarga() > 30){
            precio=super.getPrecioBase()+adicional;
            super.setPrecioBase(precio);
            System.out.println(getCarga());
        }
        System.out.print(" PRECIO:"+ super.getPrecioBase()+"\n");
    }
}
