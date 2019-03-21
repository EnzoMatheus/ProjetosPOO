package ProjetoCarro;

public class Carro {
    String Modelo, Cor, Marca, Proprietario, chassi;
    boolean tetoSolar, cambioAutomatico;
    double volumeCombustivel, velocidadeAtual, VolumeCombustivel,velocidadeMaxima;
    int ano, nPortas, nMarchas, marchaAtual;
    Proprietario proprietario;
    void acelera(){
        velocidadeAtual += 1;
    }
    void freia(){
        velocidadeAtual += 0;
    }
    void trocarMarcha(int marchaTrocada){
        if (marchaTrocada > nMarchas) {
            System.out.println("Error ");
        }else{
            marchaAtual = marchaTrocada;
        }

    }
    void reduzMarcha(){
        marchaAtual -= 1;
    }

}
