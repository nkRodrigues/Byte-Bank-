public abstract class Conta {

	private int saldo;
	private int numero;
	private int agencia;
	private Cliente titular;

	public Conta(int numero, int agencia) {
		this.numero = numero;
		this.agencia = agencia;
		if (numero <= 0) {
			System.out.println("numero inválido");

		}
		if (agencia <= 0) {
			System.out.println("agencia invalida");

		}
	}

	public int getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void deposita(double valor) {
		this.saldo += valor;

	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Aguardando resposta do servidor...");
			System.out.println("Saque efetuado com sucesso!!!");
			return true;
		} else {
			System.out.println("Aguardando o servidor..");
			System.out.println("Saldo insuficiente!!");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.println("Aguardando resposta do servidor");
			System.out.println("Transferencia efetuada com sucesso");
			System.out.println("Saldo atual: " + this.saldo);
			return true;
		} else {
			System.out.println("Aguardando resposta do servidor");
			System.out.println("Saldo insuficiente");
			return false;
		}
	}

}