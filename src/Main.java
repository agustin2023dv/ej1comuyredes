public class Main {
    public static void main(String[] args) {

        Red red = new Red();

    Dispositivo dispositivo1 = new Dispositivo("dipositivo1", "191.201.21");
    Dispositivo dispositivo2 = new Dispositivo("dipositivo2", "191.251.21");

    red.conectarDispositivo(dispositivo1);
        red.conectarDispositivo(dispositivo2);

}
}