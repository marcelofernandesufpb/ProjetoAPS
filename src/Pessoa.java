
public class Pessoa {
	
	private String nome;
	private int idade;
	private String cidade;

	public Pessoa(){
		nome  = "Jos�";
		idade = 20;
		cidade = "Jo�o Pessoa";
	}
	public boolean isIniciado(){
		return true;
	}
	
	public boolean isTerminado(){
		return false;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String m){
		this.nome = m;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int i){
		this.idade = i;
	}

	public String getCidade(){
		return cidade;
	}
	
	public void setCidade(String c){
		this.cidade = c;
	}

}
