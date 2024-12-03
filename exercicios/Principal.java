package exercicios;

public class Principal {
    public static void main(String[] args) {
        // Instanciando os objetos
        CalcDados dados = new CalcDados();
        CalcInterface interfaceCalc = new CalcInterface();
        CalcControle controle = new CalcControle(interfaceCalc, dados);

        // Executa o controle da calculadora
        controle.executar();
    }
}
