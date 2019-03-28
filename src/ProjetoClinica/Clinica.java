package ProjetoClinica;

public class Clinica {
    public static void main(String args[]){
    Paciente paciente = new Paciente();
    paciente.nome = "Enzo";

    Medico medico = new Medico();
    medico.nome = "augustos";
    medico.especilidade = "Dermatologista";

    AtendimentoMedico atendimento = new AtendimentoMedico();
    atendimento.dataConsulta = "23/09/2019";
    atendimento.paciente = paciente;
    atendimento.medico = medico;
    }
}
