package partes;

public class ParteSimple extends Parte {



    public ParteSimple(String numero, String nombre, double precioBase) {
        super(numero, nombre, precioBase);
        
    }

    public double getPrecioBase(){
        return this.precioBase;
    }

    public double obtenerPrecioFinal(){
        return (this.precioBase * 1.08);
    }
    
}
