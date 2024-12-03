package exercicios;

public class CalcDados {
    double n1, n2;
    char operador;


    public void setOperando(int i, double valor){
        if(i ==1)
            n1 = valor;
        else
            n2 = valor;
    }
    public double getOperando(int i){
        if(i==1)
            return n1;
        else
            return n2;
    }

    public void setOperacao(char op){
        operador = op;
    }
    public char getOperacao(){
        return operador;
    }

    private double opera(double op1, double op2, char op){
        switch(op){
            case '+': return op1 + op2;
            case '-': return op1 - op2;
            case '*': return op1 * op2;
            case '/':
                if(op2 == 0)
                    System.out.println("nao existe divisao por zero");
                else
                    return op1 / op2;
        }
        return 1;
    }
}
