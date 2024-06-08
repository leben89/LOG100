import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Comparator;

public class LLPolynomial implements Polynomial {
    private LinkedList <Term> terms;

    public LLPolynomial(){
        terms = new LinkedList<>();
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
//a modifier

    public List<Character> getVariables(){

        List<Character> variableSet = new ArrayList<>();
        for(Term term : terms){
            char variable = term.getVariable();
            if(!variableSet.contains(variable))
            {
                variableSet.add(variable);
            }

        }
        return variableSet;

    }
    public List<Integer> getExponents(){

        List<Integer> exponentSet = new ArrayList<>();
        for(Term term : terms){
            int exponent = term.getExponent();

            if(!exponentSet.contains(exponent))
            {
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
        return terms;
    }

    public void sort(){
        Collections.sort(terms, new TermComparator());
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<terms.size(); i++){
            //on ajoute la valeur dans le sb
            sb.append(terms);
            //on vérifie si ce n'est pas le dernier élément de la liste
            if(terms.get(i) != terms.getLast()){
                //on vérifie si le coefficient du prochain élément est positif
                if(terms.get(i+1).getCoefficient()>0){
                    //s'ìl est possitif on ajoute un + avant d'ajouter la valeur dans le sb
                    sb.append("+");
                }
                //s'il est négatif on ajoute rien avant d'ajouter la valeur dans le sb

            }

        }
        return sb.toString();
    }

}
