package DependencyInject;

import FoodService.AtivacaoClienteService;
import Modelo.Cliente;
import Notificacao.Notificador;
import Notificacao.NotificadorSMS;


public class main {
    public static void main(String[] args) {
        Cliente joao = new Cliente("Joao", "joao.@.com", "1699199191");
        Cliente maria = new Cliente("Maria", "maria.@.com", "1690909990");

        Notificador notificador = new NotificadorSMS();


        AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
        ativacaoClienteService.ativar(joao);
        ativacaoClienteService.ativar(maria);

    }
}
