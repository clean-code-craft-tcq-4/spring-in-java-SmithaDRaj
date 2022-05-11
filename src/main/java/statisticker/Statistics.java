package statisticker;

import java.util.List;

public class Statistics 
{   
    public class Stats{
        float average = 0f;
        float min = 0f;
        float max = 0f;
    }
    public static Stats getStatistics(List<> numbers) {
        //implement the computation of statistics here
        
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
        System.Out.Println("Average "+average+", Min "+min+", Max "+max);
        Stats s = new Stats();
        s.average = sum/(float)numbers.size();
        s.max = tempMax;
        s.min = tempMin;
        return s;
    }
}
