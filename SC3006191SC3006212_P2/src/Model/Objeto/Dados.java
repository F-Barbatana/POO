package Model.Objeto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dados {
    public static List<GastoDedutiveis> gastos;

    public static List<GastoDedutiveis> gerarGastos(){
        GastoDedutiveis Escola1 = new GastoDedutiveis("Obejtivo","Escola",590.00);
        GastoDedutiveis Escola2 = new GastoDedutiveis("COC","Escola",220.00);
        GastoDedutiveis Escola3 = new GastoDedutiveis("Kaer Morhen","Escola",290.00);
        GastoDedutiveis Escola4 = new GastoDedutiveis("Vida","Escola",99.00);

        GastoDedutiveis Saude1 = new GastoDedutiveis("Plano de Saude","Saude",1900.00);
        GastoDedutiveis Saude2 = new GastoDedutiveis("Tratamento","Saude",450.00);
        GastoDedutiveis Saude3 = new GastoDedutiveis("Remedios","Saude",100.00);
        GastoDedutiveis Saude4 = new GastoDedutiveis("cirurgias","Saude",5050.50);

        gastos = new ArrayList<>();
        gastos.addAll(Arrays.asList(Escola1,Escola2,Escola3,Escola4,Saude1,Saude2,Saude3,Saude4));
        return gastos;
    };


}
