import clases.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int opcion = -1;
        int numSeguridadSocial;
        String nombre;
        Scanner sc = new Scanner(System.in);

        try {//Try catch para evitar que el programa termine si hay un error

            Hospital hospital = new Hospital("Hospital General", "Calle Principal, Ciudad");
            Planta planta1 = new Planta(1, "Trauma");
            Cama cama1 = new Cama(1, "Planta 1");
            Medico medico = new Medico("Dr. Pérez", "Pediatra");
            Enfermo enfermo = new Enfermo();



            do {



                System.out.println("MENU DE OPCIONES:" +
                        "\n1.- Introducir datos del paciente" +
                        "\n2.- Ingresar el paciente" +
                        "\n3.- Dar el alta al paciente " +
                        "\n0.- Salir");

                System.out.println("Enter la opcion elegida: ");

                opcion = sc.nextInt();

                //Ejemplo de switch case en Java
                switch (opcion) {

                    case 1://Introducir datos del paciente

                        System.out.println("Introduzca los datos que se le piden a continuacion");
                        System.out.println("Introducir el nombre");
                        nombre = sc.next();//introduce el nombre
                        enfermo.setNombre(nombre);
                        System.out.println("Introducir numero de la seguridad social");
                        numSeguridadSocial = sc.nextInt();//introduce el numero de la seguridad social
                        enfermo.ingresarPaciente(nombre);

                        break;
                    case 2://Ingresar el paciente
                        System.out.println("Has seleccionado ingresar paciente");
                        enfermo.asignarCama(cama1);//asigno una cama
                        enfermo.asignarMedico(medico);//asigno el medico

                        break;
                    case 3://Dar el alta ala paciente
                        System.out.println("Has seleccionado dar de alta al paciente");
                        enfermo.desasignarCama(cama1);//quito la asignacion
                        enfermo.desasignarMedico();//quito el medico asignado

                        break;

                    case 0://Salir
                        System.out.println("Adios, hasta pronto!");

                        break;
                    default:
                        System.out.println("Número no reconocido");
                        break;
                }//switch

                System.out.println("\n"); //Mostrar un salto de línea



            } while (opcion != 0);//while
            System.out.println("Hasta pronto");
        } //try
        catch (Exception e) {
            System.out.println("Uoop! Error!");
        }//catch
    }
}