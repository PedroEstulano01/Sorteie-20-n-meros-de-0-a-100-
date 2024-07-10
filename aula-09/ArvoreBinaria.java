import java.util.ArrayList;
import java.util.List;

public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public No busca_raiz() {
        return this.raiz;
    }

    public void inserir_raiz(int num) {
        this.raiz = insere_no(this.raiz, num);
    }

    public void remover_no(int num) {
        this.raiz = finaliza_remover(this.raiz, num);
    }

    public No insere_no(No no, int num) {
        if (no != null) {
            if (num < no.get_numeroNo()) {
                no.insere_esquerda(insere_no(no.get_esquerda(), num));
            } else if (num > no.get_numeroNo()) {
                no.insere_direita(insere_no(no.get_direita(), num));
            }
            return no;
        }
        return new No(num);
    }

    public No minVal(No no) {
        No temp = no;
        while (temp.get_esquerda() != null) {
            temp = temp.get_esquerda();
        }
        return temp;
    }

    public No finaliza_remover(No no, int num) {
        if (no != null) {
            if (num < no.get_numeroNo()) {
                no.insere_esquerda(finaliza_remover(no.get_esquerda(), num));
            } else if (num > no.get_numeroNo()) {
                no.insere_direita(finaliza_remover(no.get_direita(), num));
            } else {
                if (no.get_esquerda() == null) {
                    No temp = no.get_direita();
                    no = null;
                    return temp;
                } else if (no.get_direita() == null) {
                    No temp = no.get_esquerda();
                    no = null;
                    return temp;
                }
                No temp = minVal(no.get_direita());
                no.insere_numeroNo(temp.get_numeroNo());
                no.insere_direita(finaliza_remover(no.get_direita(), temp.get_numeroNo()));
            }
        }
        return no;
    }

    public void pre_ordem(No no) {
        if (no != null) {
            System.out.print(" - " + no.get_numeroNo());
            pre_ordem(no.get_esquerda());
            pre_ordem(no.get_direita());
        }
    }

    public void in_ordem(No no) {
        if (no != null) {
            in_ordem(no.get_esquerda());
            System.out.print(" - " + no.get_numeroNo());
            in_ordem(no.get_direita());
        }
    }

    public void pos_ordem(No no) {
        if (no != null) {
            pos_ordem(no.get_esquerda());
            pos_ordem(no.get_direita());
            System.out.print(" - " + no.get_numeroNo());
        }
    }

    public void em_nivel(No raiz) {
        if (raiz == null) {
            return;
        }

        List<No> lista = new ArrayList<>();
        lista.add(raiz);

        while (!lista.isEmpty()) {
            No no = lista.remove(0);
            System.out.print(" - " + no.get_numeroNo());

            if (no.get_esquerda() != null) {
                lista.add(no.get_esquerda());
            }

            if (no.get_direita() != null) {
                lista.add(no.get_direita());
            }
        }
    }

}
