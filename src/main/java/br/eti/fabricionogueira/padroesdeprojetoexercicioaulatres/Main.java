package br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres;

import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.concrete.ConcreteFactoryA;
import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.concrete.ConcreteFactoryB;
import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.concrete.ConcreteFactoryC;
import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.concrete.ConcreteFactoryD;
import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.factory.AbstractFactory;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 21, 2015
 */
public class Main {
    /**
     * Execução do sistema (Cliente)
     *
     * @param args
     */
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static void main(String[] args) {
        try {
            while (true) {
                int n = userInput();
                if (n != 0) {
                    new Application(callFactory(n));
                } else {
                    ImprimeMensagem.getInstance().bye();
                    System.exit(0);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
    /**
     * Retorna a factory correta por polimorfismo em tempo de execução.
     *
     * @param input int Entrada do usuário
     * @return Factory
     * @throws java.lang.Exception
     */
    public static AbstractFactory callFactory(int input) throws Exception {
        switch (input) {
            case 1: //Email
                return new ConcreteFactoryA();
            case 2: //JSON
                return new ConcreteFactoryB();
            case 3: //PDF"
                return new ConcreteFactoryC();
            case 4: //XML
                return new ConcreteFactoryD();
            default:
                throw new Exception("Ação não programada!");
        }
    }
    /**
     * Menu listener
     */
    private static int userInput() {
         try {
            System.out.println(messageMannager());
            Scanner reader = new Scanner(System.in);
            int n = reader.nextInt();
            return n;
        } catch (InputMismatchException e) {
             System.err.println("Entrada de dados inválida.");
             return 0;
        }
    }
    /**
     * Cria o menu com as opções do sistema.
     */
    private static String messageMannager() {
        StringBuilder str = new StringBuilder();
        str.append("Selecione a ação:\n");
        str.append("1: Enviar Email\n");
        str.append("2: Gerar JSON\n");
        str.append("3: Gerar PDF\n");
        str.append("4: Gerar XML\n");
        str.append("0: Encerrar o sistema\n");
        return str.toString();
    }
}
