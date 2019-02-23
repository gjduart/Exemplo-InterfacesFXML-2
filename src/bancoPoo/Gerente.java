package bancoPoo;

import java.util.ArrayList;

import java.util.Scanner;

public class Gerente extends Atendente{
	private static int Natendentes;	
	//construtor
	Gerente(String nome, String endereco, String profissao, int rg, int cpf, double saldo, int Nconta, int cartao,int senha,
			int salario, int Nacesso,int Natendentes) {
		super(nome, endereco, profissao, rg, cpf, saldo, Nconta, cartao, senha, salario, Nacesso);
		Gerente.Natendentes=Natendentes;
	}
	// esses arraylist vao ser preenchidos com as informaçoes dos arquivos 
	//private static ArrayList<Atendente> atendentes = new ArrayList<Atendente>();
	//private static ArrayList<Integer> Nacessos= new ArrayList<Integer>();
		
	/*public void criar (Banco B ) {
		Scanner y = new Scanner(System.in);
		//essa informaços vao sser digitadas pelo gerente
		System.out.print("digite o nome\n");
		String nome = y.nextLine();
		System.out.print("digite o endereco\n");
		String endereco = y.nextLine();
		System.out.print("digite o profiçao\n");
		String proficao = y.nextLine();
		System.out.print("digite o RG\n");
		int rg = y.nextInt();
		System.out.print("digite o CPF\n");
		int cpf = y.nextInt();
		System.out.print("digite o saldo\n");
		int saldo = y.nextInt();
		System.out.print("digite o senha\n");
		int senha = y.nextInt();
		this.getSenhas().add(senha);
		System.out.print("digite o salario\n");
		int salario=y.nextInt();
		
		//numero da conta vai vim do banco
		B.setNcontas(B.getNcontas()+1);
		int Nconta = B.getNcontas();
		
		//numero do cartao vai ser gerado no banco
		int cartao =B.gerarcartao();
		this.getCartaos().add(cartao);
		
		//numero de acesso vai ser o numero que o funcionario representa para o banco
		B.setNfuncionarios(B.getNfuncionarios()+1);
		this.Natendentes++;
		int Nacesso=B.getNfuncionarios();
		Nacessos.add(Nacesso);
		
		y.close();
		//um novo atendente é instanciado
		// o novo etendente deve ir para os 2 arraylist
		this.getAtendentes().add(new Atendente(nome,endereco,proficao,rg,cpf,saldo,Nconta,cartao,senha,salario,Nacesso));
		this.getClientes().add(new Atendente(nome,endereco,proficao,rg,cpf,saldo,Nconta,cartao,senha,salario,Nacesso));
			
	}*/
	
	/*public String toString() {
		return super.tosString()+"\nNumero de Atendentes "+Gerente.Natendentes;
	}
	
	public boolean checandoNacesso(int cartao) {//vai comparar para ver se o cartao é um numereo de acesso   
		int i;
		for ( i = 0;i<Gerente.Nacessos.size();i++) {
			if(Gerente.Nacessos.get(i)==cartao) 
				return true;		
		}
		return false;
	}*/
	
