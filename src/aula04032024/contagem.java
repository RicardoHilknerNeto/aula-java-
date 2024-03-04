package aula04032024;

public class contagem {
    public static void main(String[] args) {
        int soma = 0;
        
        for(int cont =0 ; cont <=1000 ; cont++) {
        	
        	soma = soma + cont;
        }
        
        System.out.println("O resultado da soma é: " + soma);
    }
}
