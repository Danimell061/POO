package src;

public class Mavenproject1 {
    public static void main(String[] args) {
        metodoErro();
    }
    static void metodoErro(){
        try{
            int i = 5571;
            i = i/0;
            System.out.println("O resultado: " + i);
        }
        catch(ArithmeticException erro){
            System.out.println("Erro: "+erro);
        }
        }
    }

