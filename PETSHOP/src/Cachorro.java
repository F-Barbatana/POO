public class Cachorro {

    private String nome;
    private String raca;
    private boolean vacinado;

    public Cachorro(String nome, String raca, boolean vacinado) {
        this.nome = nome;
        this.raca = raca;
        this.vacinado = vacinado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Boolean getVacinado() {
        return vacinado;
    }

    public void setVacinado(Boolean vacinado) {
        this.vacinado = vacinado;
    }

    public String Listar(){
        return "Nome:"+nome+"|Raca:"+raca+"|Vacinado:"+vacinado;
    }
}
