package partes;

public class ParteCompuesta extends Parte {

    private double precioEnsamble;

    public ParteCompuesta(String numero, String nombre, double precioBase, double precioEnsamble) {
        super(numero, nombre, precioBase);
        this.precioEnsamble = precioEnsamble;
        
    }

    public double obtenerPrecioFinalCompuesta(){
        double precioFinal = ((precioBase + precioEnsamble)*1.11);
        return precioFinal;
    }

    public double getPrecioEnsamble() {
        return precioEnsamble;
    }

    public void setPrecioEnsamble(double precioEnsamble) {
        this.precioEnsamble = precioEnsamble;
    }
    
    
}
