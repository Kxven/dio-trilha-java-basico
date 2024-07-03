public class Nota {
    public static void main(String[] args) {
        int nota = 6;
        //Condição Ternária
        String Resultado = nota >=7 ? "APROVADO!!!" : nota >=6 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(Resultado);
        
        // if(nota >= 7)
        //     System.out.println("Aprovado!!!");

        // //Condicional encandeada
        // else if(nota >=5 && nota < 7)
        //     System.out.println("Recuperação!!!");

        // else
        //     System.out.println("Reprovado!!!");
    }
}
