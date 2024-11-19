public class EquipamentoCorrigido extends Equipamento {
    int  mesCorrente;
    int [] mesCompra;

    EquipamentoCorrigido(int numeroEquipamentos, int mesCorrente) {
        super(numeroEquipamentos);
        this.mesCompra = new int[numeroEquipamentos];
        this.mesCorrente = mesCorrente;
    }

    public int getMesCorrente() {
        return mesCorrente;
    }

   public void setMesCorrente(int mesCorrente) {
        this.mesCorrente = mesCorrente;
    }

    public int getMesCompra(int numero) {
        return this.mesCompra[numero];
    }
    public void setMesCompra(int numero, int mes) {
        this.mesCompra[numero] = mes;
    }

    public void Corrige(int percentual){
        for(int i=0;i<this.getNumeroEquipamentos();i++){
            int corrigindo = getValor(i);
            if(this.mesCompra[i] == this.mesCorrente){
                corrigindo += percentual;
                setValor(i,corrigindo);
            }
        }
        this.mesCorrente++;
    }

    public void substitue(EquipamentoCorrigido c){
        if(this.getNumeroEquipamentos() == c.getNumeroEquipamentos()){
            for(int i=0;i<this.getNumeroEquipamentos();i++){
                this.setMesCompra(i, c.getMesCompra(i));
                this.setValor(i, c.getValor(i));
                this.setMesCorrente(c.getMesCorrente());
            }
        }
    }

}
