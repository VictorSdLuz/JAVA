package labSchool;

import java.util.Scanner;


public class operações extends pessoa {
	static int firstAction;
	static int secondAction;
	

	
	static void primeiraAção(){
		
		Scanner primeiraAcaoScan = new Scanner(System.in);
		System.out.println("Menu Principal LabSchool \n"
				+ "Opções: \n"
				+ "\n"
				+ "Para fazer um cadastro, Insira 1 \n"
				+ "Para acessar as listas gerais e especificas ou relatórios: Insira 2 \n"		
				+ "Para cadastrar um atendimento: Insire 3");
				firstAction = primeiraAcaoScan.nextInt();
		
			switch(firstAction) {
					
				case 1:
					System.out.println("Você selecionou a opção de cadastro, vamos iniciar o processo: ");
					 inicioCadastro();
					 break;
					 
				case 2:
					System.out.println("Você selecionou a opção de lista ou relatórios.");
					listaOuRelatorio();
					break;
						
				case 3:
					System.out.println("Cadastrar Atendimento");
					cadastroAtendimento_1();
					break;
						
				default: primeiraAção(); break;	
				}
		}
	
//COMEÇO CADASTRO	
		static void inicioCadastro() {
			Scanner segundaAcaoScan = new Scanner(System.in);
			System.out.println("Menu de cadastro \n"
					+ "Opções: \n"
					+ "\n"
					+ "Para fazer um cadastro de um aluno, digite 1 \n"
					+ "Para fazer um cadastro de um professor, digite 2 \n"
					+ "Para fazer um cadastro de um pedagogo, digite 3 \n"
					+ "Se desejar voltar para o menu inicial, digite 4 \n");					
			secondAction = segundaAcaoScan.nextInt();
			
			switch(secondAction) {
			case 1:
				System.out.println("Seguir para efetuação de cadastro de aluno"+ "\n");				
				cadastroAluno();
				break;
			
			case 2:
				System.out.println("Seguir para efetuação de cadastro de professor"+ "\n");				
				cadastroProfessor();
				break;
			
			case 3:
				System.out.println("Seguir para efetuação de cadastro de pedagogo"+ "\n");				
				cadastroPedagogo();
				break;
				
			case 4:
				System.out.println("De volta para o menu incial");				
				primeiraAção();
				break;
				
			default: inicioCadastro();
			}
		}
	
		static void cadastroAluno() {
			aluno.cadastro();
			inicioCadastro();
		}
		
		static void cadastroProfessor() {
			professor.cadastro();
			inicioCadastro();
		}
		
		static void cadastroPedagogo() {
			pedagogo.cadastro();
			inicioCadastro();
		}
//CADASTRO FEITO
	
// COMEÇO DECISÃO LISTA OU RELATÓRIO

		static void listaOuRelatorio() {
			
			Scanner scannerListaRelatorio = new Scanner(System.in);
			System.out.println("Opções: \n"
					+ "\n"
					+ "Para acessar os relatórios, Insira 1 \n"
					+ "Para acessar as listas gerais e especificas: Insira 2 \n"		
					+ "Voltar para o menu anterior: Insire 9");
					int listaOuRelatorio = scannerListaRelatorio.nextInt();
			
				switch(listaOuRelatorio) {
						
					case 1:
						System.out.println("Você selecionou a opção relatórios: ");
						menuRelatorios();
						 break;
						 
					case 2:
						System.out.println("Você selecionou a opção de acesso as listas:");
						menuLista();
						break;
							
					case 9:
						System.out.println("Menu anterior \n");
						primeiraAção();
						break;
							
					default: primeiraAção(); break;	
					}
			}
		

// FIM DECISÃO LISTA OU RELATÓRIO		
		
//COMEÇO LISTA GERAL		
				static void menuLista() {
			
			Scanner segundaAcaoScan = new Scanner(System.in);
			System.out.println("MENU LISTAS \n"
					+ "Opções: \n"
					+ "\n"
					+ "Para listar os alunos, digite 1 \n"
					+ "Para listar os professores, digite 2 \n"
					+ "Para listar os pedagogo, digite 3 \n"
					+ "Para listar todas as pessoas, digite 4 \n"
					+ "Se desejar voltar para o menu inicial, digite 9 \n");					
			secondAction = segundaAcaoScan.nextInt();
			
			switch(secondAction) {
				
				case 1:
					System.out.println("Seguir para lista de alunos"+ "\n");				
					printListaPadraoTodosAlunos();
					break;
			
				case 2:
					System.out.println("Seguir para lista de professores"+ "\n");				
					printListaPadraoTodosProfessores();
					break;
			
				case 3:
					System.out.println("Seguir para lista de pedagogos"+ "\n");				
					printListaPadraoTodosPedagogos();
					break;
				
				case 4:
					System.out.println("Seguir para lista de todas pessoas" + "\n");				
					printListaPadraoTodos();
					break;
					
				case 9:
					System.out.println("Voltando para o menu anterior" + "\n");				
					primeiraAção();
					break;
				
				default: menuLista();			
			}
			
		}			
		
