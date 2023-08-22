public class Dispositivo {
    private String nombre;
    private String ip_address;

    public Dispositivo(String nombre, String ip_address){
        this.nombre= nombre;
        this.ip_address= ip_address;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }
}
