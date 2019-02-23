package bancoPoo;

import java.util.Scanner;



public class Cliente {
	//variaveis
	private static String nome;
	private static String endereco;
	private static String profissao;
	private static int rg;
	private static int cpf;
	private static double saldo;
	private static int Nconta;
	private static int cartao;
	private static int senha; 
	

	//construtores
	public Cliente() {
		
	}
	public Cliente(String nome, String endereco,String profissao, int rg,int cpf,double saldo, int Nconta, int cartao,int senha) {
		Cliente.nome=nome;
		Cliente.endereco=endereco;
		Cliente.profissao=profissao;
		Cliente.rg=rg;
		Cliente.cpf=cpf;
		Cliente.saldo=saldo;
		Cliente.Nconta=Nconta;
		Cliente.cartao=cartao;
		Cliente.senha= senha;
	}
		
	

	

	
	
	public static String getNome() {
		return nome;
	}

    
    public static String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		Cliente.endereco = endereco;
	}
	public static String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		Cliente.profissao = profissao;
	}
	public static int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		Cliente.rg =  rg;
	}
	public static int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		Cliente.cpf = cpf;
	}
	public static float getSaldo() {
		return (float) saldo;
	}
	public static void setSaldo(double saldo) {
		Cliente.saldo = saldo;
	}
	public static int getNconta() {
		return Nconta;
	}
	public void setNconta(int nconta) {
		Nconta = nconta;
	}
	public static int getCartao() {
		return cartao;
	}
	public static void setCartao(int cartao) {
		Cliente.cartao = cartao;
	}
	public void setNome(String nome) {
		Cliente.nome = nome;
	}
	public static int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		Cliente.senha = senha;
	}

	//operacoes
		public void deposito(int valor){
			this.saldo = this.saldo + valor;
		}
		public int saque(int valor) {
			this.saldo=this.saldo-valor;		
			return valor;
		}
		public void transferencia(int valor, Cliente c1) {
			c1.deposito(this.saque(valor)); //vai fazer um saque e um deposito
		}

		
		
		/*public void opcoes(Gerente G) { //opçoes que os clientes vao ter acesso
			Scanner m = new Scanner(System.in);
			int opcao,valor,z=0;
			
			while(z==0) {
				System.out.printf("Precione 1 Para Saque\n");
				System.out.printf("Precione 2 Para Deposito\n");
				System.out.printf("Precione 3 Para Transferencia\n");
				System.out.printf("Precione 4 Para Saldo\n");
				System.out.printf("Precione 5 Para encerar su seçao\n");
				opcao=m.nextInt();//esta merda não funciona
				switch(opcao) {
				case 1:
					System.out.printf("Informe o Valor Desejado.");
					valor=m.nextInt();
					this.saque(valor);
					break;
				case 2:
					System.out.printf("Informe o Valor a Ser Depositado.");
					valor=m.nextInt();
					this.deposito(valor);
					break;
				case 3:
					System.out.printf("Informe o Valor Desejado.");
					valor=m.nextInt();
					System.out.printf("Informe o Numero Da Conta Do Destinatario.");
					int x=m.nextInt();
					for ( int i = 0;i<G.getClientes().size();i++) {//o for vai percorrer o arraylist cliente
						if(G.getClientes().get(i).getNconta()==x) {//compara o numero da conta dos clientes 
							this.transferencia(valor,G.getClientes().get(i));//faz a transferencia 
							break;
						}
							
					}
					break;
				case 4:
					System.out.printf("O Seu Saldo é De %d R$",this.saldo);
				case 5:
					z=z++;//vai parar o while
					break;
				}
				
			}	
			m.close();
			
		}*/
		
		

}
