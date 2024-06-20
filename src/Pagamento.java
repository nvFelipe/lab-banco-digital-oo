public class Pagamento {
    private String nomePagamento;
    private double valorPagamento;

    public Pagamento(String nomePagamento, double valorPagamento, boolean repetirPagamento) {
        this.nomePagamento = nomePagamento;
        this.valorPagamento = valorPagamento;
    }

    public String getNomePagamento() {
        return nomePagamento;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setNomePagamento(String nomePagamento) {
        this.nomePagamento = nomePagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public String pagar(){

        return "Voce pagou: " + valorPagamento + "em" + nomePagamento + "\n" ;
    }
}
