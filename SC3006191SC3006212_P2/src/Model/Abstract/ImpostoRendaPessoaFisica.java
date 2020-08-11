package Model.Abstract;

import Model.Objeto.GastoDedutiveis;

import java.util.List;

public abstract class ImpostoRendaPessoaFisica {




    public double ImpostoRendaPessoaFisica(String Recebimento, String Pago, List<GastoDedutiveis> valores){
        double valRec = convert(Recebimento);
        double valPago = convert(Pago);
        return CalcularImposto(valRec,valPago,valores);
    }

    public double convert(String Val){
        return Double.parseDouble(Val);
    }

    protected abstract double CalcularImposto(double Recebimento,double Pago,List<GastoDedutiveis> valores);




}
