import java.util.Scanner;

//Fabricio SC3006191

public class Main {

    public static void main(String[] args) {
        PetShop Pets = new PetShop();
        int val = 1;
        Scanner leitor = new Scanner(System.in);
        while (val == 1){
            System.out.println("=====Menu=====");
            System.out.println("[1]Adcionar pessoas");
            System.out.println("[2]Adcionar Cachorro");
            System.out.println("[3]Listar pessoas");
            System.out.println("[4]Listar Cachorros");
            System.out.println("[5]Remove pessoa");
            System.out.println("[6]Remove Cachorro");
            System.out.println("[7]Listar Vacinados");
            System.out.println("[8]Listar Vacinados(por dono)");
            System.out.println("[9]Sair");

            int menu = leitor.nextInt();


            switch(menu){
                case 1:
                    System.out.println("Digite o nome e cpf:");
                    leitor.nextLine();

                    String nome = leitor.nextLine();
                    String cpf = leitor.nextLine();

                    Pets.addPessoa(cpf,nome);

                    break;
                case 2:

                    System.out.println("Digite o cpf do dono(Use apenas numero):");
                    leitor.nextLine();
                    String CPF = leitor.nextLine();
                    System.out.println("Digite o nome do cachorro:");
                    leitor.nextLine();
                    String name = leitor.nextLine();
                    System.out.println("Digite a raca:");
                    leitor.nextLine();
                    String raca = leitor.nextLine();
                    System.out.println("é vacinado:(true/false)");
                    boolean vac = leitor.nextBoolean();

                    Pets.addCachorro(CPF,name,raca,vac);

                    break;
                case 3:
                    Pets.listPessoas();
                    break;
                case 4:
                    System.out.println("Digite o cpf(Use apenas numero):");
                    leitor.nextLine();
                    String Cpf_listar = leitor.nextLine();
                    Pets.listCachorros(Cpf_listar);
                    break;
                case 5:
                    System.out.println("Digite o cpf(Use apenas numero):");
                    leitor.nextLine();
                    String Cpf_remover = leitor.nextLine();
                    Pets.removePessoa(Cpf_remover);
                    break;
                case 6:
                    System.out.println("Digite o cpf(Use apenas numero):");
                    leitor.nextLine();
                    String Cpf_remover_dog = leitor.nextLine();
                    System.out.println("Digite o nome do cachorro:");
                    leitor.nextLine();
                    String name_DOG = leitor.nextLine();
                    Pets.removeCachorro(Cpf_remover_dog,name_DOG);
                    break;
                case 7:
                    System.out.println("Listar vacinados ou nao:(true/false)");
                    leitor.nextLine();
                    boolean vac_list = leitor.nextBoolean();
                    Pets.listVacinados(vac_list);
                    break;
                case 8:
                    System.out.println("Listar vacinados ou nao:(true/false)");
                    leitor.nextLine();
                    boolean vac_lista = leitor.nextBoolean();
                    System.out.println("Digite o cpf(Use apenas numero):");
                    leitor.nextLine();
                    String cpf_list = leitor.nextLine();
                    Pets.listVacinados(vac_lista,cpf_list);
                    break;
                case 9:
                    val = 0;
                    break;
            }


        }
    }
}
