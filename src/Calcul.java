import java.util.Objects;

public class Calcul {
    public int first;
    public int second;

    public Calcul(int first, int second) {
        this.first = first;
        this.second = second;
    }
    public String toString() {
        return (first + " * " + second + " = ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calcul calcul = (Calcul) o;
        return first == calcul.first && second == calcul.second || second == calcul.first && first == calcul.second;
    }

    @Override
    public int hashCode() {
        return (first*second);
    }
}
