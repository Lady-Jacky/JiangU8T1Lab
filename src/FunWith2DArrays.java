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
}
