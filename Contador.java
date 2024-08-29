import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner (System.in);
        System.out.println("Digite o parâmetro 1");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        
        try {
            
            contar(parametroUm, parametroDois);

    } catch (ParametrosInvalidosException e) {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");    

    }
    terminal.close();
        
    }
    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        
        int resultado = parametroDois - parametroUm;
        System.out.println("O resultado de interações que derão o for é:" + resultado);

        for (int i = 0; i < resultado; i++) {
            System.out.println("Imprimindo o número " + (i+1));
            
        }

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();

        }
    }
}
