package clases;

public class Cama extends Planta{
    int numCama;
    boolean estado;

    public Cama(int numPlanta, String descripcion, int numCama) {//constructor
        super(numPlanta, descripcion);
        this.numCama = numCama;
        this.estado = false;
    }

}
