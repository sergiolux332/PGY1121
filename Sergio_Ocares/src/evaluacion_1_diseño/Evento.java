package evaluacion_1_diseño;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Evento {
    
    private String nombre;
    private String direccion;
    private String fecha;
    private int costo;
    private Cliente cliente;

//----------------------------------------------    

    public Evento() {
    }
    public Evento(String nombre, String direccion, String fecha, int valor, Cliente cliente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fecha = fecha;
        this.costo = valor;
        this.cliente = cliente;
    }

//----------------------------------------------    

    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getFecha() {
        return fecha;
    }
    public int getCosto() {
        return costo;
    }
    public Cliente getcliente(){
        return cliente; 
    }
    
    //----------------------------------------------  
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
//--------------------4-------------------------  

    public String imprimirDatos() {
        return 
                "#####################################\n" + 
                "---------------Boleta----------------\n" + 
                "\nNombre Evento: " + nombre + 
                "\nDireccion: " + direccion + 
                "\nFecha: " + fecha + 
                "\nCosto: " + costo +
                "\n"+ cliente.imprimirDatos() + "\n\n" + 
                "#####################################\n\n";
    }
    
    public String cincoPorciento(){
        
        System.out.println("________________________________");
        
        int temporal = getCosto();
        if ("Nuevo".equals(cliente.getTipo())){
            System.out.println("\nEl cliente es nuevo, obtiene 5% de descuento\n");
            setCosto((int) (temporal*0.95));
        }
        else if(getCosto()>=1000000){
            System.out.println("\nCosto por sobre un millon, obtiene 5% de descuento\n");
            setCosto((int) (temporal*0.95));
        }
        else{
            System.out.println("\n________________________________");
            System.out.println("El cliente no es nuevo ni paga un");
            System.out.println("monto mayor a un millon...");
            System.out.println("No se le aplicara descuento del 5%\n");
        }
        return "____";
    }
    
    public String correo()
    {   
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        LocalDate fecha2 = LocalDate.parse(fecha, formato);
        
        LocalDate actual = LocalDate.now();
        String actualFormateado = actual.format(formato);
        LocalDate actual2 = LocalDate.parse(actualFormateado, formato);
        
        long diferencia = ChronoUnit.DAYS.between( actual2 , fecha2);
       
        if(diferencia < 2){
            System.out.println("\n____________________________________________");
            System.out.println("La diferencia en dias es: " + diferencia);
            System.out.println("Enviando correo a " + cliente.getCorreo());
            System.out.println("Debe apresurarse su evento: "+ nombre + " es el dia que viene!");
            System.out.println("\n-------------Sus datos-------------");
            System.out.println(cliente.imprimirDatos());
        }
        else{
            System.out.println("Quedan un total de: "+diferencia+" dias para el evento!");
            System.out.println("Se le enviara un correo a "+cliente.getCorreo()+ " con sus datos cuando falte 1 dia!");
        }
        return "";
    }
}

/*
        Debe existir un método que permita “enviar un correo” de 
        recordatorio al cliente, un día antes del evento. 
        
        El mensaje debe contener, todos los datos de los clientes y el evento.

    */  