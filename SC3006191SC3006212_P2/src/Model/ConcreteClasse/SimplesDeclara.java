package Model.ConcreteClasse;

import Model.Objeto.GastoDedutiveis;
import java.util.List;

public class SimplesDeclara  extends Model.Abstract.ImpostoRendaPessoaFisica {



    @Override
    protected double CalcularImposto(double Recebimento, double Pago, List<GastoDedutiveis> valores) {
        return (Recebimento*0.20) - Pago;
    }




}
