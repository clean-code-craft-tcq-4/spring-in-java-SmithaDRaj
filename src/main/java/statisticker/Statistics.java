package statisticker;

import java.util.List;

public class Statistics 
{   
    float average = Float.NaN;
    float min = Float.NaN;
    float max = Float.NaN;
    
    public static Stats getStatistics(List<___> numbers) {
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
        this.max = sum/(float)numbers.size();
        this.max = tempMax;
        this.min = tempMin;
    }
}
