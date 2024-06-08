import java.util.Comparator;

public class TermComparator implements Comparator<Term> {

    public int compare(Term t1, Term t2){

        // Comparaison des noms des variables
        char var1 = t1.getVariable();
        char var2 = t2.getVariable();

        if(var1 == ' ' && var2 != ' '){
            return 1;
        }else if(var1 != ' ' && var2 == ' '){
            return -1;
        }else if(var1 != var2){
            return Character.compare(var1, var2);
        }
        // Comparaison des exposants (ordre décroissant)
        int exp1 = t1.getExponent();
        int exp2 = t2.getExponent();
        return Integer.compare(exp2, exp1);
    }

}
