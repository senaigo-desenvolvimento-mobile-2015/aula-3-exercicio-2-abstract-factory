package br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres;

/**
 * Singleton
 *  Gerencia as mensagens dos sistema.
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 21, 2015
 */
public class ImprimeMensagem {
    
    private static final ImprimeMensagem INSTANCE = new ImprimeMensagem();
    
    private ImprimeMensagem(){}
    
    public static ImprimeMensagem getInstance(){
        return INSTANCE;
    }
    
    public void m(String n){
        System.out.println("\n>: Executar ações da classe: "+ n);
    }
    
    public void c(String n){
        System.out.println("\n>: Executar command: "+ n);
    }
    
    public void prepare(){
        System.out.println("\n~> Preparando a execução...");
    }
    
    public void ending(){
        System.out.println("\n~> Finalizando a execução...");
    }
    
    public void bye(){
        System.out.println("\nbye!\n");
    }
}
