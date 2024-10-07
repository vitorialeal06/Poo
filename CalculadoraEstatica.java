class CalculadoraEstatica {
    public static int soma(int a, int b){
        return a+b;
    }
    public static int subtracao(int a, int b){
        return a-b;
    }
    public static int multiplicacao(int a, int b){
        return a*b;
    }
    public static int divisao(int a, int b){
        if(b != 0)
            return a/b;
        else{
            System.out.println("divisao por zero invalida");
            return 0;
        }
    }

    public static void main(String[] args) {
        CalculadoraEstatica calcula = new CalculadoraEstatica();
        System.out.println(calcula.soma(3,5));
        System.out.println(calcula.subtracao(3,5));
        System.out.println(calcula.multiplicacao(3,5));
        System.out.println(calcula.divisao(3,0));

    }
}
