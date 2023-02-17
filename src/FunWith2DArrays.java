public class FunWith2DArrays {

    public static int totalElements(int[][] list) {
        int total = 0;
        for(int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                total++;
            }
        }
        return total;
    }

    public static void fourCorners(String[][] list) {
        String one = "";
        String two = "";
        String three = "";
        String four = "";
        for (int j = 0; j < list.length; j++) {
            one = list[0][0];
            two = list[0][list[j].length - 1];
            three = list[list.length - 1][0];
            four = list[list.length - 1][list[j].length - 1];
        }
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
    }

    public static void swapFrontAndBackRows(String[][] list) {
        String[] temp = list[list.length-1];
        list[list.length-1] = list[0];
        list[0] = temp;
    }

    public static void asciiPrinter(String[][] ascii) {
        for(String[] rows : ascii) {
            for(String col: rows) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static double average(int[][] arr) {
        double aver = 0;
        int count = 0;
        for(int[] rows : arr) {
            for(int col: rows) {
                aver += col;
                count++;
            }
        }
        return aver/count;
    }

    public static int[] indexFound(String[][] arr, String target ) {
        int[] none = {-1, -1};
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col].equals(target)) {
                    return new int[]{row, col};
                }
            }
        }
        return none;
    }

    public static int[][] split(int[][] arr, int rowTarget, int colTarget) {
        int[][] answer = new int[rowTarget + 1][colTarget + 1];
        try {
            for (int row = 0; row <= rowTarget; row++) {
                for (int col = 0; col <= colTarget; col++) {
                    answer[row][col] += arr[row][col];
                }
            }
            return answer;
        } catch (IndexOutOfBoundsException e) {
            return new int[0][0];
        }
    }

    public static int[][] invert(int[][] arr) {
        int[][] inverted = new int[arr[0].length][arr.length];
        for(int col = 0; col < arr[0].length; col++) {
            for (int rows = 0; rows < arr.length; rows++) {
               inverted[col][rows] += arr[rows][col];
            }
        }
        return inverted;
    }
}
