import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int custoFabrica = scan.nextInt();
        int porcentagemDistribuidor = scan.nextInt();
        int percentualImpostos = scan.nextInt();

        int distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        int valorImpostos = (custoFabrica * percentualImpostos) / 100;

        int custoConsumidor = distribuidor + valorImpostos + custoFabrica;

        System.out.println(custoConsumidor);
    }
}