
public class Main {
	public static void main(String[] args) {
		System.out.println(makeReadable(37898));
	}
	
	public static String makeReadable(int seconds) {

    String time = "";
    String minute = ""; 
    int hour = seconds / 3600;
    int minutes = (seconds % 3600) / 60;
    minute = minutes >= 10 ? String.valueOf(minutes) : "0" + String.valueOf(minutes);
    
    
    // HOURS
    if ( seconds/3600 >= 10 ) {
        time = time.concat(String.valueOf(hour));
    } else {
        time = time.concat("0".concat(String.valueOf(hour)));
    }
    
    // MINUTES
    if (time == "" ) {
        time = time.concat("00:".concat(String.valueOf(minute)));
    } else {
        time = time.concat(":".concat(String.valueOf(minute)));
    }
    
    // SECONDS 
    int second = seconds - ((hour * 3600) + (minutes * 60)) > 0 ? seconds - ((hour * 3600) + (minutes * 60)) : 0;
    
    if ( second >= 10 ) {
        time = time.concat(":".concat(String.valueOf(second)));
    } else if ( second < 10 && second != 0 ) {
        time = time.concat(":0".concat(String.valueOf(second)));
    } else {
        time = time.concat(":00");
    }
    
    return time;
  }
}
