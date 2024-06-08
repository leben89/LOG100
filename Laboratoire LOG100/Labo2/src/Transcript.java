public class Transcript {

    public static String getReport(Grade[] grades) {
        StringBuilder report= new StringBuilder();
        float total=0F;
        float moyenne=0F;
        //convertir tout les elements du tableau en String
        //append -> ajoute dans le string report
        for( int i =0; i<grades.length; i++){
            //ajouter la valeur convertie en String de la valeur a la position i  et un saut de ligne
            //dans le string report
            report.append(grades[i].convertToString()).append("\n");
            //ajouter la valeur de pourcent a la position i dans total
            total+=grades[i].getPercent();
        }
        //calculer la moyenne
        moyenne=total/grades.length;
        report.append("Mean = ").append(moyenne);



        return report.toString();
    }

    public static String getReport(Grade[] grades, String department) {
        StringBuilder report= new StringBuilder();
        float total = 0F;
        float moyenne = 0F;
        int count=0;
        //s'assurer que l'element appartient au departement specifique
        for(int i=0; i<grades.length; i++){
            if(grades[i].getDepartment().equals(department))
            {
                //convertir tout les elements du tableau en String
                report.append(grades[i].convertToString()).append("\n");
                total+=grades[i].getPercent();
                count++;
            }
        }
        //calculer la moyenne
        moyenne=total/count;
        report.append("Mean = ").append(moyenne);


        return report.toString();

    }

    public static void main (String[] args){

        //similaire a l'exercice dans Grade a la place on cree les valeurs dans un tableau de Grade
        Grade[] myGrades = new Grade[]{
                new Grade("LOG", 100, 'A'),
                new Grade("GTI", 121, 68.5F ),
                new Grade("LOG", 121),
                new Grade("LOG", 320, 'B'),
                new Grade("MAT", 144, 57F),
                new Grade("MAT", 210, 'E'),
                new Grade("MAT", 350, 74.99F)
        };
        System.out.println( getReport(myGrades));
        System.out.println ( );
        System.out.println (getReport(myGrades, "LOG") );
        System.out.println ( );
        System.out.println (getReport(myGrades, "MAT") );
        System.out.println ( );
        System.out.println (Grade.getInstanceCount() );
    }
}

