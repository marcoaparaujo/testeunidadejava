import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    public void deveRetornarClasse1() {
        Veiculo veiculo = new Veiculo();
        veiculo.setAno(1970);
        veiculo.setPeso(1199);
        assertEquals(1, veiculo.obterClasse());
    }

}