import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Pagamento> listaPagamentos = new ArrayList<>();

        listaPagamentos.add(new PagamentoCartao());
        listaPagamentos.add(new PagamentoBoleto());


        for (int indice = 0; indice < listaPagamentos.size(); indice++) {
            Pagamento pagamento = listaPagamentos.get(indice);
            pagamento.processarPagamento();
        }

    }
}
