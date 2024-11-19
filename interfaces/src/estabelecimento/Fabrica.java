package estabelecimento;

import digitalizadora.Scaner;
import multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional equipamento = new EquipamentoMultifuncional();
        Scaner scanner = new Scaner();

        scanner.digitalizar();

        equipamento.copiar();
        equipamento.imprimir();
        equipamento.digitalizar();
    }
}



