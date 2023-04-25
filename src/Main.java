import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner teclado = new Scanner(System.in);

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

        System.out.println("Digite o nome do colaborador");
        String nome1 = teclado.nextLine();
        System.out.println("Digite o CPF do colaborador");
        int CPF1 = teclado.nextInt();
        System.out.println("Digite o telefone do colaborador");
        int telefone1 = teclado.nextInt();
        System.out.println("Digite a data de nascimento do colaborador");
        String dataNasc1 = teclado.nextLine();
        System.out.println("Digite a data de agendamento do colaborador");
        String dataAgen1 = teclado.nextLine();
        System.out.println("Digite o periodo em que o colaborador realizou o agendamento");
        String periodo1 = teclado.nextLine();

        Colaborador c1 = new Colaborador(nome1, CPF1, telefone1, dataNasc1, dataAgen1, periodo1);

        System.out.println("Digite o nome do colaborador");
        String nome2 = teclado.nextLine();
        System.out.println("Digite o CPF do colaborador");
        int CPF2 = teclado.nextInt();
        System.out.println("Digite o telefone do colaborador");
        int telefone2 = teclado.nextInt();
        System.out.println("Digite a data de nascimento do colaborador");
        String dataNasc2 = teclado.nextLine();
        System.out.println("Digite a data de agendamento do colaborador");
        String dataAgen2 = teclado.nextLine();
        System.out.println("Digite o periodo em que o colaborador realizou o agendamento");
        String periodo2 = teclado.nextLine();

        Colaborador c2 = new Colaborador(nome2, CPF2, telefone2, dataNasc2, dataAgen2, periodo2);

        Colaborador[] colaboradores = new Colaborador[3];
        colaboradores[0] = c;
        colaboradores[1] = c1;
        colaboradores[2] = c2;
    }
}