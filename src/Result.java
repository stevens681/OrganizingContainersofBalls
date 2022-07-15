import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Result {
    /*
     * Complete the 'organizingContainers' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts 2D_INTEGER_ARRAY container as parameter.
     */

    public static String organizingContainers(List<List<Integer>> container) {
        // Write your code here
        HashSet<Integer> set = new HashSet<>();

        for(int i = 1; i<container.size(); i++){
            int sumA = 0, sumB = 0;
            for (int j = 0; j< container.size(); j++){
                //System.out.println(j+""+i);
                System.out.println(container.get(j).get(i-1));


            }


        }
       // System.out.println(set);
        return "Impossible";

    }
    public static void main(String[] args) {

        String list = """
                0 2 1
                1 1 1
                2 0 0""";
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
