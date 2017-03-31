
package electrodomestico;

public abstract class  Electrodomestico implements Interface {
    public static final double precioDefecto = 100;
    
    public static final int pesoDefecto = 5;
    
    private double precioBase;
    
    private Colores color;
    
    private Letra consumoEnergetico ;
    
    private int peso;
    
    private int aux=0;
    
    private int tipo=0;
    public Electrodomestico() {
        this.color = Colores.BLANCO;
        this.consumoEnergetico = Letra.F;
        this.precioBase = precioDefecto;
        this.peso = pesoDefecto;
    }

    public Electrodomestico(int precioBase, Colores color, Letra consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomestico(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = Colores.BLANCO;
        this.consumoEnergetico = Letra.F;
    }
    
    protected String comprobarConsumoEnergetico(Letra letra){
        if(getConsumoEnergetico() == Letra.A | getConsumoEnergetico() == Letra.B | getConsumoEnergetico() == Letra.C 
           | getConsumoEnergetico() == Letra.D | getConsumoEnergetico() == Letra.E | getConsumoEnergetico() == Letra.F){
            return "Consumo energetico correcto; letra correcta";
        }
        else{
            return "Consumo energetico incorrecto; letra erronea";
        }
}
    
    protected   String comprobarColor(Colores color){
        if(getColor() == Colores.AZUL | getColor() == Colores.BLANCO | getColor() == Colores.GRIS | getColor() == Colores.NEGRO
              | getColor() == Colores.ROJO){
                    return "Color correcto";
        }
        else{
            return "Color erroneo";
        }
    }
    
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
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    public Colores getColor() {
        return color;
    }
    public void setColor(Colores color) {
        this.color = color;
    }
    public Letra getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public void setConsumoEnergetico(Letra consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
