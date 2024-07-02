public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada:  " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.desligar();
        System.out.println("Tv ligada:  " + smartTv.ligada);

        smartTv.mudarCanal(35);
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);
    }
}
