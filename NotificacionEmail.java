public class NotificacionEmail extends Notificacion{
    String email;

    public NotificacionEmail(String mensaje, String email){
        super(mensaje);
        this.email=email;
    }

    @Override
    public void enviar(){
        System.out.println("Mensaje enviado a " + email + ": " + mensaje);
    }

}
