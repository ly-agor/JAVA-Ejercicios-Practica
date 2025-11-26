public class NotificacionSMS extends Notificacion{

    int telf;

    public NotificacionSMS(String mensaje, int telf){
        super(mensaje);
        this.telf=telf;
    }

    @Override
    public void enviar(){
        System.out.println("Mensaje enviado al número " + telf + ": " + mensaje);
    }
}
