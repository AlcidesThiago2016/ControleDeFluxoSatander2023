package digitalinovation.com.codes;

import digitalinovation.com.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("***Sistema de Controle de Fluxo***");
        System.out.println("Informe o 1° número: ");
        int n1 = sc.nextInt();

        System.out.println("Informe o 2° número: ");
        int n2 = sc.nextInt();

        try {
            contar(n1, n2);
        }catch (ParametrosInvalidosException e){
            e.getMessage();
            System.out.println("Exceção lançada, favor analisar!");
            System.out.println("O SEGUNDO NUMERO INFORMADO " + n2 + " DEVE SER MAIOR QUE O PRIMEIRO " + n1);
        }

        sc.close();
    }

    static void contar(int n1, int n2) throws ParametrosInvalidosException{
        if (n1 > n2 ){
            throw new ParametrosInvalidosException();
        }else {
            int contagem = n2 - n1;
            for (int i = 1; i <= contagem; i++ ){
                System.out.println("Imprimindo... " + i);
            }
        }
    }
}
