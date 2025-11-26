import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        NotificacionEmail n1 = new NotificacionEmail("Este es un mensaje por email", "ejemplo1@gmail.com");
        NotificacionPush n2 = new NotificacionPush("Este es un mensaje push", "Móvil");
        NotificacionSMS n3 = new NotificacionSMS("Este es un mensaje por SMS", 123456789);

        ArrayList<Notificacion> not = new ArrayList<>();
        not.add(n1);
        not.add(n2);
        not.add(n3);

        GestorNotificaciones gestor = new GestorNotificaciones();

        for (Notificacion n:not){
            gestor.procesar(n);
        }
    }
}
