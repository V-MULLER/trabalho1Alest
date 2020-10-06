import java.util.ArrayList;

//LISTA COM CADA NODO SENDO UMA RUA DIFERENTE

public class StreetList {

    public StreetList() {
        header = new Node(null);
        trailer = new Node(null);
        header.next = trailer;
        trailer.prev = header;
        count = 0;
    }

    private class Node {
        public Node next;
        public Node prev;
        public String nomeLogradouro;
        public LinkedListOfAcidente listaAcidentes;
        public Node(LinkedListOfAcidente e) {
            listaAcidentes = e;
            next = null;
            prev = null;
        }
    }

    private Node header;
    private Node trailer;
    private int count;
    private Node current;


    public void resetNext() {
        current = header.next;
    }

    public LinkedListOfAcidente next() { //O(1)
        if (current !=trailer) {
            LinkedListOfAcidente rua = current.listaAcidentes;
            current = current.next;
            return rua;
        }
        return null;
    }

    public void resetPrev() {
        current = trailer.prev;
    }

    public LinkedListOfAcidente prev() { //O(1)
        if (current !=header) {
            LinkedListOfAcidente rua = current.listaAcidentes;
            current = current.prev;
            return rua;
        }
        return null;
    }



    public String pesquisaLogradouro(){
        //consulta da rua/av/trav que tem mais acidentes
        //ve o nodo StreetList que tem maior tamanho
        return "";
    }

    public String pesquisaDiaSemana(String logradouro) {
        //entra um nome de uma rua, pesquisa no Linked... qual o dia da semana que ocorreu mais acidentes
        return "";
    }

    public int qtdAcidenteMoto(){
        //pega o numero de acidentes de moto em cada rua
        return 0;
    }

    public void add(LinkedListOfAcidente rua) {
        // Primeiro instanciamos um nodo para guardar o elemento
        Node n = new Node(rua);
        // Fazer o correto encadeamento
        n.next = trailer; // Primeiro "gruda" o novo nodo na lista
        n.prev = trailer.prev;
        // Depois atualiza os nodos da lista, para que apontem para o novo nodo
        n.prev.next = n;
        trailer.prev = n;
        // Atualiza o contador
        count++;
    }
}
