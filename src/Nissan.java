public class Nissan<N> {
    public N value;

    public void add(N value){
        this.value = value;
    }

    public N getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Nissan{" +
                "value=" + value +
                '}';
    }
}
