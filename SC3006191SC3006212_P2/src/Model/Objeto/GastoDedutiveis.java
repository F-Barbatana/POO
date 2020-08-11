package Model.Objeto;

public class GastoDedutiveis{
    private String name;
    private String tipo;
    private double valor;

    public GastoDedutiveis(String name, String tipo, double valor) {
        this.name = name;
        this.tipo = tipo;
        this.valor = valor;
    }

    public GastoDedutiveis() {
        this.name = name;
        this.tipo = tipo;
        this.valor = valor;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
