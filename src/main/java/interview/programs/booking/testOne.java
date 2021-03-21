package interview.programs.booking;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class testOne {

    public static List<List<Integer>> employeeWithLesserThanKBreaks(List<List<Integer>> employeeCalls, int k) {
        // Write your code here
        List<List<Integer>> empId =  new ArrayList<>();

        HashMap<Integer,List<List<Integer>>> map = new HashMap<>();
        for(List<Integer> emp : employeeCalls){
            if(map.containsKey(emp.get(0))){
                map.get(emp.get(0)).add(emp);
            }else{
                List<List<Integer>> t= new ArrayList<>();
                t.add(emp);
                map.put(emp.get(0),t);
            }
        }

        for (Map.Entry<Integer,List<List<Integer>>> ep:map.entrySet()) {
            int id = ep.getKey();
            List<List<Integer>> time = ep.getValue();
            List<Integer> empIdBrk = new ArrayList<>();

            Collections.sort(time,(o1, o2) -> o1.get(0).compareTo(o2.get(0)));
            int bk =0;
            for(int i=1;i< time.size() ; i++){
                if((time.get(i).get(2)-time.get(i-1).get(1))>0){
                   bk++;
                }
            }

            if(bk>0){
                bk = bk-1;
                if(bk>=k){}else {
                    empIdBrk.add(id);
                    empId.add(empIdBrk);
                }
            }
        }


       return empId;

    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File("C:/VishnuJ/test-projects/testout.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        int employeeCallsRows = Integer.parseInt(bufferedReader.readLine().trim());
        int employeeCallsColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> employeeCalls = new ArrayList<>();

        IntStream.range(0, employeeCallsRows).forEach(i -> {
            try {
                employeeCalls.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> result = employeeWithLesserThanKBreaks(employeeCalls, k);

        result.stream().forEach(System.out::println);

        result.stream()
                .map(
                        r -> r.stream()
                                .map(Object::toString)
                                .collect(joining(" "))
                )
                .map(r -> r + "\n")
                .collect(toList())
                .forEach(e -> {
                    try {
                        bufferedWriter.write(e);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
