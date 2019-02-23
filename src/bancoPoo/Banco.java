package bancoPoo;


import java.util.ArrayList;
import java.util.Random;

public class Banco {
	//variaveis
	private static int Ncontas;
	private static int Nagencia;
	private double saldo;
	private static int Nfuncionarios; 
	
	private static ArrayList<Atendente> atendentes = new ArrayList<Atendente>();
	private static ArrayList<Integer> Nacessos= new ArrayList<Integer>();
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 
	private static ArrayList<Integer> cartaos= new ArrayList<Integer>();
	private static ArrayList<Integer> senhas= new ArrayList<Integer>();
	public void mostra() {
		for (int i = 0;i< this.clientes.size();i++) {
			System.out.println(this.clientes.get(i).getNome());
		}
		for (int i = 0;i< this.atendentes.size();i++) {
			System.out.println(this.atendentes.get(i).getNome());
		}
	}
	
	//construtor
	Banco(int Ncontas,int Nagencia,double saldo,int Nfuncionario ){
		this.Nagencia=Nagencia;
		this.Ncontas=Ncontas;
		this.saldo=saldo;
		this.Nfuncionarios=Nfuncionario;
		
	}
	
	//adicionar tempo para executar automaticamente no dia 10 de cada mes isso e coisa da jamille
	public void Pagamento_Funcionarios(Atendente A) {
		this.saldo=this.saldo-A.getSalario();
		A.setSaldo(A.getSalario());
	}
	public void Pagamento_Funcionarios(Gerente G) {
		this.saldo=this.saldo-G.getSalario();
		G.setSaldo(G.getSalario());
	}
	
	
	public static int gerarcartao() {//gerendo o cartão aleatoriamente
		int cartao=Banco.Ncontas+1;
		 Random gerador = new Random();
		for(int i=0;i<4;i++) {
			cartao=cartao*10;
			cartao=cartao+gerador.nextInt(10);
		}
		return cartao;
	}
	
	/*	public void menu(Gerente G) {//onde a magica acontece 
		//aqui é onde tudo se junta
		while(true) { 
			Cliente c = null;
			Atendente a = null;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
			int ID=G.virificarID();
			if (G.getNacesso()==ID) {
				G.exibir(this);
			}
			else {
				if(G.checandoNacesso(ID)==true) {
					a=G.vendoaqui(ID);
					a.exibir(G, this);
				}
				else{
					c=G.vendo(ID,G);
					c.opcoes(G);
				}
				
			}
		}
	}*/
    	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//getters and setters
	
	public static int getNcontas() {
		return Ncontas;
	}
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static ArrayList<Atendente> getAtendentes() {
		return atendentes;
	}

	public static void setAtendentes(ArrayList<Atendente> atendentes) {
		Banco.atendentes = atendentes;
	}

	public static ArrayList<Integer> getNacessos() {
		return Nacessos;
	}

	public static void setNacessos(ArrayList<Integer> nacessos) {
		Nacessos = nacessos;
	}

	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public static void setClientes(ArrayList<Cliente> clientes) {
		Banco.clientes = clientes;
	}

	public static ArrayList<Integer> getCartaos() {
		return cartaos;
	}

	public static void setCartaos(ArrayList<Integer> cartaos) {
		Banco.cartaos = cartaos;
	}

	public static ArrayList<Integer> getSenhas() {
		return senhas;
	}

	public static void setSenhas(ArrayList<Integer> senhas) {
		Banco.senhas = senhas;
	}

	public static void setNcontas(int ncontas) {
		Ncontas = ncontas;
	}
	public static int getNagencia() {
		return Nagencia;
	}
	public static void setNagencia(int nagencia) {
		Nagencia = nagencia;
	}

	public static int getNfuncionarios() {
		return Nfuncionarios;
	}

	public static void setNfuncionarios(int nfuncionarios) {
		Nfuncionarios = nfuncionarios;
	}
	
}
