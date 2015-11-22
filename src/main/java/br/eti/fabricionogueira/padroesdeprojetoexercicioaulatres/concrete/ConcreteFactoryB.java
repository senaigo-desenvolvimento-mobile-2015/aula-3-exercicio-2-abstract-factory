package br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.concrete;

import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.factory.AbstractFactory;
import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.factory.AbstractProductFactory;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 21, 2015
 */
public class ConcreteFactoryB implements AbstractFactory{

    @Override
    public AbstractProductFactory create() {
        return new ConcreteProductFactoryB();
    }
}
