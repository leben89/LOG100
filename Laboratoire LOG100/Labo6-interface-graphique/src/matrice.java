public class matrice {
    public static int[][] multiply(int[][] a, int[][] b) {
        // Vérifier si les matrices peuvent être multipliées

        // Trouver le minimum entre la longueur du tableau A et du tableau B pour les rangées
        int row = Math.min(a.length,b.length);

        // Trouver le minimum entre la longueur du tableau A et du tableau B pour les colonnes
        int col = Math.min(a[0].length, b[0].length);

        // Définir un tableau de la taille des valeurs trouvées précédemment
        int[][] tab = new int [row][col];

        for(int i=0 ; i<row; i++){
            for(int j=0; j<col; j++) {
                tab[i][j] += a[i][j] * b[i][j];
            }
        }
        return tab;


    }

    public static void main(String[] args) {
        // Exemple d'utilisation
        int[][] A = {{2, 3}, {4, 5}};
        int[][] B = {{6, 7, 2}, {8, 9, 1}};

        int[][] result = multiply(A, B);

        // Afficher la matrice résultante
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

}
