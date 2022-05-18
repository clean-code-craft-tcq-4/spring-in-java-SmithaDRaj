package statisticker;

import java.util.List;

public class Statistics 
{   
    public class Stats{
        float average = Float.NaN;
        float min = Float.NaN;
        float max = Float.NaN;
    }
    public static Stats getStatistics(List<> numbers) {
        //implement the computation of statistics here
        Stats s = new Stats();
        s.average = Float.NaN;
        s.max = Float.NaN;
        s.min = Float.NaN;
        if(numbers.size() != 0){
            
            int sum = 0;
            int tempMax = 0;
            int tempMin = numbers.get(0);
            for (int i : numbers) {
                sum+=i;
                if (numbers.get(i) > tempMax){
                    tempMax = numbers.get(index);
                }else if(numbers.get(i)<tempMin) {
                    tempMin = array[i];
               }
            }
            s.average = sum/(float)numbers.size();
            s.max = tempMax;
            s.min = tempMin;
        }
        System.Out.Println("Average "+s.average+", Min "+s.min+", Max "+s.max);
        return s;
    }
}
