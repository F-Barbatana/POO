package Ex02;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


      Scanner leitor = new Scanner(System.in);
        String frase_A = leitor.nextLine();
        String frase_B = leitor.nextLine();

        char[] a = frase_A.toCharArray();
        char[] b = frase_B.toCharArray();


        if(frase_A.equals(frase_A.toLowerCase())&&frase_B.equals(frase_B.toLowerCase())){

            String senha = "";

            for(int i = Array.sort(a) - 1; i >= 0; i--)
            {
                senha = senha + frase.charAt(i);
            }

            System.out.println(senha);
            if (frase.equalsIgnoreCase(senha)){
                System.out.println("Sim");
            }else {
                System.out.println("Nao");
            }


        }else {
            System.out.println("Erro");
        }




    }



}

