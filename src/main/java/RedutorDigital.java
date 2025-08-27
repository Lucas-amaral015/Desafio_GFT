public class RedutorDigital {
    private int numero;

    public RedutorDigital(int numero) {
        this.numero = numero;
    }

    public int reduzirParaUmDigito() {
        int numeroAtual = numero;

        while (numeroAtual >= 10) {
            int somaDosDigitos = 0;
            int temp = numeroAtual;

            while (temp > 0) {
                somaDosDigitos += temp % 10;
                temp /= 10;
            }

            numeroAtual = somaDosDigitos;
        }

        return numeroAtual;
    }


}
