package gerenciamentoveiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroVeiculos {
    private static ArrayList<Veiculo> veiculos = new ArrayList<>(); // Cria uma lista estática para armazenar objetos Veiculo
    private static Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para leitura de dados do console

    public static void adicionarVeiculo() {
        System.out.print("Digite o número do chassi: "); // Solicita ao usuário o número do chassi
        String chassi = scanner.nextLine(); // Lê o número do chassi do console
        System.out.print("Digite a placa: "); // Solicita ao usuário a placa do veículo
        String placa = scanner.nextLine(); // Lê a placa do console
        System.out.print("Digite a marca: "); // Solicita ao usuário a marca do veículo
        String marca = scanner.nextLine(); // Lê a marca do console
        System.out.print("Digite o modelo: "); // Solicita ao usuário o modelo do veículo
        String modelo = scanner.nextLine(); // Lê o modelo do console
        System.out.print("Digite o ano: "); // Solicita ao usuário o ano do veículo
        int ano = Integer.parseInt(scanner.nextLine()); // Lê o ano como uma string e converte para inteiro

        veiculos.add(new Veiculo(chassi, placa, marca, modelo, ano)); // Adiciona um novo Veiculo à lista com as informações lidas
        System.out.println("Veículo cadastrado com sucesso!\n"); // Informa ao usuário que o veículo foi cadastrado com sucesso
    }

    public static void exibirVeiculos() {
        if (veiculos.isEmpty()) { // Verifica se a lista de veículos está vazia
            System.out.println("Nenhum veículo cadastrado."); // Informa que nenhum veículo está cadastrado se a lista estiver vazia
        } else {
            System.out.println("Lista de Veículos Cadastrados:"); // Cabeçalho para a lista de veículos cadastrados
            for (Veiculo v : veiculos) { // Itera sobre cada veículo na lista
                System.out.println(v); // Imprime as informações de cada veículo usando o método toString
            }
        }
        System.out.println(); // Imprime uma linha em branco para separação visual
    }

    public static void pesquisarVeiculo() {
        System.out.print("Digite o chassi ou a placa para pesquisa: "); // Pede ao usuário para digitar chassi ou placa para busca
        String entrada = scanner.nextLine(); // Lê a entrada do usuário
        for (Veiculo v : veiculos) { // Itera sobre a lista de veículos
            if (v.getNumeroChassi().equals(entrada) || v.getPlaca().equals(entrada)) { // Verifica se o chassi ou a placa correspondem à entrada
                System.out.println("Veículo encontrado: " + v); // Exibe o veículo encontrado
                return; // Sai do método se um veículo é encontrado
            }
        }
        System.out.println("Veículo não encontrado."); // Informa que nenhum veículo foi encontrado caso a busca não tenha sucesso
    }

    public static void main(String[] args) {
        boolean sair = false; // Inicializa a variável de controle para o loop do menu
        while (!sair) { // Mantém o menu executando até que o usuário decida sair
            System.out.println("1. Cadastrar Veículo");
            System.out.println("2. Exibir Veículos");
            System.out.println("3. Pesquisar Veículo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: "); // Exibe as opções do menu
            int opcao = Integer.parseInt(scanner.nextLine()); // Lê a opção escolhida pelo usuário

            switch (opcao) { // Processa a opção escolhida
                case 1:
                    adicionarVeiculo(); // Chama o método para adicionar um veículo
                    break;
                case 2:
                    exibirVeiculos(); // Chama o método para exibir todos os veículos cadastrados
                    break;
                case 3:
                    pesquisarVeiculo(); // Chama o método para pesquisar um veículo por chassi ou placa
                    break;
                case 4:
                    System.out.println("Saindo do sistema..."); // Mensagem de despedida
                    sair = true; // Altera a variável para finalizar o loop
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente."); // Trata uma entrada inválida no menu
                    break;
            }
        }
    }
}