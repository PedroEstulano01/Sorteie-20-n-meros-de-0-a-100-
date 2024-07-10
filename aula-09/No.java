public class No {
    private int numero;
    private No ref_esquerda;
    private No ref_direita;
    
    public No(int no){
        this.numero = no;
        this.ref_esquerda = null;
        this.ref_direita = null;
    }

    public int get_numeroNo(){
        return this.numero;
    }

    public No get_esquerda(){
        return this.ref_esquerda;
    }

    public No get_direita(){
        return this.ref_direita;
    }

    public void insere_numeroNo(int numero){
        this.numero = numero;
    }

    public void insere_esquerda(No no){
        this.ref_esquerda = no;
    }

    public void insere_direita(No no){
        this.ref_direita = no;
    }
}
