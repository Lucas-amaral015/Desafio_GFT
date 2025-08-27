import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numeroInformado = sc.nextInt();

        RedutorDigital redutor = new RedutorDigital(numeroInformado);
        int resultadoFinal = redutor.reduzirParaUmDigito();

        System.out.println("Resultado final: " + resultadoFinal);

        sc.close();
    }


}
