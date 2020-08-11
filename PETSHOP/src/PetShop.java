import java.util.HashMap;
import java.util.Map;

public class PetShop {
    private Map<String,Pessoa> Clientes =new HashMap<>();


    public void addPessoa(String cpf,String nome){
        Pessoa criar = new Pessoa(cpf, nome);
        if(!Clientes.containsKey(cpf)){
            Clientes.put(cpf,criar);
        }else {
            System.out.println("Erro, usuario ja cadastrado!");
        }
    }

    public void addCachorro(String cpf,String name, String raca, boolean vacina){
        Clientes.get(cpf).AddDog(name,raca,vacina);

    }

    public void listPessoas(){
        for (Map.Entry<String,Pessoa> P : Clientes.entrySet()){
            System.out.println(P.getValue().Exibir());
        }
    }

    public void listCachorros(String Cpf){
        Clientes.get(Cpf).listDogs();
    }

    public void removePessoa(String cpf){
        Clientes.remove(cpf);
    }

    public void removeCachorro(String cpf,String name){
        Clientes.get(cpf).deletarDog(name);
    }

    public void listVacinados(boolean vac){
        for (Map.Entry<String,Pessoa> P : Clientes.entrySet()){
            P.getValue().ListVacina(vac);
        }
    }

    public void listVacinados(boolean vac,String Cpf){
        Clientes.get(Cpf).ListVacina(vac);
    }

}
