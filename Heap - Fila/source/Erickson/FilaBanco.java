

import java.util.Arrays;

public class FilaBanco implements Carry{

    public Pessoa[] pessoas;
    private int size;//Tamanho
    private int capacity; //Tamanho do tamanho

    public FilaBanco() {
        this(10);
    }

    public FilaBanco(int capacity){
        pessoas = new Pessoa[capacity];
        size = 0;
        this.capacity = capacity;
    }

    public void addPessoa(String nome, int idade) {
        Pessoa p = new Pessoa(nome, idade);
        addPessoa(p);
    }

    public void addPessoa(Pessoa pessoa) {
        pessoa.addCarry(this);
        this.ensureCapacity();
        this.pessoas[getSize()] = pessoa;
        heapifyUp(getSize());
        size++;

    }

    private void heapifyUp(int index){
        if(!hasParent(index)){
            return;
        }
        int parentIndex = getParentIndex(index);
        Pessoa node = pessoas[index];
        Pessoa pai = pessoas[parentIndex];

        if(node.getIdade() > pai.getIdade()){
            pessoas[index] = pai;
            pessoas[parentIndex] = node;
            heapifyUp(parentIndex);
        }
    }

    private boolean hasParent(int index){
        return getParentIndex(index) >= 0 && getParentIndex(index) < size;
    }

    private int getParentIndex(int index) {
        return (int) Math.floor((index-1) / 2);
    }

    private void ensureCapacity() {
        if(getSize() == capacity){
            this.pessoas = Arrays.copyOf(this.pessoas, getSize()*2);
            capacity = getSize() * 2;
        }
    }

    public Pessoa peek() {
        if(getSize() == 0){
            return null;
        }
        return pessoas[0];
    }

    public void remove() {
        pessoas[0] = pessoas[size-1];
        pessoas[getSize() - 1].removeListener(this);
        pessoas[getSize() - 1] = null;
        size--;
        heapifyDown(0);
    }

    private void heapifyDown(int index) {
        int leftChild = index*2 + 1;
        int rightChild = index *2 + 2;

        int childIndex = -1;
        if(leftChild < getSize()){
              childIndex = leftChild;
        }

        if(childIndex < 0){
            return;
        }

        if(rightChild <  getSize()){
            if(pessoas[rightChild].getIdade() > pessoas[leftChild].getIdade()){
                childIndex = rightChild;
            }
        }

        if(pessoas[index].getIdade() < pessoas[childIndex].getIdade()) {
            Pessoa tmp = pessoas[index];
            pessoas[index] = pessoas[childIndex];
            pessoas[childIndex] = tmp;
            heapifyDown(childIndex);
        }
    }

/
    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override // Dando Override equivocadamente
    public void notifyEvent(Pessoa p, int oldAge) {
        int index = -1;
        for(int i = 0 ; i < getSize() ; i++){
            if(p.getNome() == pessoas[i].getNome()){
                index = i;
                break;
            }
        }
        if(p.getIdade() > oldAge){
            heapifyUp(index);
        }else{
            heapifyDown(index);
        }

    }
}
