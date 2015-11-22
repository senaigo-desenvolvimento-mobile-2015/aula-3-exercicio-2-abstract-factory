package br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.command.concrete;

import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.ImprimeMensagem;
import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.command.BaseCommand;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 21, 2015
 */
public class CommadGerarXml implements BaseCommand{

    public CommadGerarXml() {
        ImprimeMensagem.getInstance().prepare();
        executar();
        ImprimeMensagem.getInstance().ending();
    }
    
    @Override
    public void executar() {
        ImprimeMensagem.getInstance().c(getClass().getSimpleName());
    }
}
