public class Persistencia {
    public void salvar(String dados, String arquivo) {
        try(FileWriter writer = new FileWriter(arquivo)) {
            writer.writer(dados);
        }
    }
}

public class PersistenciaJSON extends Persistencia {
    private Persistencia persistencia;

    public PersistenciaJSON(Persistencia persistencia) {
        this.persistencia = persistencia;
    }

    public void salvar(String dados, String arquivo) {
        if(!dados.startsWith('{')) {
            throw new IllegalArgumentException('Dados não estão em formato JSON');
        }
        persistencia.salvar(dados, arquivo);
    }
}