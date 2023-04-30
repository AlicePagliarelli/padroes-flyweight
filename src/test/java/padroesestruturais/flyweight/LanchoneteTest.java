package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LanchoneteTest {

    @Test
    void deveRetornarClientes() {
        Lanchonete lanchonete = new Lanchonete();
        lanchonete.cadastrar("Jose", "Juiz de Fora", "MG");
        lanchonete.cadastrar("Maria", "Juiz de Fora", "MG");
        lanchonete.cadastrar("Ana", "Juiz de Fora", "MG");
        lanchonete.cadastrar("Joao", "Santos Dumont", "MG");

        List<String> saida = Arrays.asList(
                "Cliente{nome='Jose', cidade='Juiz de Fora', uf='MG'}",
                "Cliente{nome='Maria', cidade='Juiz de Fora', uf='MG'}",
                "Cliente{nome='Ana', cidade='Juiz de Fora', uf='MG'}",
                "Cliente{nome='Joao', cidade='Santos Dumont', uf='MG'}");

        assertEquals(saida, lanchonete.obterClientes());
    }

    @Test
    void deveRetornarTotalCidades() {
        Lanchonete lanchonete = new Lanchonete();
        lanchonete.cadastrar("Jose", "Juiz de Fora", "MG");
        lanchonete.cadastrar("Maria", "Juiz de Fora", "MG");
        lanchonete.cadastrar("Ana", "Juiz de Fora", "MG");
        lanchonete.cadastrar("Joao", "Santos Dumont", "MG");

        assertEquals(2, CidadeFactory.getTotalCidades());
    }

}