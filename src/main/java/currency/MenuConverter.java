package currency;

import java.util.Scanner;

public class MenuConverter {
    private Scanner leitura = new Scanner(System.in);

    public void showMenu() {
        int option = 0;  // Inicializar a opção com um valor que não é 7 para entrar no loop

        String menu = """
                ******************************************************************
                Seja bem-vindo/a ao Conversor de Moeda =]
                
                1) Dólar =>>> Peso Argentino
                2) Peso Argentino =>>> Dólar
                3) Dólar =>>> Real
                4) Real =>>> Dólar
                5) Dólar =>>> Peso Colombiano
                6) Peso Colombiano =>>> Dólar
                7) Sair
                
                Escolha uma das opções acima.
                
                ******************************************************************
                """;

        while(option != 7) {
            System.out.println(menu);
            option = leitura.nextInt();

            switch(option) {
                case 1:
                    System.out.println("Você escolheu Dólar =>>> Peso Argentino");
                    // Adicione a lógica de conversão aqui
                    break;
                case 2:
                    System.out.println("Você escolheu Peso Argentino =>>> Dólar");
                    // Adicione a lógica de conversão aqui
                    break;
                case 3:
                    System.out.println("Você escolheu Dólar =>>> Real");
                    // Adicione a lógica de conversão aqui
                    break;
                case 4:
                    System.out.println("Você escolheu Real =>>> Dólar");
                    // Adicione a lógica de conversão aqui
                    break;
                case 5:
                    System.out.println("Você escolheu Dólar =>>> Peso Colombiano");
                    // Adicione a lógica de conversão aqui
                    break;
                case 6:
                    System.out.println("Você escolheu Peso Colombiano =>>> Dólar");
                    // Adicione a lógica de conversão aqui
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma das opções acima.");
            }
        }

        leitura.close();
    }
}
