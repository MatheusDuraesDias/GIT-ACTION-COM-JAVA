import java.util.Date;

public class Colaborador {
    private String nome;
    private int CPF;
    private int telefone;
    private String dataNascimento;
    private String dataDeAgendamento;
    private String periodo;

    public Colaborador(String nome, int cpf, int telefone, String dataNascimento, String dataDeAgendamento, String periodo) {
        this.nome = nome;
        CPF = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataDeAgendamento = dataDeAgendamento;
        this.periodo = periodo;
    }
}
