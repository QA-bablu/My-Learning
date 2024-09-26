package DateAndTimeApi;

import java.time.ZoneId;

public class ZoneSpecific {
	
public static void main(String[] args) {
	
	ZoneId zoneId = ZoneId.systemDefault();
	
	System.out.println(zoneId);
	
}

}
