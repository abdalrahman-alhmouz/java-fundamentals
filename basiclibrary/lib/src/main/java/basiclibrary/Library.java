/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;

public class Library {
    public static int[] roll(int number){
        int roll[]=new int[number];
        for (int i=0;i<roll.length;i++){
            int z=(int)Math.floor((Math.random()*7));
            roll[i]=z ;
        }
        return roll ;
    }
    static boolean containsDuplicates() {
        int max = 6;
        int min = 1;
        int range = max - min + 1;

        Set<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min;
            s.add(rand);
        }
        if (s.size() < 6) {
            return true;
        } else {
            return false;
        }
    }

    public static int calculateAvg(Integer[] n){
        int avg=0 ;
        for(int i=0;i<n.length;i++){
            avg += n[i] ;
        }
        return avg ; }

    public static int calculateTowDiemention(Integer[][] n){
        int avg=0 ,z=0,l=0,m=0;
        for(int i=0;i<n[0].length;i++){
//  avg =avg+ n[0][i] ;

            avg =avg+ n[0][i] ;
            z =z+ n[1][i] ;
            l =l+ n[2][i] ;
            m =m+ n[3][i] ;

        }
        if(z<avg && z<l &&z<m){avg=z;
        }else if(l<avg && l<z &&l<m){avg=l;
        }else if(m<avg && m<z && m<l){avg=m;
        }


        return avg  ; }

    public static String iterate(){
        Set<Integer> set=new HashSet<>();
        int[][] array = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int maxValue=array[0][0];
        int minValue=array[0][0];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                set.add(array[i][j]);
                if(array[i][j]>maxValue){
                    maxValue=array[i][j];
                }
                if(array[i][j]<minValue){
                    minValue=array[i][j];
                }
            }

        }

        System.out.println("high "+maxValue);
        System.out.println("low "+minValue);

        String uniqTempreture="";
        for(int j=minValue;j<maxValue;j++){
            if(set.contains(j)==false){
                uniqTempreture+="never Saw tempetature"+j+"\n";
            }
        }
//        System.out.println(uniqTempreture);

        return uniqTempreture ;
    }

    public static String tally(List<String> votes){
        HashMap<String, Integer> vot = new HashMap<String, Integer>();


        Map<String,Integer> map =
                new HashMap<String, Integer>();
        for (String str : votes)
        {
            if (map.keySet().contains(str)){
                map.put(str, map.get(str) + 1);

            }else
                map.put(str, 1);


        }
        int maxValueInMap = 0;
        String winner = "";
        for (Map.Entry<String,Integer> entry : map.entrySet())
        {
            String key  = entry.getKey();
            Integer val = entry.getValue();
            if (val > maxValueInMap)
            {
                maxValueInMap = val;
                winner = key;

            }
        }
        return winner ;


    }

}
