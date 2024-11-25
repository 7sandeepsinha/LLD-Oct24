package javaAdvancedConcepts;

public class Pair<E,F>{
    private E key;
    private F value;


    public F value(){
        return value;
    }

    public E getKey() {
        return key;
    }

    public void setKey(E key) {
        this.key = key;
    }

    public F getValue() {
        return value;
    }

    public void setValue(F value) {
        this.value = value;
    }
}
