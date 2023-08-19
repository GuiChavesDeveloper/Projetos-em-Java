import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> lista = new ArrayList<String>();
            boolean continuar = true;
            int opcao;

            while (continuar) {
                System.out.println("-----Lista de Compras-----");
                System.out.println("1-> Adicionar item.");
                System.out.println("2-> Remover item.");
                System.out.println("3-> Atualizar item.");
                System.out.println("4-> Mostrar Lista.");
                System.out.println("5-> Sair.");
                System.out.println("==========================");
                System.out.print("Escolha uma opção: ");

                opcao = scanner.nextInt();
                System.out.println();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        adicionarItem(scanner, lista);
                        break;
                    case 2:
                        removerItem(scanner, lista);
                        break;
                    case 3:
                        atualizarItem(scanner, lista);
                        break;
                    case 4:
                        mostrarLista(lista);
                        break;
                    case 5:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção Inválida. Tente novamente!");
                }
            }
            scanner.close();
        }
    }

    public static void adicionarItem(Scanner scanner, ArrayList<String> lista) {
        String item;
        System.out.print("Digite o item a ser adicionado: ");
        item = scanner.nextLine();
        lista.add(item);
        System.out.println("Item Adicionado!");
        System.out.println();
    }

    public static void removerItem(Scanner scanner, ArrayList<String> lista) {
        String itemRemovido;
        int numeroItem;
        System.out.print("Digite o item a ser removido: ");
        numeroItem = scanner.nextInt();
        System.out.println();
        if (numeroItem >= 1 && numeroItem <= lista.size()) {
            itemRemovido = lista.remove(numeroItem - 1);
            System.out.println("Item \"" + itemRemovido + "\" foi removido da lista.");
        } else {
            System.out.println("Número de item Inválido!");
        }
    }

    public static void atualizarItem(Scanner scanner, ArrayList<String> lista) {
        int numeroItem;
        System.out.print("Digite o item a ser alterado: ");
        numeroItem = scanner.nextInt();
        scanner.nextLine();
        if (numeroItem >= 1 && numeroItem <= lista.size()) {
            lista.remove(numeroItem - 1);
            System.out.print("Digite o novo item: ");
            lista.add(numeroItem - 1, scanner.nextLine());
        } else {
            System.out.println("Número de item Inválido!");
        }
    }

    public static void mostrarLista(ArrayList<String> lista) {
        System.out.println("---Lista de Compra---");
        if (lista.isEmpty()) {
            System.out.println("Lista de compras vazia.");
        } else {
            for (int contador = 0; contador < lista.size(); contador++) {
                System.out.println((contador + 1) + ". " + lista.get(contador));
            }
        }
        System.out.println("=======================");
        System.out.println();
    }
}
