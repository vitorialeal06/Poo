package exercicios;

public class CalcControle {
    double op1, op2;
    char op;
    CalcInterface calcinterface;
    CalcDados dados;

    public CalcControle(CalcInterface calcinterface, CalcDados calcdados) {
        this.calcinterface = calcinterface;
        this.dados = calcdados;
    }

    public void executar(){
        System.out.println("digite op1");
        op1 = calcinterface.recebeOperando(1);
        dados.getOperando(1);
        System.out.println("digite op2");
        op2 = calcinterface.recebeOperando(2);
        dados.getOperando(2);
        System.out.println("digite op");
        op = calcinterface.recebeOperacao();
        if(op == 's')
            System.exit(0);
        dados.setOperacao(op);



    }
}
