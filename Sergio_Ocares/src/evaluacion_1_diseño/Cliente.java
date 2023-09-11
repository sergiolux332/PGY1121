
package evaluacion_1_diseño;

public class Cliente{
    private String tipo;
    private int run;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String correo;
    
//----------------------------------------------
    
    public Cliente(){
        
    }
    public Cliente(String tipo ,int run, String nombre, String apellidoP, String apellidoM, String correo){
        this.tipo = tipo;
        this.run = run;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.correo = correo;
    }
    
//----------------------------------------------
    
    public String getTipo() {
        return tipo;
    }
    public int getRun() {
        return run;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidoP() {
        return apellidoP;
    }
    public String getApellidoM() {
        return apellidoM;
    }
    public String getCorreo(){
        return correo;
    }

    //----------------------------------------------
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setRun(int run) {
        this.run = run;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }

    
//-----------------4----------------------------    

    public String imprimirDatos() {
        return 
                "----------Datos del Cliente----------" +
                "\nTipo Cliente: "+ tipo + 
                "\nRun: " + run + 
                "\nNombre           : " + nombre + 
                "\nPrimer Apellido  : " + apellidoP + 
                "\nSegundo Apellido : " + apellidoM +
                "\nCorreo: " + correo;
    }
    
}