				static void printListaPadraoTodosAlunos() {
				     
			        System.out.println("Alunos: ");
			        for (aluno aluno : pessoa.alunos) {
			        
			            System.out.println("Codigo: "+ aluno.Id +"\n"  + "Nome: " + aluno.Nome + "\n" + "Cpf: " + aluno.Cpf);
			        }
			        Scanner scannerVoltar = new Scanner(System.in);
			        System.out.println("Digite 1  para voltar");
			        int teclaVoltar = scannerVoltar.nextInt();
			        menuLista();     
				}
				
				static void printListaPadraoTodosProfessores() {
			        System.out.println("Professores: ");
			        for (professor professor: pessoa.professores) {
			        
			            System.out.println("Codigo: "+ professor.Id +"\n"  + "Nome: " + professor.Nome + "\n" + "Cpf: " + professor.Cpf);
			        }
			        Scanner scannerVoltar = new Scanner(System.in);
			        System.out.println("Digite 1  para voltar");
			        int teclaVoltar = scannerVoltar.nextInt();
			        menuLista(); 
				}
				
				static void printListaPadraoTodosPedagogos() {
			        System.out.println("Pedagogos: ");
			        for (pedagogo pedagogo: pessoa.pedagogos) {
			        
			            System.out.println("Codigo: "+ pedagogo.Id +"\n"  + "Nome: " + pedagogo.Nome + "\n" + "Cpf: " + pedagogo.Cpf);
			        }
			        Scanner scannerVoltar = new Scanner(System.in);
			        System.out.println("Digite 1  para voltar");
			        int teclaVoltar = scannerVoltar.nextInt();
			        menuLista(); 
				}
				
				static void printListaPadraoTodos() {

			        System.out.println("Todas pessoas cadastradas: ");
			        for (pessoa pessoa: pessoas) {
			        
			            System.out.println("Codigo: "+ pessoa.Id +"\n"  + "Nome: " + pessoa.Nome + "\n" + "Cpf: " + pessoa.Cpf);
			        }
			        Scanner scannerVoltar = new Scanner(System.in);
			        System.out.println("Digite 1  para voltar");
			        int teclaVoltar = scannerVoltar.nextInt();
			        menuLista(); 
				}
//FINAL LISTA GERAL		
				
//COMEÇO MENU RELATÓRIOS
				
