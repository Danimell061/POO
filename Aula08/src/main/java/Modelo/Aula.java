package Modelo;

public class Aula {
    public static void main(String[] args) {
        int[] idade = new int[5];
        idade[0] = 20;
        idade[1] = 10;
        idade[2] = 25;
        idade[3] = 35;
        idade[4] = 45;
        
        int soma = idade[0] + idade[1];
        System.out.println("A soma é " + soma);
        
        int sub = idade[0] - idade[1];
        System.out.println("A subtração é " + sub);
        
        int mult = idade[0] * idade[1];
        System.out.println("A multiplicação é " + mult);
        
        int div = idade[0] / idade[1];
        System.out.println("A divisão é " + div);
        
        for(int i=0;i<5;i++){
            System.out.println("A idade encontra-se " 
                            + "na posição "+ (i+1) + " é "+ idade[i]);
        }
        
        
    }
    
}
