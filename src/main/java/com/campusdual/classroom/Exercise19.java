package com.campusdual.classroom;

public class Exercise19 {

   private static String getTridimensionalString(int[][][] intArrayTri, int[][] flatMatrix) {

        int rows = intArrayTri[0].length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            sb.append(stringFlatMatrixRow(flatMatrix, i));
            sb.append("   →   ");
            sb.append(stringTriMatrixRow(intArrayTri, i));
            sb.append("\n");
        }
        sb.delete(sb.length()-1, sb.length());
        return sb.toString();

    }

    private static String stringTriMatrixRow(int[][][] intArrayTri, int row) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intArrayTri.length-1; i++){
            sb.append(getUnidimensionalString(intArrayTri[i][row]));
            sb.append("   ");
        }
        sb.append(getUnidimensionalString(intArrayTri[intArrayTri.length-1][row]));

        return sb.toString();
    }

    private static String stringFlatMatrixRow(int[][] flatMatrix, int row) {
        return getUnidimensionalString(flatMatrix[row]);
    }


    public static String getTridimensionalString(int[][][] intArrayTri) {
        int[][] flatMatrix = flatTridimensionalArray(intArrayTri);

        return getTridimensionalString(intArrayTri, flatMatrix);
    }

    //TODO
    public static int[][] flatTridimensionalArray(int[][][] intArrayTri) {
        int[][] bidimensional = new int[intArrayTri[0].length][intArrayTri[0][0].length];
        //FILAS - COLUMNAS
          // intArrayTri[0].length--> Miro la longitud(Nº filas) En la Depth 0
        for(int j=0;j< intArrayTri[0].length;j++){//recorriendo todas las posiciones de las filas(j)
           for(int k=0;k< intArrayTri[0][j].length;k++){
               for(int i=0; i< intArrayTri.length;i++){

                   bidimensional[j][k] = bidimensional[j][k] + intArrayTri[i][j][k];
               }
           }
        }


       return bidimensional;
    }


    // TODO

    public static String getBidimensionalString(int[][] intArrayBi) {
        String value="";
        /*for (int i=0; i<intArrayBi.length;i++){
            for(int j= 0; j<intArrayBi.length;j++){
                if((i!=0 && j!=2) || (i!=1 && j!=2) || (i!=2 && j!=2) ){
                value=value+intArrayBi[i][j] + " ";
            }else if(i==intArrayBi.length-1 && j == intArrayBi.length-1){
                    value=value+intArrayBi[i][j];
                }else{
             value=value+intArrayBi[i][j] + "\n";
                }
            }
        }*/
        for(int i=0;i< intArrayBi.length;i++){
            for (int j=0; j< intArrayBi[i].length;j++){
                value= value + intArrayBi[i][j]+ " ";
            }
            value += "\n";
        }

        return value;
    }

    // TODO

    public static String getUnidimensionalString(int[] uniArray) {
                //String [] newArrayString = {"1","2","3","4","5"};
        String value="";
        for (int i=0; i<uniArray.length;i++){
            if(i!=uniArray.length-1){
                //--> lo cuenta desde cero--> (0,1,2,3,4)
                // -->cuando esté en la i=4 --> ultima posicion--> quitar el espacio
                value=value+uniArray[i]+" ";
            }else {
                value=value+uniArray[i]+"";
            }
        }
        return value;
    }


    // TODO
    public static int[] createAndPopulateUnidimensionalArray(int columns) {
    int [] firstIntArray = new int[columns];
        int value=0;
                //posiciones: (0,1,2,3,4)= 5 posiciones
        //ASIGNAR VALORES A LOS INDICADORES
        for(int i=0;i<firstIntArray.length;i++){
            value++;
            firstIntArray[i]=value;
        }

        //IMPRIMIR ARRAYS EN HORIZONTAL sout.print
       /* for (int i = 0; i < firstIntArray.length;i++){

            System.out.print(firstIntArray[i]+" ");
        }
        System.out.println();*/
        return firstIntArray;
    }

    // TODO



    public static int[][] createAndPopulateBidimensionalArray(int rows, int columns) {

       int [][] ejemplo = new int [rows][columns];
        int value = 0;
        //ASIGNAR VALORES
        for (int i=0; i < rows;i++) {
            for (int j=0; j<columns;j++){
                value++;
                ejemplo[i][j]=value;
            }
        }
        //MOSTRAR LOS VALORES DEL ARRAY
        /*for (int i=0; i < rows;i++) {
            for (int j=0; j<columns;j++){
                System.out.print(ejemplo[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n");*/
        return ejemplo;
    }

    // TODO
    public static int[][][] createAndPopulateTridimensionalArray
    (int depth, int rows, int columns) {
        int [][][] ejemplo2 = new int [depth][rows][columns];
        int value=0;
        for(int i=0;i<depth;i++){
            for (int j=0;j<rows;j++){
                for(int k=0;k<columns;k++){
                    value++;
                    ejemplo2[i][j][k]=value;
                }
            }
        }
         //IMPRIMIR LOS VALORES
        /*for(int i=0;i<depth;i++) {
            for (int j = 0; j < rows; j++) {
                for (int n = 0; n < columns; n++) {
                    System.out.print(ejemplo2[i][j][n]+"  ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("\n");*/
        return ejemplo2;
   }


    public static void main(String[] args) {
        System.out.println("Crear e imprimir el array unidimensional: ");
        // Crear array
       int[] uniArray = createAndPopulateUnidimensionalArray(2);
        // Mistrarlo por pantalla
        System.out.println(getUnidimensionalString(uniArray));
        System.out.println("=================================");

        System.out.println("Crear e imprimir el array bidimensional: ");

        int[][] intArrayBi = createAndPopulateBidimensionalArray(3, 4);
        System.out.println(getBidimensionalString(intArrayBi));

       System.out.println("=================================");
       /* //matriz 2x2
        int[][] intArrayBi = createAndPopulateBidimensionalArray(2, 2);
        System.out.println("===================================");

        */
        int[][][] marceloArrayTri = createAndPopulateTridimensionalArray(3,3,3);
        System.out.println(getTridimensionalString(marceloArrayTri));

           System.out.println("===================");
        /*int[][] intArrayBi = createAndPopulateBidimensionalArray(5, 5);
        System.out.println(getBidimensionalString(intArrayBi));
        System.out.println("===================");
        int[][][] intArrayTri = createAndPopulateTridimensionalArray(3, 3, 3);
        System.out.println(getTridimensionalString(intArrayTri));
        */
    }
}
