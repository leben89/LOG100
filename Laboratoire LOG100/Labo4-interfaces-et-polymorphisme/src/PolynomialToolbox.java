import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class PolynomialToolbox {

    public static Polynomial simplify(Polynomial poly) {

        // Utilisation d'une map pour stocker les termes simplifiés
        Map<String, Term> termMap = new HashMap<>();

        for (Term term : poly.getAllTerms()) {
            if (term.getCoefficient() == 0) {
                // Ignorer les termes avec un coefficient zéro
                continue;
            }


            String key = term.getVariable() + "^" + term.getExponent();
            if (termMap.containsKey(key)) {
                // Si la clé existe, additionner les coefficients
                Term existingTerm = termMap.get(key);
                double newCoefficient = existingTerm.getCoefficient() + term.getCoefficient();

                if (newCoefficient != 0) {
                    termMap.put(key, new Term(newCoefficient, term.getVariable(), term.getExponent()));
                } else {
                    // Retirer le terme si le coefficient devient zéro
                    termMap.remove(key);
                }
            } else {
                // Si la clé n'existe pas, ajouter le terme à la map
                termMap.put(key, term);
            }
        }

        // Créer un nouveau polynôme simplifié
        Polynomial simplifiedPoly = new LLPolynomial();
        for (Term term : termMap.values()) {
            simplifiedPoly.addTerm(term);
        }

        return simplifiedPoly;
    }

    public static Polynomial sum(Polynomial poly1, Polynomial poly2) {
        Polynomial sumPoly = new LLPolynomial();

        for(Term term : poly1.getAllTerms()){
            sumPoly.addTerm(term);
        }
        for(Term term : poly2.getAllTerms()){
            sumPoly.addTerm(term);
        }
        return simplify(sumPoly);
    }


    public static void main(String[] args) {
        Polynomial poly1 = new LLPolynomial();
        poly1.addTerm(new Term(12d, 'x', 2));
        poly1.addTerm(new Term(4d, 'x', 1));
        poly1.addTerm(new Term(5d, ' ', 0));
        poly1.addTerm(new Term(7d, 'z', 2));
        poly1.addTerm(new Term(4d, 'z', 5));

        ((LLPolynomial) poly1).sort();
        System.out.println("Sorted Polynomial 1: " + poly1);

        Polynomial poly2 = new LLPolynomial();
        poly2.addTerm(new Term(3d, 'x', 2));
        poly2.addTerm(new Term(4d, 'x', 1));
        poly2.addTerm(new Term(8d, ' ', 0));
        poly2.addTerm(new Term(-2d, 'y', 3));
        poly2.addTerm(new Term(7d, 'z', 2));
        poly2.addTerm(new Term(4d, 'z', 5));
        poly2.addTerm(new Term(-3d, 'y', 3));
        poly2.addTerm(new Term(9d, 'x', 2));
        poly2.addTerm(new Term(5d, 'y', 3));
        poly2.addTerm(new Term(-3d, ' ', 0));

        ((LLPolynomial) poly2).sort();
        System.out.println("Sorted Polynomial 2: " + poly2);
    }

}

