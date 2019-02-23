package bancoPoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Atendente extends Cliente  {
	//variaveis
	private static int salario ;
	private static int Nacesso;
	
	//construtor
	Atendente(String nome, String endereco, String profissao, int rg, int cpf, double saldo, int Nconta, int cartao,int senha,
	int salario,int Nacesso) {
		super(nome, endereco, profissao, rg, cpf, saldo, Nconta, cartao,senha);
		Atendente.salario=salario;
		Atendente.Nacesso=Nacesso;
	}
	// esses arraylist vao ser preenchidos com as informaçoes dos arquivos 
	//private static ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 
	//private static ArrayList<Integer> cartaos= new ArrayList<Integer>();
	//private static ArrayList<Integer> senhas= new ArrayList<Integer>();
	
	
	// aqui as informaçoes de cliente vão ser editadas 
	/*public void editar(Cliente cliente) {
		Scanner y = new Scanner(System.in);
		int x=0,opcao=y.nextInt();
		System.out.printf("->Precione 1 Para Editar o Nome Do Cliente");
		System.out.printf("->Precione 2 Para Editar o Endereço Do Cliente");
		System.out.printf("->Precione 3 Para Editar a Profissao Do Cliente");
		System.out.printf("->Precione 4 Para Editar o Rg Do Cliente");
		System.out.printf("->Precione 5 Para Editar o CPF Do Cliente");
		System.out.printf("->Precione 6 Se Não há Mais Aterações a Serem Feitas ");
		while(x==0) {
			switch(opcao) {
				 case 1:
					 cliente.setNome(y.next());
					 cliente.toString();
					 break;
				
				 case 2:
					cliente.setEndereco(y.next());
					cliente.toString();
					break;
				
				case 3:
					cliente.setProfissao(y.next());
					cliente.toString();
					break;
					
				case 4:
					cliente.setRg(y.nextInt());
					cliente.toString();
					break;
				
				case 5:
					cliente.setCpf(y.nextInt());
					cliente.toString();
					break;
				case 6:
					x=x++;
					break;
				}
		}
		y.close();
		
	}*/

	//um novo cliente vai ser criado
	/*public void criar (Banco B,Gerente G) {
		Scanner y = new Scanner(System.in);
		System.out.print("digite o nome\n");
		String nome = y.nextLine();
		System.out.print("digite o endereco\n");
		String endereco = y.nextLine();
		System.out.print("digite a profiçao\n");
		String proficao = y.nextLine();
		System.out.print("digite o RG\n");
		int rg = y.nextInt();
		System.out.print("digite o CPF\n");
		int cpf = y.nextInt();
		System.out.print("digite o saldo\n");
		int saldo = y.nextInt();
		System.out.print("digite a senha\n");
		String senha = y.nextInt();
		G.getSenhas().add(senha);//salvando a senha no arraylist das senhas
		
		//numero da conta vai vim do banco
		B.setNcontas(B.getNcontas()+1);
		int Nconta = B.getNcontas(); 
		
		//numero do cartao vai ser gerado no banco
		int cartao = B.gerarcartao(); 
		G.getCartaos().add(cartao);//salvando o cartão no arraylist dos cartões
		
		y.close();
		//um novo cliente vai ser instanciado
		
		G.getClientes().add(new Cliente(nome,endereco,proficao,rg,cpf,saldo,Nconta,cartao,senha));
		//o novo cliente vai ser ficar no arraylist Clientes do gerente
	}*/
	
	
	
	//o numero do cartão vai entrar aqui e o cliente dono desse cartão vai ser retornado 
	/*public Cliente vendo(int cartao,Gerente G) {
			int x=0;
			for (int i = 0;i<G.getCartaos().size();i++) {// vai pecorrer o arraylist Cartaos 
				if(G.getCartaos().get(i)==cartao) //comparando o cartão como os dos clientes 
					x = i; //quando o cliente que tem esse nuemero de cartão for achado x vai quardar o posição dele  
			}
		return Atendente.getClientes().get(x);
	}
	
	//tela que sera exibida quando um atendente acessar 
	public void exibir(Gerente G,Banco B) {
		Scanner y = new Scanner(System.in);
		int x=0, cartao;
		while(x==0) {
			System.out.printf("Precione 1 Para Poder Ter Acesso a Conta De um Cliente");
			System.out.printf("Precione 2 Para Poder Editar a Conta De um Cliente");
			System.out.printf("Precione 3 Para Abrir Uma Nova Conta Conta ");
			System.out.printf("Precione 4 Para Sair ");
			int opcao=y.nextInt();//essa merda não funciona
			switch(opcao) {
				case 1:
					cartao=G.virificarID();//o numero do cartão vai ser fornecido
					if	(G.checandoNacesso(cartao)==false) { //se não for um numero de acesso ao ver um cliente
						vendo(cartao,G).opcoes(G);//as opçoes do clienete retornado pelo metodo vendo 
					}
					else {
						System.out.println("Os Dados Informados Não São Para Um clientes");

					}
					break;
				case 2:
					cartao=G.virificarID();//o numero do cartão vai ser fornecido
					if	(G.checandoNacesso(cartao)==false) { //se não for um numero de acesso ao ver um cliente
						editar(vendo(cartao,G));//o atendente poderar editar as informações do cliente
					}
					else {
						System.out.println("Os Dados Informados Não São Para Um clientes");

					}
					break;
				case 3:
					criar(B,G);
					break;
				case 4:
					x++;
					break;
			}
			y.close();
		}
	}*/
	
	
	
	
	
	
	
	public String tosString() {
		return super.toString()+"\nSalario: "+this.salario+"\nNumero de Acesso: "+this.Nacesso;
	}
	
	public static int getNacesso() {
		return Nacesso;
	}
	public static void setNacesso(int nacesso) {
		Nacesso = nacesso;
	}
	public static int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		Atendente.salario = salario;
	}

	
	
	
}
