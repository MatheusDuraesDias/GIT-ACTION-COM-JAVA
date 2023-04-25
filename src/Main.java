import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner teclado = new Scanner(System.in);
        Colaborador[] colaboradores = new Colaborador[3];
        for (int i = 0; i<3; i++){
            System.out.println("Digite o nome do colaborador");
            String nome = teclado.nextLine();
            System.out.println("Digite o CPF do colaborador");
            int CPF = teclado.nextInt();
            System.out.println("Digite o telefone do colaborador");
            int telefone = teclado.nextInt();
            System.out.println("Digite a data de nascimento do colaborador");
            String dataNasc = teclado.nextLine();
            System.out.println("Digite a data de agendamento do colaborador");
            String dataAgen = teclado.nextLine();
            System.out.println("Digite o periodo em que o colaborador realizou o agendamento");
            String periodo = teclado.nextLine();

            Colaborador c = new Colaborador(nome, CPF, telefone, dataNasc, dataAgen, periodo);

            colaboradores[i] = c;
        }
    }
}