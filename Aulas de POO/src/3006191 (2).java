

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int [] dias_Semana;
        dias_Semana = new int[7];
        Scanner ler = new Scanner(System.in);
        int total = 0;
        int count = 0;

        for (int i = 0; i < dias_Semana.length; i++) {
            dias_Semana[i] = ler.nextInt();
            total += dias_Semana[i];
        }


        for (int j:dias_Semana) {
            if (total/7 < j){
                count++;
            }
        }

        System.out.println(count);

    }
}
