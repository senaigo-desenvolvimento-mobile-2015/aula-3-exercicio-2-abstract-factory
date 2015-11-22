package br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.command.concrete;

import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.ImprimeMensagem;
import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.command.BaseCommand;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 21, 2015
 */
public final class CommadEnviarPorEmail implements BaseCommand {
    
    public CommadEnviarPorEmail() {
        ImprimeMensagem.getInstance().prepare();
        executar();
        ImprimeMensagem.getInstance().ending();
    }

    @Override
    public void executar() {
        ImprimeMensagem.getInstance().c(getClass().getSimpleName());
    }
}
