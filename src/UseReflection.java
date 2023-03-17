import java.lang.annotation.Annotation;

public class UseReflection implements TabelaUm {



    @Override
    public String nomeTabela() {
        return "Tabela Um";
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
