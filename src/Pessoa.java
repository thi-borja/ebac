import java.util.ArrayList;

public class Pessoa {

    private String nome;

    private String sexo;

    Pessoa(String n, String s){
        this.nome = n;
        this.sexo = s;
    }

    public static ArrayList<Pessoa> criarDez(){
        Pessoa p1 = new Pessoa("Naruto", "Masculino");
        Pessoa p2 = new Pessoa("Hinata", "Feminino");
        Pessoa p3 = new Pessoa("Sasuke", "Masculino");
        Pessoa p4 = new Pessoa("Itachi", "Masculino");
        Pessoa p5 = new Pessoa("Sakura", "Feminino");
        Pessoa p6 = new Pessoa("Jiraya", "Masculino");
        Pessoa p7 = new Pessoa("Neji", "Masculino");
        Pessoa p8 = new Pessoa("Temari", "Feminino");
        Pessoa p9 = new Pessoa("Tsunade", "Feminino");
        Pessoa p10 = new Pessoa("Kurenai", "Feminino");

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);
        pessoas.add(p6);
        pessoas.add(p7);
        pessoas.add(p8);
        pessoas.add(p9);
        pessoas.add(p10);

        return pessoas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nome + " - " + sexo;
    }

    public String testSexo() {
        return sexo;
    }
}
