public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}
	
	public ContaCorrente() {  
        super();
    }

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns(); //metodo protegido para acesso de classes filhas
		
	}
	
}