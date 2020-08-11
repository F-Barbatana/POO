package Model.ConcreteClasse;

import Model.Objeto.GastoDedutiveis;

import java.util.List;


public class CompletaDeclara extends Model.Abstract.ImpostoRendaPessoaFisica {

    @Override
    public double CalcularImposto(double Recebimento,double Pago, List<GastoDedutiveis>Dedutiveis){
        double total = 0;


        if (Recebimento> 22847.88) {

            total = total + Recebimento*0.075;

            for (GastoDedutiveis G : Dedutiveis) {
                Pago += G.getValor();
                System.out.println(Pago);
            }

            if(Recebimento>33919.92){
                total = total + Recebimento*0.15;
            }

           total = total - Pago;
        }
        return total;
    }





    ;

}
