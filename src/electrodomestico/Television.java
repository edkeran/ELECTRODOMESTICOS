
package electrodomestico;

public class Television extends Electrodomestico{
    private int resolucion;
    private boolean Tdt=false;
    public static final int resolucionDefecto = 20;
    public static final boolean tdtDefecto = false;
    public Television() {
        this.resolucion=resolucionDefecto;
        this.Tdt=tdtDefecto;
        super.setTipo(1);
    }
    public Television(int precioBase, int peso) {
        super(precioBase, peso);
        this.resolucion = resolucionDefecto;
        this.Tdt = tdtDefecto;
        super.setTipo(1);
    }

    public Television(int resolucion, boolean Tdt, int precioBase, Colores color, Letra consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.Tdt = Tdt;
    }
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

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return Tdt;
    }

    public void setTdt(boolean Tdt) {
        this.Tdt = Tdt;
    }
    
}
