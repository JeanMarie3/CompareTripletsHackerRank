import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> score = new ArrayList<>();

        int scoreAlice = 0;
        int scoreBob = 0;
        for (int i = 0; i < a.size(); i++){

            if(a.get(i) > b.get(i)){

                scoreAlice++;
            }

            else if(a.get(i) < b.get(i))
            {
                scoreBob++;
            }
        }
        
        score.add(scoreAlice);
        score.add(scoreBob);
        return score;


    }

}
