package NomeLore;

public class Computador {

	String nome;
	String cor;
	String tamanho;
	String marca;
	String acessorios;
	String funcionalidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome= nome;
}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor= cor;
}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho= tamanho;
}	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca= marca;
}
	public String getAcessorios() {
		return acessorios;
	}
	public void setAcessorios(String acessorios) {
		this.acessorios= acessorios;
}	
	public String getFuncionalidade() {
		return funcionalidade;
}
	public void setFuncionalidade(String funcionalidade) {
		this.funcionalidade= funcionalidade;
}	
	public String ligar() {
		return "Liga";
	}	
	public String desligar() {
		return "Desligar";
	}	
	}
