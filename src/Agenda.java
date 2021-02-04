
public class Agenda {
	public static void main (String []args) {
		BancoDeDados bancoDeDados = new BancoDeDados();
		bancoDeDados.conectar();
		if(bancoDeDados.estaConectado()) {
			bancoDeDados.listarContatos();
			//bancoDeDados.inserirContato("Pablo","1234-5678");
			//bancoDeDados.editarContato("1","Paulo","9876-5432");
			//bancoDeDados.apagarContato("1");
			bancoDeDados.conectar();
		}else {
			System.out.println("Não foi possível conectar ao banco de dados!");
		}
		
		
	}

}
