package visao;

import Modelo.Conteudo;
import javax.swing.JOptionPane;


public class Exibir {
    public static void main(String[] args) {
        Conteudo pessoa = new Conteudo();
        pessoa.setNome(JOptionPane.showInputDialog(null,"Digite o nome do aluno"));
        
        JOptionPane.showMessageDialog(null, "O nome da pessoa é "+ pessoa.getNome());
    }
}
