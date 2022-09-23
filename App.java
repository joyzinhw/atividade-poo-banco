import java.util.Scanner;

public class App {
    private static final int _5 = 5;

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int op;

        do{

        System.out.println("1.Abrir conta");
        System.out.println("2.Sacar");
        System.out.println("3.Depositar");
        System.out.println("4.Saldo");
        System.out.println("5.Sair");
        op= input.nextInt();

        }while(op != _5);

    }
}
