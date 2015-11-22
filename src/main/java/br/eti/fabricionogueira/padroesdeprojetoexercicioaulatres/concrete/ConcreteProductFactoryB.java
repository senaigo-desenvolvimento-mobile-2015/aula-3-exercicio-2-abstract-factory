package br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.concrete;

import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.ImprimeMensagem;
import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.factory.AbstractProductFactory;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 21, 2015
 */
public class ConcreteProductFactoryB implements AbstractProductFactory{

    @Override
    public void productFactoryMethodOne() {
        new CommadGerarJson();
    }

    @Override
    public void productFactoryMethodTwo() {
        ImprimeMensagem.getInstance().m(
            getClass().getSimpleName()+
            " Método: "+
            new Object(){}.
            getClass().
            getEnclosingMethod().
            getName()
        );
    }

    @Override
    public void productFactoryMethodThree() {
        ImprimeMensagem.getInstance().m(
            getClass().getSimpleName()+
            " Método: "+
            new Object(){}.
            getClass().
            getEnclosingMethod().
            getName()
        );
    }
}
