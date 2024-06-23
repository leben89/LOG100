public final class Term {

    private final double coefficient;
    private final char variable;
    private final int exponent;

    public Term(double coefficient, char variable, int exponent)throws ZeroCoefficientException{
        if (coefficient==0){
            throw new ZeroCoefficientException();
        }
        this.coefficient = coefficient;
        this.variable = variable;
        this.exponent = exponent;
    }

    public double getCoefficient(){
        return coefficient;
    }
    public char getVariable(){
        return variable;
    }
    public int getExponent(){
        return exponent;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(coefficient);
        if(variable != ' '){
            sb.append(variable);
            if(exponent != 1){
                sb.append("^").append(exponent);
            }
        }
        return sb.toString();
    }

    public static void main (String[] args){
        Term t0 = new Term(3d, 'x', 2); //3x^2
        Term t1 = new Term(-2d, 'y', 3); //-2y^2
        Term t2 = new Term(3d, 'x', 2); // 4x
        Term t3 = new Term(8d, ' ', 0); // 8

        System.out.println(t0);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }

}