	/*public static int virificarID(int cartao, int senha) {//aqui vai ser a tele principal onde o numero do cartão e a senha vai ser recebida e verificada 
		
		int x=0,i;
		
	//	while(x==0) {
			Scanner y = new Scanner(System.in);
			System.out.printf("Digite o Numero Do Cartão");
			cartao=y.nextInt();
			System.out.printf("Digite a Senha");
			senha=y.nextInt();*/
			/*if(senha==0) {//se um atendente for tentar acessar ele so fornecera o Nacesso e a senha sera 0
				for ( i = 0;i<Gerente.getNacessos().size();i++) {
					if(Gerente.getNacessos().get(i)==cartao) {
						cartao=getNacesso();
						//x++;
						//y.close();
						break;
					}
				}
			}
			else {
				for ( i = 0;i<Gerente.getCartaos().size();i++) {
					if(Gerente.getCartaos().get(i)==cartao && Gerente.getSenhas().get(i)==senha) {
						cartao = Gerente.getCartaos().get(i);
						//x++;
						//y.close();
						break;
					}	
				}
			}
		//}
		return cartao;
	}*/
	
/*	public void opcoes(Atendente A) {
		Scanner y = new Scanner(System.in);
		int opcao=0,valor,z=0;
		while(z==0) {
			System.out.printf("Precione 1 Para Saque");
			System.out.printf("Precione 2 Para Deposito");
			System.out.printf("Precione 3 Para Transferencia");
			System.out.printf("Precione 4 Para Saldo");
			System.out.printf("Precione 5 Para Saldo");
			System.out.printf("Precione 6 Para Encerar a Sessão");
			opcao=y.nextInt();
			switch(opcao) {
			case 1:
				System.out.printf("Informe o Valor Desejado.");
				valor=y.nextInt();
				A.saque(valor);
				break;
			case 2:
				System.out.printf("Informe o valor a ser depositado.");
				valor=y.nextInt();
				A.deposito(valor);
				break;
			case 3:
				System.out.printf("Informe o Valor Desejado.");
				valor=y.nextInt();
				System.out.printf("Informe o Numero Da Conta Do Destinatario.");
				int x=y.nextInt();
				for ( int i = 0;i<this.getClientes().size();i++) {
					if(this.getClientes().get(i).getNconta()==x) {
						A.transferencia(valor,this.getClientes().get(i));
						break;
					}
						
				}
				break;
			case 4:
				System.out.printf("O Seu Saldo é De %d R$",A.getSaldo());
			
			case 5:
				this.editar(A);
				break;
				
			case 7:
				z=z++;
				break;
			}
			
		}	
		y.close();
	}*/
	
	/*public Atendente vendoaqui(int ID) {//aqui vai ser feita basicamente a mesma coisa que no metodo vendo da classe atendente so que agora um atendente é retornao 
		int i;
		Atendente a = null;
		if (checandoNacesso(ID)==false) {
			for (i = 0;i<this.getNacessos().size();i++) {
				if(this.getNacessos().get(i)==ID) 
					a=this.getAtendentes().get(i) ;
							
				}	
		}
		return a;
	}*/
	
	/*public void exibir(Banco B) {//tela que sera exibida quando um atendente acessar 
		Atendente a = null;
		Cliente c = null;
		int x=0,ID;
		System.out.println("Se Deseja Alterar As Iformações De Um Atendente Digite 1");
		System.out.println("Se Deseja Mudar o Salario De Um Atendente Digite 2");
		System.out.println("Se Deseja Acessar Um Cliente Digite 3");
		System.out.println("Se Deseja Alterar As Iformações de Um Cliente Digite 4");
		System.out.println("Se Deseja Acessar o Pagameto Dos Funcionarios Digite 5 ");
		System.out.println("Para Sair 6");

		while (x==0) {
			Scanner y = new Scanner(System.in);
			int opcao=y.nextInt();
			switch(opcao){
				case 1 :
					ID=virificarID();
					if	(checandoNacesso(ID)==true) { //vai ver se ID é um numero de acesso 
						a = this.vendoaqui(ID);
						this.editar(a);
					}
					else {//se o que foi informado não for um numero de acesso 
						System.out.println("Os Dados Informados Não São Para Um Atendente");

					}
						break;
				case 2:
					ID=virificarID();
					if	(checandoNacesso(ID)==true) { 
						a = this.vendoaqui(ID);
						a.setSalario(y.nextInt());
					}
					else {
						System.out.println("Os Dados Informados Não São Para Um Atendente");

					}
					break;
				case 3:
					ID=virificarID();
					if	(checandoNacesso(ID)==false) { 
						c= this.vendo(ID,this);
						c.opcoes(this);
					}
					else {
						System.out.println("Os Dados Informados Não São Para Um Clientes");

					}
					break;
				case 4:
					ID=virificarID();
					if	(checandoNacesso(ID)==false) { 
						c= this.vendo(ID,this);
						this.editar(c);
					}
					else {
						System.out.println("Os Dados Informados Não São Para Um Clientes");

					}
					break;
					
				case 5:
					B.Pagamento_Funcionarios(this);
					for(int i=0;i<this.getNatendentes();i++) {
						B.Pagamento_Funcionarios(this.getAtendentes().get(i));
					}
					break;
				case 6:
					x++;
					
			}
			y.close();
		}
		
	}
	*/
	
	public static int getNatendentes() {
		return Natendentes;
	}
	public void setNatendentes(int natendentes) {
		Natendentes = natendentes;
	}
	
	
}
