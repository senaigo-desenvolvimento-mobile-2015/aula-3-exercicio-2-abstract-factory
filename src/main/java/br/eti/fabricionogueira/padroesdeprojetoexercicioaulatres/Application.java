package br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres;

import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.factory.AbstractFactory;
import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.factory.AbstractProductFactory;

/**
 * 
 * Na aplicação em execução, o programa recebe uma factory abstrata e
 * proporciona uma interface para criar famílias de objetos relacionados 
 * ou dependentes sem especificar suas classes concretas
 *
 * Usar quando:
 *  O sistema deve ser configurado com uma de múltiplas famílias de produtos
 *  Estes produtos relacionados são projetados para serem utilizados juntos,
 *  e você quer garantir essa restrição.
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 21, 2015
 */
public class Application {
    /**
     * Construtor
     * 
     * Recebendo a Abstract factory como parâmetro quando realizar o 
     * polimorfismo, em tempo de execução.
     * 
     * @param abstractFactory
     */
    public Application(AbstractFactory abstractFactory) {
        /*
         * Instanciação do objeto PRODUTO abstrato
         * Nesse momento tudo é abstrato, não se sabe qual objeto está 
         * instanciando e também não se sabe qual factory está sendo chamada em 
         * tempo de compilação só se sabe em tempo de execução.
         */
        AbstractProductFactory abstractProduct = abstractFactory.create();
        /*
         * Chamada aos métodos abstratos (produtos)
         */
        abstractProduct.productFactoryMethodOne();
        abstractProduct.productFactoryMethodTwo();
        abstractProduct.productFactoryMethodThree();
    }    
}
