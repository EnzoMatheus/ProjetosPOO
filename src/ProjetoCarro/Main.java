package ProjetoCarro;

public class Main {
    public static void main(String args[]){
        Proprietario proprietario = new Proprietario();
        proprietario.nome = "Enzo";
        proprietario.bairro = "Marco";
        proprietario.cep = "66095-400";
        proprietario.cidade = "Belém";
        proprietario.complemento = "Perimetral";
        proprietario.cpf = "03695494219";
        proprietario.dataNascimento = "27/09/1999";

        Carro carro = new Carro();
        carro.nPortas = 5;
        carro.nMarchas  = 5;
        carro.marchaAtual=3;
        carro.velocidadeAtual = 80;
        System.out.println(carro.velocidadeAtual);
        carro.acelera();
        System.out.println(carro.velocidadeAtual);

        System.out.println(carro.marchaAtual);
        carro.trocarMarcha(4);
    }
}
