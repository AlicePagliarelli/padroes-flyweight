package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Lanchonete {

    private List<Cliente> clientes = new ArrayList<>();

    public void cadastrar(String nomeCliente, String nomeCidade, String uf) {
        Cidade cidade = CidadeFactory.getCidade(nomeCidade, uf);
        Cliente cliente = new Cliente(nomeCliente, cidade);
        clientes.add(cliente);
    }

    public List<String> obterClientes() {
        List<String> saida = new ArrayList<String>();
        for (Cliente cliente : this.clientes) {
            saida.add(cliente.obterCliente());
        }
        return saida;
    }


}
