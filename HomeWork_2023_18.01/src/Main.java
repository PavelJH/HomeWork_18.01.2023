public class Main {
    //TODO
// Task2: Создать многомерный массив 10 x 10. Заполнить его  числами jn 0 до 100
// и вывести в консоль таким образом, как это указанно ниже.
    //0 1 2 3 4 5 6 7 8 9
    //10 11 12 13 14 15 16 17 18 19
    //20 21 22 23 24 25 26 27 28 29
    //30 31 32 33 34 35 36 37 38 39
    //40 41 42 43 44 45 46 47 48 49
    //50 51 52 53 54 55 56 57 58 59
    //60 61 62 63 64 65 66 67 68 69
    //70 71 72 73 74 75 76 77 78 79
    //80 81 82 83 84 85 86 87 88 89
    //90 91 92 93 94 95 96 97 98 99
    public static void main(String[] args) {
        String[][] matrice = new String[10][10];

        for (int i = 0; i < matrice.length; i++) { //
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = "#";
            }
        }
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if((i == 0 || i == matrice.length - 1) || (j == 0 || j == matrice[i].length - 1)){
                    System.out.print(matrice[i][j] + " ");
                }else{
                    System.out.print("__");// поставил дефисы, что бы понять как работает. Если всемто низ поставить два пробела, то будет то, что ты задавал.
                }


            }
            System.out.println();
        }

        int [][] matrixNumber = new int[10][10];
        for (int i = 0; i < matrixNumber.length; i++) {
            for (int j = 0; j < matrixNumber[i].length; j++) {
                matrixNumber[i][j] = i * 10 + j;
            }


        }
        for (int i = 0; i < matrixNumber.length; i++) {
            for (int j = 0; j < matrixNumber[i].length; j++) {
                System.out.print(matrixNumber[i][j] + " ");
            }
            System.out.println(" ");

        }
        // Пример симметричного массива.
        int[][] array1 = {
                {2, 3, 5, 10, 11},
                {3, 2, 4,  6, 9},
                {5, 4, 2,  7, 12},
                {10, 6, 7, 2,  8},
                {11, 9, 12, 8, 2}};
        //  Пример несимметричного массива.
        int[][] array2 = {
                {2, 3, 5, 10, 222},
                {3, 2, 4,  6, 9},
                {5, 4, 2,  7, 12},
                {10, 6, 7, 2,  8},
                {11, 9, 12, 8, 2}};

        System.out.println(isSemetrik(array1));
        System.out.println(isSemetrik(array2));
    }
    public static boolean isSemetrik(int [][] sema){
        for (int i = 0; i < sema.length; i++) {
            for (int j = 0; j < sema[i].length; j++) {
                if(sema [i][j] != sema [j][i]){
                    return false;
                }
                }
            }
        return true;
        }
    }


