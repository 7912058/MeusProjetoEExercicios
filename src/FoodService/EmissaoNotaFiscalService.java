package FoodService;

import Modelo.Cliente;
import Modelo.Produto;
import Notificacao.Notificador;
import Notificacao.NotificadorEmail;
import Notificacao.NotificadorSMS;

public class EmissaoNotaFiscalService {

    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador){
        this.notificador = notificador;
    }

    public void notaFiscal(Cliente cliente, Produto produto){
        //TODO emite a nota fiscal aqui...

        this.notificador = new NotificadorSMS();
        notificador.notificar(cliente, "Nota fiscal do produto " + produto.getNome() + " foi emitida");
    }

}
