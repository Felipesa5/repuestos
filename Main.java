import java.util.ArrayList;

import partes.ParteCompuesta;
import partes.ParteSimple;

public class Main {
    public static void main(String[] args) {

    ArrayList<ParteCompuesta> partesCompuestas = new ArrayList<>();
    ArrayList<ParteSimple> partesSimples = new ArrayList<>();

    System.out.println("Agregar partes compuestas: ");
    ParteCompuesta pc = new ParteCompuesta(null, null, 0, 0);
    partesCompuestas.add(pc);

    System.out.println("Agregar partes simples: ");
    ParteSimple ps = new ParteSimple(null, null, 0);
    partesSimples.add(ps);
    
    }
}