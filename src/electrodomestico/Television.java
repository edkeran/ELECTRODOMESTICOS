
package electrodomestico;

/**
 * metodo que manejara las caracteristicas y resultados de la tv
 * @author Edgar Kreicj
 * @author Michael Cardenas
 */
public class Television extends Electrodomestico{
    /**
     * 
     * manejara la resolucion del tv
     */
    private int resolucion;
    
    /**
     * inicializa la tdt con false significa que no tiene esa caracteristica
     */
    private boolean Tdt=false;
    
    /**
     * resolucion por defecto;
     */
    public static final int resolucionDefecto = 20;
    
    /**
     * tdt por defecto que no cambiara en ningun momento del codigo
     */
    public static final boolean tdtDefecto = false;
    
    /**
     * constructor que inicializa valores de la propia clase y llama y setea un atributo de la superclase
     */
    public Television() {
        this.resolucion=resolucionDefecto;
        this.Tdt=tdtDefecto;
        super.setTipo(1);
    }
    
    /**
     * inicializa variables de la propia clase y superclase
     * @param precioBase recibe como parametro para inicializar
     * @param peso recibe como parametro para inicializar
     */
    public Television(int precioBase, int peso) {
        super(precioBase, peso);
        this.resolucion = resolucionDefecto;
        this.Tdt = tdtDefecto;
        super.setTipo(1);
    }

    /**
     * constructor que inicializa todos los atributos de la propia clase y superclase
     * @param resolucion
     * @param Tdt
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param peso 
     */
    public Television(int resolucion, boolean Tdt, int precioBase, Colores color, Letra consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.Tdt = Tdt;
    }
    
    /**
     * clase especializada que calcula el precio final y se hereda de la superclase
     * pero es obligatoria debido a que esta creada en la interface
     */
    @Override
    public void precioFinal(){
        super.precioFinal();
         double precioSeteo = 0;
            if(getResolucion() > 40){
                precioSeteo=super.getPrecioBase()*0.30;
                precioSeteo=precioSeteo+super.getPrecioBase();
                super.setPrecioBase(precioSeteo);
            }
            if(Tdt == true){
                precioSeteo=super.getPrecioBase()+50;
                super.setPrecioBase(precioSeteo);
            }
            System.out.println("PRECIO:"+super.getPrecioBase());
      }

    
    /**
     * metodo de obtener y manejar el atributo
     * @return resolucion
     */
    public int getResolucion() {
        return resolucion;
    }

    /**
     * setea o modifica la variable
     * @param resolucion 
     */
    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    
    /**
     * obtener  y manejar la variable o atributo
     * @return Tdt
     */
    public boolean isTdt() {
        return Tdt;
    }

    /**
     * setea o modifica el valor que recibe
     * @param Tdt modifica o serea si es necesario
     */
    public void setTdt(boolean Tdt) {
        this.Tdt = Tdt;
    }
}
