import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoOperaciones {
    public static Set<Object> union(Set<Object> a, Set<Object> b) {
        Set<Object> resultado = new HashSet<>(a);
        resultado.addAll(b);
        return resultado;
    }
    public static Set<Object> intersect(Set<Object> a, Set<Object> b) {
        Set<Object> resultado = new HashSet<>(a);
        resultado.retainAll(b);
        return resultado;
    }
    public static Set<Object> diff(Set<Object> a, Set<Object> b) {
        Set<Object> resultado = new HashSet<>(a);
        resultado.removeAll(b);
        return resultado;
    }
    public static boolean isSubset(Set<Object> a, Set<Object> b) {
        return a.containsAll(b);
    }
    public static Set<String> cartesiano(Set<Object> a, Set<Object> b) {
        Set<String> resultado = new HashSet<>();
        for (Object elementoA : a) {
            for (Object elementoB : b) {
                resultado.add("(" + elementoA + ", " + elementoB + ")");
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Set<Object> conjuntoA = new HashSet<>();
        Set<Object> conjuntoB = new HashSet<>();

        conjuntoA.add("a");
        conjuntoA.add("b");
        conjuntoA.add("c");

        conjuntoB.add("b");
        conjuntoB.add("c");
        conjuntoB.add("d");

        JFrame frame = new JFrame("Operaciones con Conjuntos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        panel.add(new JLabel("Union: " + union(conjuntoA, conjuntoB)));
        panel.add(new JLabel("Interseccion: " + intersect(conjuntoA, conjuntoB)));
        panel.add(new JLabel("Diferencia (A - B): " + diff(conjuntoA, conjuntoB)));
        panel.add(new JLabel("Es subconjunto: " + isSubset(conjuntoA, conjuntoB)));
        panel.add(new JLabel("Producto cartesiano: " + cartesiano(conjuntoA, conjuntoB)));

        frame.add(panel);
        frame.setVisible(true);
    }
}