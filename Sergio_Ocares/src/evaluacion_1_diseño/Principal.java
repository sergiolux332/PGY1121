//Sergio Ocares
package evaluacion_1_diseño;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Cliente cliente1 = null;
        Evento evento1 = null;
        
        String tipo = "";
        String nombre = "";
        String apellidoP = "";
        String apellidoM = "";
        String correo = "";
        
        int z = 0;
        while (z < 1){
        
        System.out.println("\n___________________________________________\n\n");
        System.out.println("PROGRAMA PARA CREAR EVENTOS Y CLIENTES 2023!");
        System.out.println("\n___________________________________________\n");
        
        System.out.println("Ingrese 1 para ingresar un cliente");
        System.out.println("Ingrese 2 para ingresar un evento");
        System.out.println("Ingrese 3 para ver informacion del evento ");
        System.out.println("Ingrese 4 para realizar un descuento: ");
        System.out.println("Ingrese 5 para salir:\n ");
        int seleccion = leer.nextInt(); 
            
            switch(seleccion){
                case 1:
                    int i=0;
                    while (i<1){ 
                        System.out.println("\nIngrese el Tipo de cliente:");
                        System.out.println(" Ingrese 1 cliente Nuevo");
                        System.out.println(" Ingrese 2 cliente Antiguo");

                        int responce = leer.nextInt();
                        if (responce == 1){
                            i=1;
                            tipo = "Nuevo";
                        }
                        else if(responce == 2){
                            i=1;
                            tipo = "Antiguo";
                        }
                        else{
                            System.out.println(" ---> Ingrese 1 o 2!\n");
                        }
                    }

                    System.out.println("\nIngrese Run del cliente: ");
                    int run = leer.nextInt();

                    nombre ="";
                    i = 0;
                    while (i<1){
                        System.out.println("\nIngrese su Nombre: ");
                        nombre = leer.next();
                        if ("".equals(nombre) || " ".equals(nombre)){
                            System.out.println("---> Por favor ingrese un nombre...\n");
                        }
                        else{
                             i = 1;
                        }
                    }

                    System.out.println("\nPorfavor ingrese su apellido paterno: ");
                    apellidoP = leer.next();
                    System.out.println("\nPorfavor ingrese su apellido materno: ");
                    apellidoM = leer.next();
                    System.out.println("\nPorfavor ingrese su correo electronico: ");
                    correo = leer.next();

                    
                    cliente1 = new Cliente(tipo, run, nombre, apellidoP, apellidoM, correo);
                    
                    break;
//------------------------------------------------------------------
                
                case 2:
                    System.out.println("\n------DATOS DEL EVENTO------\n");
                    String nombreEvento ="";
                    i = 0;
                    while (i<1){
                        System.out.println("Ingrese Nombre del evento: ");
                        nombreEvento = leer.next();
                        if ("".equals(nombre) || " ".equals(nombre)){
                            System.out.println("\nPor favor ingrese un \nnombre valido para el evento!\n");
                        }
                        else{
                             i = 1;
                        }
                    }

                    leer.nextLine();
                    System.out.println("\nIngrese la direccion: ");
                    String direccion = leer.nextLine();

                    //------------------------------------------------------------------ 

                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

                    LocalDate fecha = null;
                    boolean validacion = false;

                    String leerFecha = "";

                    while (validacion == false) {
                        System.out.println("\nIngresa una fecha en el formato dd-mm-yyyy: ");
                        leerFecha = leer.nextLine();

                        try {
                            fecha = LocalDate.parse(leerFecha, formato);
                            validacion = true;
                        } 
                        catch (DateTimeParseException e) {
                            System.out.println("\n_______________________________________________\n");
                            System.out.println("---> Ingrese en el formato que se le pide! <---");
                            System.out.println("_______________________________________________\n");
                        }
                    }

                    //------------------------------------------------------------------

                    int costo = 0;
                    i=0;
                    while(i<1){ 
                        System.out.println("\nIngrese el costo: ");
                        costo = Integer.parseInt(leer.nextLine());;
                        if (costo<150000){
                            System.out.println("\n---> El costo debe ser <---\n---> mayor a $150.000! <---\n");
                        }
                        else{
                             i = 1;
                        }
                    }
                    evento1 = new Evento(nombre, direccion, leerFecha, costo, cliente1);
                    break;
//------------------------------------------------------------------
                case 3:
                    System.out.println(evento1.cincoPorciento());
                    System.out.println(evento1.imprimirDatos());
                    System.out.println(evento1.getcliente());
                    
                    break;
//------------------------------------------------------------------
                case 4:
                    System.out.println(evento1.cincoPorciento());
                    System.out.println("\nSe ha realizado un descuento\n");
                    break;
//------------------------------------------------------------------
                case 5:
                    System.out.println(evento1.correo());
                    System.out.println("Ingrese enter para continuar");
                    leer.next();
                    break;
//------------------------------------------------------------------
                default:
                    System.out.println("\nSeleccione una opcion valida!\n");
            }    
        }
    }
}
