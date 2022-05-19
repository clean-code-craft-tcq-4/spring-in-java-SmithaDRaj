package statisticker;

import java.util.List;
import statisticker.EmailAlert;
import statisticker.LEDAlert;
import statisticker.IAlerter;

public class StatsChecker {
	EmailAlert emailAlerter = new EmailAlert();
	LEDAlert ledAlerter = new LEDAlert();
	IAlerter alerters[] = null;
	float maxThreshold = 0f;

	public StatsChecker(float maxThreshold, IAlerter[] alerters){
	    this.maxThreshold = maxThreshold;
	    this.alerters = alerters;
	  }

	public void checkAndAlert(List<Float> numbers) {
		float max = numbers.get(0);
		for (int i = 0; i < numbers.size(); i++) {
			if (max < numbers.get(i))
				max = numbers.get(i);
		}
		System.out.println("Max =" + max);
		if (max > maxThreshold) {
			emailAlerter.emailSent = true;
			ledAlerter.ledGlows = true;
		}
	}
}
