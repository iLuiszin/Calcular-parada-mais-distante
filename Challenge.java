import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Challenge {

    public static int ultimaParada(int combustivel, int consumo, List<Integer> postosDeGasolina) {

        int alcance = combustivel * consumo;
        int valorDoElementoAtual = 0;
        int postoMaisDistanteConsiderandoAlcance = 0;
        List<Integer> lista = postosDeGasolina;

        for (int x = 0; x < lista.size(); x++) {
            valorDoElementoAtual = lista.get(x).intValue();
            if (alcance > valorDoElementoAtual) {
                if (valorDoElementoAtual > postoMaisDistanteConsiderandoAlcance) {
                    postoMaisDistanteConsiderandoAlcance = valorDoElementoAtual;
                }
            }
            if (postoMaisDistanteConsiderandoAlcance < 1) {
                return -1;
            }
        }
        return postoMaisDistanteConsiderandoAlcance;
    }
}
