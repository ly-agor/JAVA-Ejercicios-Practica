public class NotificacionPush extends Notificacion{

    String dispositivo;

    public NotificacionPush(String mensaje, String dispositivo){
        super(mensaje);
        this.dispositivo=dispositivo;
    }

    @Override
    public void enviar(){
        System.out.println("Mensaje enviado al dispositivo " + dispositivo + ": " + mensaje);
    }
}
