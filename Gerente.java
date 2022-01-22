
public class Gerente extends Funcionario {

	private int senha;

	public Gerente(int senha) {

	}
	
	public double getBonificacao(){
		return super.getSalario() * 0.3 + super.getSalario() ;
	}

	public boolean setSenha(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
		

	}
	
	
}
