public class Main {
    static void main(String[] args) {

        Ave a = new Ave();
        Pajaro p = new Pajaro();
        Avion av = new Avion();

        a.volar();
        p.volar();
        av.volar();

    }

    public interface Volador{
        void volar();
    }

    public static class Ave implements Volador{
        @Override
        public void volar(){
            System.out.println("El ave vuela");
        }
    }

    public static class Pajaro implements Volador{
        @Override
        public void volar(){
            System.out.println("El pájaro vuela");
        }
    }

    public static class Avion implements Volador{
        @Override
        public void volar(){
            System.out.println("El avión vuela");
        }
    }
}
