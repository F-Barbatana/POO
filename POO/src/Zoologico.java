public class Zoologico {
    public static void main(String[] args) {
        Animal jaulas[] = new Animal[10];

        Coruja novaCo =  new Coruja("Oraclo");
        jaulas[0] = novaCo;

        Leao novoLe = new Leao("Simba");
        jaulas[1]= novoLe;

        Lobo novoLo  = new Lobo("Mordida");
        jaulas[2]= novoLo;

        Coruja novaCo2 =  new Coruja("Fumaça");
        jaulas[3] = novaCo2;

        Leao novoLe2 = new Leao("Scar");
        jaulas[4]= novoLe2;

        Lobo novoLo2  = new Lobo("Snow");
        jaulas[5]= novoLo2;

        Coruja novaCo3 =  new Coruja("Froddo");
        jaulas[6] = novaCo3;

        Leao novoLe3 = new Leao("Lingua");
        jaulas[7]= novoLe3;

        Lobo novoLo3  = new Lobo("gelo");
        jaulas[8]= novoLo3;

        Coruja novaCo4 =  new Coruja("Pena");
        jaulas[9] = novaCo4;


        for (int i = 0; i < jaulas.length; i++) {
            System.out.println(jaulas[i]);
            jaulas[i].emitirSom();
        }

    }
}

