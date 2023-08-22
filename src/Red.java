import java.util.ArrayList;

public class Red {
    private ArrayList<Dispositivo> dispositivosConectados = new ArrayList<>();
    

    public ArrayList<Dispositivo> getDispositivos_conectados() {
        return dispositivosConectados;
    }

    public void conectarDispositivo(Dispositivo dispositivo) {
        dispositivosConectados.add(dispositivo);
        System.out.println(dispositivo.getNombre() + " se ha conectado a la red.");
    }
    public void setDispositivos_conectados(ArrayList<Dispositivo> dispositivos_conectados) {
        this.dispositivosConectados = dispositivos_conectados;
    }

    public void enviarMensaje(Dispositivo dispositivoOrigen, Dispositivo dispositivoDestino, String mensaje) {
        System.out.println("\n"+ dispositivoOrigen.getNombre() + " envió el mensaje '" +
                mensaje + "' a " + dispositivoDestino.getNombre() + ".");
    }
}
