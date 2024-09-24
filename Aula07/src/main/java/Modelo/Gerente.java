package Modelo;

public class Gerente extends Funcionario {
   int senha;
   int numeroDeFuncionarios;
   
   public double getBonificacaoG(){
    return salario*0.15;
   }
}
