public class Fiat<F>{
    public F value;

    public void add(F value){
        this.value = value;
    }

    public F getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Fiat{" +
                "value=" + value +
                '}';
    }
}
