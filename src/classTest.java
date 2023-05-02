import java.util.Scanner;

public class classTest {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Colaborador c = new Colaborador("Alfredo Games", 89765432, 9876543, "01/01/2001", "01/01/2023", "manhã");

        Colaborador c1 = new Colaborador("Alfredo Games", 89765432, 9876543, "01/01/2001", "01/01/2023", "manhã");

        Colaborador c2 = new Colaborador("Alfredo Games", 89765432, 9876543, "01/01/2001", "01/01/2023", "manhã");

        Colaborador[] colaboradores = new Colaborador[3];
        colaboradores[0] = c;
        colaboradores[1] = c1;
        colaboradores[2] = c2;

        for (int i = 0; i<colaboradores.length; i++){
            System.out.println(colaboradores[i].toString());
        }
    }
}
