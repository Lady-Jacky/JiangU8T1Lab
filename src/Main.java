import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // TEST CODE FOR split
        System.out.println("-------test1--------");
        int[][] testArr6 = {{1, 2, 3}, {4, 5, 6}};
        int[][] t1 = FunWith2DArrays.split(testArr6, 1, 1);
        for (int[] row : t1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test2--------");
        int[][] testArr7 = {{10, 11, 12, 13}, {20, 21, 22, 23}, {30, 31, 32, 33}};
        int[][] t2 = FunWith2DArrays.split(testArr7, 2, 1);
        for (int[] row : t2) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test3--------");
        int[][] testArr8 = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24}
        };
        int[][] t3 = FunWith2DArrays.split(testArr8, 3, 2);
        for (int[] row : t3) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test4--------");
        int[][] t4 = FunWith2DArrays.split(testArr8, 2, 5);
        for (int[] row : t4) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test5--------");
        int[][] t8 = FunWith2DArrays.split(testArr8, 0, 4);
        for (int[] row : t8) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test6--------");
        int[][] t9 = FunWith2DArrays.split(testArr8, 0, 0);
        for (int[] row : t9) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test7--------");
        int[][] t5 = FunWith2DArrays.split(testArr8, 3, 5);
        for (int[] row : t5) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test8--------");
        int[][] t10 = FunWith2DArrays.split(testArr8, 3, 0);
        for (int[] row : t10) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test9--------");
        int[][] t6 = FunWith2DArrays.split(testArr8, 4, 2);
        for (int[] row : t6) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test10-------");
        int[][] t7 = FunWith2DArrays.split(testArr8, 2, 6);
        for (int[] row : t7) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }


}

