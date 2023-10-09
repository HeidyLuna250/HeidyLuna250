package Modelo;

/*** @author Heidy
 */
public class Clientes {
    private int id_Clintes;
    private String Nombres;
    private String Apellidos;
    private String Cedula;
    private String Télefono;
    private String Sexo;
    private String Municipio;
    private String TipoCliente;

    public Clientes(int id_Clintes, String Nombres, String Apellidos, String Cedula, String Télefono, String Sexo, String Municipio, String TipoCliente) {
        this.id_Clintes = id_Clintes;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Cedula = Cedula;
        this.Télefono = Télefono;
        this.Sexo = Sexo;
        this.Municipio = Municipio;
        this.TipoCliente = TipoCliente;
    }

    public Clientes(String Nombres, String Apellidos, String Cedula, String Télefono, String Sexo, String Municipio, String TipoCliente) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Cedula = Cedula;
        this.Télefono = Télefono;
        this.Sexo = Sexo;
        this.Municipio = Municipio;
        this.TipoCliente = TipoCliente;
    }

    public int getId_Clintes() {
        return id_Clintes;
    }

    public void setId_Clintes(int id_Clintes) {
        this.id_Clintes = id_Clintes;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getTélefono() {
        return Télefono;
    }

    public void setTélefono(String Télefono) {
        this.Télefono = Télefono;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public String getTipoCliente() {
        return TipoCliente;
    }

    public void setTipoCliente(String TipoCliente) {
        this.TipoCliente = TipoCliente;
    }
    
}
