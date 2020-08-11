abstract class Animal  {
    String nome;
    public abstract void emitirSom();

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{" +  getNome()   +'}';
    }
}
