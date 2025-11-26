public abstract class Notificacion {
    String mensaje;

    public Notificacion(String mensaje){
        this.mensaje=mensaje;
    }

    public abstract void enviar();
}
