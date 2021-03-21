package hackerRank.ms;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class testThree {
    public static void main(String[] args)throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File("C:/VishnuJ/test-projects/testout.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));



        int result = minimumTime(Arrays.asList(2,1,5,3,1), 17);

        System.out.println(result);
    }

    public static int minimumTime(List<Integer> ability, long processes) {
        // Write your code here
        int count =0;
        Integer t = Integer.parseInt(processes+"");
        //List<Long> temp = ability.stream().mapToLong(i->Long.parseLong(i+"")).collect(Collectors.toList());

        while (processes>0){
            if(ability.contains(t)){
                 count++;
                 processes =0;
                 break;
            }else {
                Integer max = ability.stream().max((o1, o2) -> o1.compareTo(o2)).get();
                int index = ability.indexOf(max);

                if(max>processes){
                     count++;
                    processes =0;
                     break;
                }else{
                  processes = processes-max;
                  max = max/2;
                  ability.set(index,max);
                  count++;
                  continue;
                }
            }
        }


     return  count;
    }
}
