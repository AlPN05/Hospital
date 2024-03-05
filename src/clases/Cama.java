package clases;

public class Cama {

    //Atributos
     int numCama;
    boolean estado;
    String numPlanta;

    public Cama(int numCama, String numPlanta) {//Constructor
        this.numCama = numCama;
        this.estado = true;
        this.numPlanta = numPlanta;
    }
    //Metodos para asignar o desasignar las camas
    public void ocuparCama() {

        this.estado = false;
    }

    public void liberarCama() {

        this.estado= true;
    }

}
