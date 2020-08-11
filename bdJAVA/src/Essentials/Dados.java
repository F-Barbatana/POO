package Essentials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dados {
    public static List<Produtos> Produtos;

    public static List<Produtos> gerarGastos(){

        if (BancoDados.leitura() != null){
            Produtos = BancoDados.leitura();
            return Produtos;
        }else {

            Produtos = new ArrayList<>();
        }

        return Produtos;
    };


}
