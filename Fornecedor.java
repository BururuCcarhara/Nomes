package NomeLore;

public class Fornecedor {

	int Id;
	String razaoSocial;
	String nomeFantasia;
	String cnpj;
	String endereco;
	String fone;
	String email;
	String inscricaoEstadual;
	
	public int getId() {
		return Id;
	}
	public void setID(int Id) {
		this.Id= Id;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNome(String nomeFantasia) {
		this.nomeFantasia= nomeFantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setSenha(String cnpj) {
		this.cnpj=cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setPermissao(String endereco) {
		this.endereco= endereco;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone=fone;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual=inscricaoEstadual;
	}
}
