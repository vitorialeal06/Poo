package multifuncional;

import copiadora.Copiadora;
import digitalizadora.Digitalizadora;
import impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Digitalizadora, Copiadora {

    @Override
    public void imprimir() {
        System.out.println("Equipamento multifuncional imprimindo");
    }
    public void copiar(){
        System.out.println("Copiando pelo multifuncional");
    }

    public void digitalizar(){
        System.out.println("Digitalizando pelo multifuncional");
    }
}

