import digitalizadora.Scaner;
import multifuncional.EquipamentoMultifuncional;

public class TestMulti {
    public static void main(String[] args) {

        EquipamentoMultifuncional equipamento = new EquipamentoMultifuncional();
        Scaner scanner = new Scaner();

        scanner.digitalizar();

        equipamento.copiar();
        equipamento.imprimir();
        equipamento.digitalizar();
    }
}
