import java.util.*;

public class Result {
    /*
     * Complete the 'organizingContainers' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts 2D_INTEGER_ARRAY container as parameter.
     */

    public static String organizingContainers(List<List<Integer>> container) {
        // Write your code here
        String res;
        List<Integer> rowSum =new ArrayList<>();
        List<Integer> colSum =new ArrayList<>();

        for(int row = 0; row<container.size(); row++) {
            int sumR = 0, sumC = 0;
            for(int col = 0; col<container.get(row).size(); col++) {

                sumR += container.get(row).get(col);
                sumC += container.get(col).get(row);

            }
            rowSum.add(sumR);
            colSum.add(sumC);


        }
        Collections.sort(rowSum);
        Collections.sort(colSum);
        if(rowSum.equals(colSum))
            res = "Possible";
        else
            res ="Impossible";

        return res;

    }
    public static void main(String[] args) {

//        String list = """
//                0 0 5 0
//                4 0 0 0
//                0 2 0 1
//                0 1 0 2""";
        String list = """
                1 2 1 3
                2 1 3 1
                1 3 2 1
                3 2 1 1""";
        List<List<Integer>> arr = new ArrayList<>();

        String[] split = list.split("\n");

        for(int i = 0; i<list.split("\n").length; i++){

            String[] space = split[i].split("\\s");
            List<Integer> hold = new ArrayList<>();
            for (String s : space) {
                hold.add(Integer.parseInt(s));
            }
            if(!hold.isEmpty())
                arr.add(hold);

        }
        System.out.println(organizingContainers(arr));
    }
}
