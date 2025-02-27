public class App {
    public static void main(String[] args) throws Exception {
        // interface set sem elementos duplicados
        // set sem elementos aleatorios

        // ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        // System.out.println("Existem " + conjuntoConvidados.contarConvidado() + "
        // dentro de convidados");

        // conjuntoConvidados.adicionarConvidado("Pedro", 1234);
        // conjuntoConvidados.adicionarConvidado("ALD", 1335);
        // conjuntoConvidados.adicionarConvidado("domas", 1222234);
        // // nao sera adicionado devido duplicidade
        // conjuntoConvidados.adicionarConvidado("aALE", 1335);

        // System.out.println("Existem " + conjuntoConvidados.contarConvidado() + "
        // dentro de convidados");

        // conjuntoConvidados.removerConvidadoPorCodigo(1234);

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("gaba", 1);
        agendaContatos.adicionarContato("gaba vereda", 2);
        agendaContatos.adicionarContato("verda", 3);
        agendaContatos.adicionarContato("dada", 4);
        agendaContatos.adicionarContato("cc", 5);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisaPorNome("gaba"));
        System.out.println(agendaContatos.pesquisaPorNomefINAL("vereda"));

        agendaContatos.atualizarNumeroContato("gaba", 500);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisaPorNome("gaba"));
        System.out.println(agendaContatos.pesquisaPorNomefINAL("vereda"));

    }
}
