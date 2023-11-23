import java.io.FileWriter;
import java.io.IOException;

public class Questao3 {
    public interface PersistenciaStrategy {
        void salvar(String dados, String arquivo) throws IOException;
    }

    public class Persistencia implements PersistenciaStrategy {
        @Override
        public void salvar(String dados, String arquivo) throws IOException {
            try (FileWriter writer = new FileWriter(arquivo)) {
                writer.write(dados);
            }
        }
    }

    public class PersistenciaJSON implements PersistenciaStrategy {
        private PersistenciaStrategy persistencia;

        public PersistenciaJSON(PersistenciaStrategy persistencia) {
            this.persistencia = persistencia;
        }

        @Override
        public void salvar(String dados, String arquivo) throws IOException {
            if (!dados.startsWith("{")) {
                throw new IllegalArgumentException("Dados não estão em formato JSON.");
            }
            persistencia.salvar(dados, arquivo);
        }
    }
}
