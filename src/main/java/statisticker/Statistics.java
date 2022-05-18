package statisticker;

import java.util.List;

public class Statistics {
	public class Stats {
		float average = Float.NaN;
		float min = Float.NaN;
		float max = Float.NaN;
	}

	public static Stats getStatistics(List<Float> numbers) {
		// implement the computation of statistics here
		Statistics st = new Statistics();
		Statistics.Stats s = st.new Stats();
		s.average = Float.NaN;
		s.max = Float.NaN;
		s.min = Float.NaN;
		if (numbers.size() != 0) {

			int sum = 0;
			Float tempMax = 0f;
			Float tempMin = numbers.get(0);
			for (int i = 0; i < (numbers.size() - 1); i++) {
				sum += numbers.get(i);
				if (numbers.get(i) > tempMax) {
					tempMax = numbers.get(i);
				} else if (numbers.get(i) < tempMin) {
					tempMin = numbers.get(i);
				}
			}
			s.average = sum / (float) numbers.size();
			s.max = tempMax;
			s.min = tempMin;
		}
		System.out.println("Average " + s.average + ", Min " + s.min + ", Max " + s.max);
		return s;
	}
}
