public class TabelaDeMedidas {
    public static void main(String[] args) {
        String medida = "M";

        switch (medida) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Médio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            case "XG":
                System.out.println("Extra Grande");
                break;
            default:
                System.out.println("INDEFINIDO");
                break;
        }
    }
}
