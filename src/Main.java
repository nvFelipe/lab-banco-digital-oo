
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Cliente felipe = new Cliente();
		felipe.setNome("Felipe");

		Conta cc2 = new ContaCorrente(felipe);
		cc2.imprimirExtrato();
		cc2.depositar(1000.00);
		cc2.imprimirExtrato();
		cc2.pagar(150,"Escola");

	}

}
