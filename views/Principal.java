package views;

import utils.Console;

public class Principal {

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("\n\n --- ESTACIONAMENTO -- \n");
            System.out.println("1- Cadastrar automóvel: ");
            System.out.println("2- Entrada do automóvel: ");
            System.out.println("3- Saída do automóvel: ");
            System.out.println("4- Listar carros: ");
            System.out.println("5- Listar motos: ");
            System.out.println("0- Sair");
            opcao = Console.readInt("Digite a opção desejada: ");

            switch (opcao) {
                case 1:
                    CadastrarAutomovel cadastrarAutomovel = new CadastrarAutomovel();
                    cadastrarAutomovel.cadastrar();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    ListarCarro listarCarro = new ListarCarro();
                    listarCarro.compilar();
                    break;
                case 5:
                    ListarMoto listarMoto = new ListarMoto();
                    listarMoto.compilar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\n -- ERROR -- \n");
                    break;
            }
        } while (opcao != 0);

    }

}
