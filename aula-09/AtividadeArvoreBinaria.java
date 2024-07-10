import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AtividadeArvoreBinaria {

    public static void main(String[] args) {
        int qtd = 20;
        int intervalo = 100;
        Random escolhe_num = new Random();
        List<Integer> lista = new ArrayList<>();
        List<Integer> numExclusao = new ArrayList<>();
        ArvoreBinaria arv = new ArvoreBinaria();


        System.out.println("Inserindo dados");
        for(int x = 0; x < qtd; x++){
            int num = escolhe_num.nextInt(intervalo + 1);
            arv.inserir_raiz(num);
            lista.add(num);
        }

        System.out.println("-numeros Escolhidos: " + lista);
        System.out.println();

        System.out.println("Imprimir PreOrdem");
        arv.pre_ordem(arv.busca_raiz());
        System.out.print("\n\n");

        System.out.println("Imprimir inOrdem");
        arv.in_ordem(arv.busca_raiz());
        System.out.print("\n\n");

        System.out.println("Imprimir PosOrdem");
        arv.pos_ordem(arv.busca_raiz());
        System.out.print("\n\n");

        System.out.println("Imprimir em Nivel");
        arv.em_nivel(arv.busca_raiz());
        System.out.print("\n\n");


        System.out.println("- Exluir numeros");
        for (int i = 0; i < 5; i++) {
            int indiceAleatorio = escolhe_num.nextInt(lista.size());
            arv.remover_no(lista.get(indiceAleatorio));
            numExclusao.add(lista.get(indiceAleatorio));
            lista.remove(indiceAleatorio);
        }
        System.out.println("numeros Escolhidos: " + lista);
        System.out.println("numeros Excluidos: " + numExclusao);
        System.out.println();

        System.out.println("Imprimir PreOrdem");
        arv.pre_ordem(arv.busca_raiz());
        System.out.print("\n\n");

        System.out.println("Imprimir inOrdem");
        arv.in_ordem(arv.busca_raiz());
        System.out.print("\n\n");

        System.out.println("Imprimir PosOrdem");
        arv.pos_ordem(arv.busca_raiz());
        System.out.print("\n\n");

        System.out.println("Imprimir em Nivel");
        arv.em_nivel(arv.busca_raiz());
        System.out.print("\n\n");
    }
}