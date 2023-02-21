public class Mitsubishi<M> {
    public M value;

    public void add(M value){
        this.value = value;
    }

    public M getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Mitsubishi{" +
                "value=" + value +
                '}';
    }
}