				static void menuRelatorios() {
					
					Scanner scannerMenuRelatorio = new Scanner(System.in);
					System.out.println("Opções: \n"
							+ "\n"
							+ "Para acessar os relatórios dos ALUNOS, Insira 1 \n"
							+ "Para acessar os relatórios dos PROFESSORES: Insira 2 \n"		
							+ "Voltar para o menu anterior: Insire 9");
							int menuRelatorio = scannerMenuRelatorio.nextInt();
					
						switch(menuRelatorio) {
								
							case 1:
								System.out.println("Você selecionou a opção relatórios dos alunos: ");
								menuRelatorioAlunos();
								 break;
								 
							case 2:
								System.out.println("Você selecionou a opção de relatório dos professores:");
								menuRelatoriosProfessores();
								break;
									
							case 9:
								System.out.println("Menu anterior \n");
								primeiraAção();
								break;
									
							default: listaOuRelatorio(); 
							}
					
				}
				
// FINAL MENU RELATÓRIOS				
				
//RELATORIO ALUNOS

				
				static void menuRelatorioAlunos() {
				      
					Scanner escolha_1Scanner = new Scanner(System.in);
				      System.out.println("MENU RELATÓRIO ALUNOS: \n" 
				            + "Para relatório dos alunos ativos, digite 1: \n" 
				            + "Para relatório dos alunos irregulares, digite 2: \n" 
				            + "Para relatório dos alunos no atendimento pedagógico, digite 3 \n"
				            + "Para relatório dos alunos inativos, digite 4 \n"
				            + "Para relatório de TODOS os alunos, digite 5 \n" 
				            + "Para voltar ao menu anterior, digite 9: \n");
				        int escolha_1 = escolha_1Scanner.nextInt();
				        
				        switch (escolha_1) {
				        
				            case 1: alunosAtivosRelatorio();
				            break;
				            
				            case 2: alunosIrregularRelatorio();
				            break;
				            
				            case 3: alunosAtendimentoRelatorio();
				            break;
				            
				            case 4: alunosInativosRelatorio();
				            break;
				            
				            case 5: alunosTodosRelatorio();
				            break;
				            
				            case 9: menuRelatorios();
				            break;
				            
				            default: menuRelatorioAlunos();
				        }
				}
				
				static void alunosAtivosRelatorio() {
				   	
				   	Scanner scannerRelatorio = new Scanner(System.in);
			        System.out.println("Mostrando alunos com condição ativo.");
			        for (aluno aluno : alunos) {
			        	
			            if(aluno.getCondição() == "ATIVO") {
			            	 System.out.println("Id:" + aluno.Id +"\n" + "Nota: " + aluno.Nota +"\n" +  "Atendimentos pedagógicos: " + aluno.qtdAtendimentoAluno);
			            }
			        }
			        Scanner scannerReturn = new Scanner(System.in);
			        System.out.println("Digite 9 para voltar");
			        int inputReturn = scannerReturn.nextInt();
			        switch (inputReturn) {
			        
			        case 9: primeiraAção();
			        break;
			        
			        default: System.out.println("Insira 9 para retornar ao menu principal");
			        }

			    }
			   
				static void alunosIrregularRelatorio() {
				   	
				   	Scanner scannerRelatorio = new Scanner(System.in);
			        System.out.println("Mostrando alunos com condição irregular.");
			        for (aluno aluno : alunos) {
			        	
			            if(aluno.getCondição() == "IRREGULAR") {
			            	 System.out.println("Id:" + aluno.Id +"\n" + "Nota: " + aluno.Nota +"\n" +  "Atendimentos pedagógicos: " + aluno.qtdAtendimentoAluno);
			            }
			        }
			        Scanner scannerReturn = new Scanner(System.in);
			        System.out.println("Digite 9 para voltar");
			        int inputReturn = scannerReturn.nextInt();
			        switch (inputReturn) {
			        
			        case 9: primeiraAção();
			        break;
			        
			        default: System.out.println("Insira 9 para retornar ao menu principal");
			        }

			    }
			   
				static void alunosAtendimentoRelatorio() {
				   	
				   	Scanner scannerRelatorio = new Scanner(System.in);
			        System.out.println("Mostrando alunos com condição ATENDIMENTO.");
			        for (aluno aluno : alunos) {
			        	
			            if(aluno.getCondição() == "ATENDIMENTO") {
			            	 System.out.println("Id:" + aluno.Id +"\n" + "Nota: " + aluno.Nota +"\n" +  "Atendimentos pedagógicos: " + aluno.qtdAtendimentoAluno);
			            }
			        }
			        Scanner scannerReturn = new Scanner(System.in);
			        System.out.println("Digite 9 para voltar");
			        int inputReturn = scannerReturn.nextInt();
			        switch (inputReturn) {
			        
			        case 9: primeiraAção();
			        break;
			        
			        default: System.out.println("Insira 9 para retornar ao menu principal");
			        }

			    }
			   
