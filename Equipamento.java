public class Equipamento {
    private int [] valor;
    int numeroEquipamentos;

    Equipamento(int numeroEquipamentos) {
        valor = new int[numeroEquipamentos];
        this.numeroEquipamentos = numeroEquipamentos;
    }

    public int getNumeroEquipamentos() {
        return numeroEquipamentos;
    }

    public int getValor(int numero) {
        return valor[numero];
    }

    public void setValor(int  numero, int valor) {
        this.valor[numero] = valor;
    }
}
