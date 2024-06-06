public class Main {

    public static void main(String[] args) {
        Banco primeiroBanco = new Banco(); //instanciando novo banco

        primeiroBanco.setNome("NuBank"); //inserindo nome do banco

        Cliente diego = new Cliente("Diego", primeiroBanco);  //novo cliente Diego
        diego.setNome("Diego Rodrigues Alves"); //insere o nome do cliente

        Conta ccorrente = new ContaCorrente(diego); //instanciada nova conta corrente

        ccorrente.depositar(100); //criado um deposito em conta corrente

        Cliente ana = new Cliente("Ana Paula", primeiroBanco);  //instancia novo cliente
        Conta cpoupanca = new ContaPoupanca(ana);  //instanciada nova conta poupanca

        ccorrente.imprimirExtrato();  //imprime extrato de ccorrente diego
        cpoupanca.imprimirExtrato();  //imprime estrato de cpoupanca ana

        ccorrente.transferir(48, cpoupanca);  //faz tranferencia de ccorrente diego pra cpoupanca ana

        ccorrente.imprimirExtrato(); //imprime extrato atualizado de ccorrente diego
        cpoupanca.imprimirExtrato(); //imprime extrato atualizado de cpoupanca ana
        primeiroBanco.mostrarClientes(); //mostra lista de clientes

        Cliente mariana = new Cliente("Mariana da Silva", primeiroBanco);  //instancia novo cliente Mariana
        Conta ccorrente2 = new ContaCorrente(mariana); //instancia nova ccorrente2 de mariana
        ccorrente2.imprimirExtrato();  //imprime  ccorrente2 de mariana
        primeiroBanco.mostrarClientes(); //mostra lista atualizada de clientes do banco
    }
}