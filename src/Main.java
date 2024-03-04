import clases.Cama;
import clases.Hospital;
import clases.Planta;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int opcion = -1;
        Scanner sc = new Scanner(System.in);

        try {//try and catch para los errores

            Hospital hospital = new Hospital("Hospital General", "Calle Principal, Ciudad");
            Planta planta1 = new Planta(1, "Trauma");
            Cama cama1 = new Cama(1, planta1);


            do {

                //Try catch para evitar que el programa termine si hay un error

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

                        break;
                    case 2://Ingresar el paciente

                        break;
                    case 3://Dar el alta ala paciente

                        break;

                    case 0://Salir
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Número no reconocido");
                        break;
                }//switch

                System.out.println("\n"); //Mostrar un salto de línea en Java



            } while (opcion != 0);//while
            System.out.println("Hasta pronto");
        } //try
        catch (Exception e) {
            System.out.println("Uoop! Error!");
        }//catch
    }
}