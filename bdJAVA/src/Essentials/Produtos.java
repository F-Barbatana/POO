package Essentials;


public class Produtos {

    private int quant;
    private double val;
    private String Name;
    private long code;


        public Produtos(String name, int quant, double val, long code) {
        this.Name = name;
        this.quant = quant;
        this.val = val;
        this.code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val ;
    }


    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }
}
