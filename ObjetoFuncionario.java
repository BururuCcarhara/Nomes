package NomeLore;

public class ObjetoFuncionario {

	public static void main(String[] args) {
		Funcionario Funcionario1 = new Funcionario();
		
		Funcionario1.setID(3333);
		Funcionario1.setNome("Aguinaldo");
		Funcionario1.setSenha(40028922);
		Funcionario1.setPermissao("acesso restrito");
		Funcionario1.setUsuario("Jorginho matador de porco");
		
		
		System.out.println(Funcionario1.getID());
		System.out.println(Funcionario1.getNome());
		System.out.println(Funcionario1.getSenha());
		System.out.println(Funcionario1.getPermissao());
		System.out.println(Funcionario1.getUsuario());


		}

	}
