package NomeLore;

public class ObjetosComputador {

	public static void main(String[] args) {
		
		Computador Computador1 = new Computador();
		
	Computador1.setNome("Computador");
	Computador1.setCor("Preto");
	Computador1.setTamanho("Médio/Grande");
	Computador1.setMarca("Positivo");
	Computador1.setAcessorios("Teclado e Mouse");
	Computador1.setFuncionalidade("Computador Gamer");
	
	System.out.println(Computador1.getNome());
	System.out.println(Computador1.getCor());
	System.out.println(Computador1.getTamanho());
	System.out.println(Computador1.getAcessorios());
	System.out.println(Computador1.getFuncionalidade());

	}

}