				static void alunosInativosRelatorio() {
				   	
				   	Scanner scannerRelatorio = new Scanner(System.in);
			        System.out.println("Mostrando alunos com condição INATIVO.");
			        for (aluno aluno : alunos) {
			        	
			            if(aluno.getCondição() == "INATIVO") {
			            	 System.out.println("Id:" + aluno.Id +"\n" + "Nota: " + aluno.Nota +"\n" +  "Atendimentos pedagógicos: " + aluno.qtdAtendimentoAluno);
			            }
			        }
			        Scanner scannerReturn = new Scanner(System.in);
			        System.out.println("Digite 9 para voltar");
			        int inputReturn = scannerReturn.nextInt();
			        switch (inputReturn) {
			        
			        case 9: primeiraAção();
			        break;
			        
			        default: System.out.println("Insira 9 para retornar ao menu principal");
			        }

			    }
			   
				static void alunosTodosRelatorio() {
				   	
				   	Scanner scannerRelatorio = new Scanner(System.in);
			        System.out.println("Mostrando alunos com condição INATIVO.");
			        for (aluno aluno : alunos) {
			            	 System.out.println("Id:" + aluno.Id +"\n" + "Nota: " + aluno.Nota +"\n" +  "Atendimentos pedagógicos: " + aluno.qtdAtendimentoAluno);
			        }
			        Scanner scannerReturn = new Scanner(System.in);
			        System.out.println("Digite 9 para voltar");
			        int inputReturn = scannerReturn.nextInt();
			        switch (inputReturn) {
			        
			        case 9: primeiraAção();
			        break;
			        
			        default: System.out.println("Insira 9 para retornar ao menu principal");
			        }

			    }
		
 //FIM RELATORIO ALUNOS
			   
 //INICIO RELATORIO PROFESSORES
				
				static void menuRelatoriosProfessores() {
					
					Scanner scannerMenuRelatorioProfessores = new Scanner(System.in);
				      System.out.println("MENU RELATÓRIOS PROFESSORES:\n" 
				            + "Para relatório dos professores de Front-End, digite 1: \n" 
				            + "Para relatório dos professores de Back-End, digite 2: \n" 
				            + "Para relatório dos professores FullStack, digite 3 \n"
				            + "Para relatório de TODOS professores, digite 4 \n"
				            + "Para voltar ao menu anterior, digite 9: \n");
				        int menuRelatorioProfessoresInt = scannerMenuRelatorioProfessores.nextInt();
				        
				        switch (menuRelatorioProfessoresInt) {
				        
				            case 1: professoresFrontRelatorio();
				            break;
				            
				            case 2: professoresBackRelatorio();
				            break;
				            
				            case 3: professoresFullRelatorio();
				            break;
				            
				            case 4: professoresTodosRelatorio();
				            break;
				            
				            case 9: menuRelatorios();
				            break;
				            
				            default: menuRelatoriosProfessores();
				        }
				}
				
			   
			   static void professoresFrontRelatorio() {
				   	
			        System.out.println("Mostrando professores de Front-End.");
			        for (professor professor: professores) {
			        	
			            if(professor.getExperiencia() == "Front-End") {
			            	 System.out.println("Nome: " + professor.getNome());
			            }
			        }
			        Scanner scannerReturn = new Scanner(System.in);
			        System.out.println("Digite 9 para voltar");
			        int inputReturn = scannerReturn.nextInt();
			        switch (inputReturn) {
			        
			        case 9: primeiraAção();
			        break;
			        
			        default: System.out.println("Insira 9 para retornar ao menu principal");
			        }

			    }
			   
