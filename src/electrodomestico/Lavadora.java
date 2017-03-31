
package electrodomestico;

public  class Lavadora extends Electrodomestico{
    private int carga;
    public  int cargaDefecto = 5;
    public static final int adicional=50;
    double precio;
    public Lavadora() {
        carga=cargaDefecto;
        super.setTipo(2);
    }
    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
        carga=cargaDefecto;
        super.setTipo(2);
    }

    public Lavadora(int carga, int precioBase, Colores color, Letra consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
        super.setTipo(2);
    }

    public int getCarga() {
        return carga;
    }
    
    public void setCarga(int carga) {
        this.carga = carga;
    }
    
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
