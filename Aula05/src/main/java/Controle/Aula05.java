package Controle;

public class Aula05 {
    
    public static void main(String[] args) {
        String string1 = "TI Catolica";
        String string2 = "ti catolica"; 
        int comparacao = string1.compareTo(string2);
        
        if (comparacao > 0) {
        System.out.println("string1 é maior que string2");
        } 
        else if (comparacao < 0) {
        System.out.println("string1 é menor que string2");
        } 
        else {
        System.out.println("string1 é igual a string2");
        }
        
    }
}
