package clases;

public class Enfermo {

    //Atributos
    String nombrePaciente;
    int numSeguridadSocial;
    Cama cama;
    Medico medicoParaAsignar;


    public Enfermo() {//constructor vacio
    }

    //Metodos
    public void asignarCama(Cama cama1) {
        if (!cama1.estado) { //La cama esta ocupada (cama1.estado=false )==(!cama1.estado)
            System.out.println("La cama no se le puede asignar al paciente");
        } else { //La cama esta libre  ->cama1.estado = true;
            System.out.println("La cama se le ha asignado al paciente");
        }
    }

    public void desasignarCama(Cama cama){
        if (cama.estado) { //ocupada
            System.out.println("Se ha desasignado al paciente que estaba en ella");
            cama.liberarCama();

        } else { //libre
            System.out.println("La cama no se encuentra ocupada");
            cama.ocuparCama();
        }
    }

    public void asignarMedico(Medico medico) {
        this.medicoParaAsignar = medico;
        System.out.println("Se ha asignado un medico al paciente");
    }

    public void desasignarMedico () {
        this.medicoParaAsignar= null;
        System.out.println("Se ha desasignado un medico al paciente");

    }

    public Enfermo(String nombre, int numSeguridadSocial, Cama cama1, Medico medico1) {
        this.nombrePaciente = nombre;
        this.numSeguridadSocial = numSeguridadSocial;
        this.cama = cama1;
        this.medicoParaAsignar = medico1;
    }
    public void setNombre(String nombre) {

        this.nombrePaciente = nombre;
    }

    public void ingresarPaciente(String nombrePaciente) {
        System.out.println("El paciente se encuentra en el programa");
        //Al reintroducir los mismos datos del paciente mostrara este mensaje
    }



}












