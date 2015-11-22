package br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.command.concrete;

import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.factory.AbstractFactory;
import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.factory.AbstractProductFactory;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 21, 2015
 */
public class ConcreteFactoryD implements AbstractFactory{

    @Override
    public AbstractProductFactory create() {
        return new ConcreteProductFactoryD();
    }
}
