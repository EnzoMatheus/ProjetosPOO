public class ProjetoPraia {
    public static void main(String args[]){
        crianca c1 = new crianca();
        c1.altura = 1.6;
        c1.corCabelo = " loiro";
        c1.corPele = "Branca ";
        c1.idade = 10;
        c1.brincar();
        c1.correr(100);
        String sorriso = c1.sorrir();

        System.out.println(c1.altura);
    }

}
