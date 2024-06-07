package gof.Facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepAPI;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepAPI.getInstance().getCidade(cep);
        String estado = CepAPI.getInstance().getEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
