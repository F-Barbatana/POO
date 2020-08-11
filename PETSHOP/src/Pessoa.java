import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Pessoa {
    private String cpf;
    private String nome;
    private Map<String, Cachorro> Cachorros = new HashMap<>();


    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public void AddDog(String nome, String raca, boolean vacinado) {
        Cachorros.put(nome, new Cachorro(nome, raca, vacinado));
    }

    public String Exibir() {
        return "Nome:" + nome + "|CPF:" + cpf;
    }

    public void listDogs() {
        if (Cachorros.size() != 0) {
            for (Map.Entry<String, Cachorro> P : Cachorros.entrySet()) {
                System.out.println(P.getValue().Listar());
            }
        }
    }

    public void deletarDog(String name) {
        Cachorros.remove(name);
    }

    public void ListVacina(boolean vac) {

        for (Map.Entry<String, Cachorro> P : Cachorros.entrySet()) {
            if (P.getValue().getVacinado().equals(vac)) {
                System.out.println(P.getValue().Listar());
            }
        }
    }
}


