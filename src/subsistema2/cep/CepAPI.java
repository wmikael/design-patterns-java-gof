package subsistema2.cep;

public class CepAPI {
    private static CepAPI instance = new CepAPI();

    private CepAPI() {
    }

    public static CepAPI getInstance() {
        return instance;
    }

    public String getCidade(String cep) {
        return "São Luís";
    }

    public String getEstado(String cep) {
        return "MA";
    }
}
