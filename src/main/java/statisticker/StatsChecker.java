package statisticker;

public class StatsChecker {
	EmailAlert emailAlerter = new EmailAlert();
  LEDAlert ledAlerter = new LEDAlert();
  IAlerter alerters[] = {emailAlerter, ledAlerter};
  float maxThreshold = 0f;
  
  public StatsChecker(maxThreshold, alerters){
    this.maxThreshold = maxThreshold;
    this.alerters = alerters;
  }
	public void checkAndAlert(List<Float> numbers) {
    float max = numbers.get(0);
    for (int i = 0; i < numbers.size(); i++) {
        if (max < numbers.get(i))
            max = numbers.get(i);
    }
    System.out.println("Max ="+ max);
    if(max > maxThreshold){
      emailAlerter.emailSent = True;
      ledAlerter.ledGlows = True;
    }
	}
}
