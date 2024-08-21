package NomeLore;

public class ObjetoFornecedor {

	public static void main(String[] args) {
Fornecedor fornecedor1 = new Fornecedor();
		
		fornecedor1.setID(2424);
		fornecedor1.setNomeFantasia("Aguinaldo");
		fornecedor1.setCnpj("coisa de adulto");
		fornecedor1.setEndereco("praia do araldo");
		fornecedor1.setFone("Sansung");
		fornecedor1.setInscricaoEstadual("desempregado");
		
		
		
		System.out.println(fornecedor1.getId());
		System.out.println(fornecedor1.getNomeFantasia());
		System.out.println(fornecedor1.getCnpj());
		System.out.println(fornecedor1.getEndereco());
		System.out.println(fornecedor1.getFone());
		System.out.println(fornecedor1.getInscricaoEstadual());

		}

	}
