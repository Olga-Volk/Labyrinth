package pet;

public class Labyrinth {
    int labyrinthSize = 5;

    public Labyrinth() {}
    public Labyrinth(int labyrinthSize) {
        this.labyrinthSize = labyrinthSize;
    }

    Element[][] generate(){
        int matrixSize = labyrinthSize * 2 + 1;
        Element[][] labyrinth = new Element[matrixSize][matrixSize];

        int i = 0;
        int k;
        while (i < matrixSize){
            k = 0;
            if ((i == 0)||(i == matrixSize-1)){
                while (k < matrixSize){
                    if (k % 2 == 0){
                        labyrinth[i][k] = Element.PLUS;
                    } else labyrinth[i][k] = Element.MINUS;
                    k++;
                }
            } else if (i % 2 == 0) {
                while (k < matrixSize){
                    if (k % 2 == 0){
                        labyrinth[i][k] = Element.PLUS;
                    } else labyrinth[i][k] = Element.EMPTY2;
                    k++;
                }
            } else {
                while (k < matrixSize){
                    if ((k == 0)||(k == matrixSize-1)) labyrinth[i][k] = Element.PIPE;
                    else if (k % 2 == 0){
                        labyrinth[i][k] = Element.EMPTY1;
                    }else labyrinth[i][k] = Element.EMPTY2;
                    k++;
                }
            }
            i++;
        }
        return labyrinth;
    }

    static void printLabyrinth(Element[][] labyrinth){
        for (Element[] element:labyrinth) {
            for (Element e :element) {
                System.out.print(e.getSymbol());
            }
            System.out.println();
        }
    }
}
