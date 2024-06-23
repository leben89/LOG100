import java.util.Vector;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Comparator;

public class VectorPolynomial implements Polynomial{
    private Vector<Term> terms;

    public VectorPolynomial(){
        terms = new Vector<>();
    }
    public boolean addTerm(Term t){
        return terms.add(t);
    }
    public boolean removeTerm(Term t){
        return terms.remove(t);
    }
    public int getTermCount(){
        return terms.size();
    }

    public List<Character> getVariables(){
        List<Character> variableSet = new ArrayList<>();
        for(Term term : terms){
            char variable = term.getVariable();
            if(!variableSet.contains(variable)){
                variableSet.add(variable);
            }
        }
        return variableSet;

    }

    public List<Integer> getExponents(){
        List<Integer> exponentSet = new ArrayList<>();
        for(Term term : terms){
            int exponent = term.getExponent();
            if(!exponentSet.contains(exponent)){
                exponentSet.add(exponent);
            }
        }
        return exponentSet;
    }

    public List<Term> getTerms(char variable, int exponent){

        List<Term> matchingTerms = new ArrayList<>();
        for (Term term : terms) {
            if (term.getVariable() == variable && term.getExponent() == exponent) {
                matchingTerms.add(term);
            }
        }
        return matchingTerms;
    }
    public List<Term> getAllTerms(){
        return new ArrayList<>(terms);
    }
    public String toString() {
        if (terms.isEmpty()) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (Term term : terms) {
            if (sb.length() > 0 && term.getCoefficient() > 0) {
                sb.append("+");
            }
            sb.append(term);
        }
        return sb.toString();
    }

}
