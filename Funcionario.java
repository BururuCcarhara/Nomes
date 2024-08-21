package NomeLore;

public class Funcionario {

	int ID;
	String nome;
	int senha;
	String permissao;
	String usuario;
	
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID= ID;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome= nome;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha=senha;
	}
	public String getPermissao() {
		return permissao;
	}
	public void setPermissao(String permissao) {
		this.permissao= permissao;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario=usuario;
	}
}
