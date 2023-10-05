package q05;

import java.text.SimpleDateFormat;

class TransacaoService {
    public boolean verificarFraude(Transacao transacao) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH");
        int hours = Integer.parseInt(dateFormat.format(transacao.getData()));
        return hours < 6 || hours > 23;
    }
}

