package visao;

import Modelo.Conteudo;
import javax.swing.JOptionPane;


public class Exibir {
    public static void main(String[] args) {
        Conteudo pessoa = new Conteudo();
        pessoa.setNome(JOptionPane.showInputDialog(null, "Digite o nome do aluno", "Exemplo: Daniel"));
        
        JOptionPane.showMessageDialog(null, "O nome da pessoa é "+ pessoa.getNome());
        
        //Desafio - Armazenar os 5 nomes nesta estrtura de array;
    }
}