			   static void professoresBackRelatorio() {
				   	
			        System.out.println("Mostrando professores de Back-End.");
			        for (professor professor: professores) {
			        	
			            if(professor.getExperiencia() == "Back-End") {
			            	 System.out.println("Nome: " + professor.getNome());
			            }
			        }
			        Scanner scannerReturn = new Scanner(System.in);
			        System.out.println("Digite 9 para voltar");
			        int inputReturn = scannerReturn.nextInt();
			        switch (inputReturn) {
			        
			        case 9: primeiraAção();
			        break;
			        
			        default: System.out.println("Insira 9 para retornar ao menu principal");
			        }

			    }
			   
			   static void professoresFullRelatorio() {
				   	
			        System.out.println("Mostrando professores FULLSTACK.");
			        for (professor professor: professores) {
			        	
			            if(professor.getExperiencia() == "Full-Stack") {
			            	 System.out.println("Nome: " + professor.getNome());
			            }
			        }
			        Scanner scannerReturn = new Scanner(System.in);
			        System.out.println("Digite 9 para voltar");
			        int inputReturn = scannerReturn.nextInt();
			        switch (inputReturn) {
			        
			        case 9: primeiraAção();
			        break;
			        
			        default: System.out.println("Insira 9 para retornar ao menu principal");
			        }

			    }
			   		   
			   static void professoresTodosRelatorio() {
				   	
			        System.out.println("Mostrando todos os professores.");
			        for (professor professor: professores) {
			            	 System.out.println("Nome: " + professor.getNome());
			        }
			        Scanner scannerReturn = new Scanner(System.in);
			        System.out.println("Digite 9 para voltar");
			        int inputReturn = scannerReturn.nextInt();
			        switch (inputReturn) {
			        
			        case 9: primeiraAção();
			        break;
			        
			        default: System.out.println("Insira 9 para retornar ao menu principal");
			        }

			    }
			   
//FIM RELATORIO PROFESSOR	
			   
			   
// COMEÇO CADASTRO ATENDIMENTO
			   
			   static void cadastroAtendimento_1() {
				   
				   Scanner respostaCadastro = new Scanner(System.in);
				   System.out.println("AVISO: Para efetuar um cadastro de atendimento, você deve ter pelo menos inserido um aluno e um pedagogo no sistema."
				   		+ "Você já realizou esses cadastros? \n"
				   		+ "\n" +"Digite 1 para 'sim, já realizei os cadastros'."
				   				+ "\n" +"Digite 2 para 'não, ainda não fiz os cadastros'.");
				   int caseCadastroAtendimento = respostaCadastro.nextInt();
				   
				   if(caseCadastroAtendimento == 1) {
					   cadastroAtendimento_2();
					   
				   }else if (caseCadastroAtendimento == 2) {
					   System.out.println("Por favor vá cadastrar os alunos e os pedagogos para atendimento. \n"
					   		+ "Direcionando você para o menu de cadastro... \n");
					   inicioCadastro();
					   
				   } else {
					   cadastroAtendimento_1();
				   }
				   
				   
			   }
			   
			   static void cadastroAtendimento_2() {
				   
				   Scanner scanIdAlunoAtendimento = new Scanner(System.in);
				   System.out.println("CADASTRO ATENDIMENTO PEDAGOGICO: \n"
				   		+ "Insira o ID do aluno cadastrado que você quer cadastrar um atendimento pedagogico: ");
				   int idAlunoAtendimento = scanIdAlunoAtendimento.nextInt();
				   
			        for (aluno aluno: alunos) {
			        	
			            if(aluno.getId() == idAlunoAtendimento) {
			            	aluno.addAtendimento();
			            	System.out.println("adicionado atendimento \n");
			            }
			        }
			        
			        Scanner scanIdPedagogoAtendimento = new Scanner(System.in);
			        System.out.println("Insira o ID do pedagogo cadastrado que você quer cadastrar um atendimento pedagogico: ");
			        int idPedagogoAtendimento = scanIdPedagogoAtendimento.nextInt();
			        
			        for (pedagogo pedagogo: pedagogos) {
			        	
			            if(pedagogo.getId() == idPedagogoAtendimento) {
			            	pedagogo.addAtendimento();
			            	System.out.println("adicionado atendimento \n");
			            }
			        }
			   }


//FINAL CADASTRO ATENDIMENTO

}