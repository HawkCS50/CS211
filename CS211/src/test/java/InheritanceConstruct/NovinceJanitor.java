package InheritanceConstruct;
import java.util.*;

public class NovinceJanitor extends Janitor {

	public NovinceJanitor(String vac, double bono) {
		super(fourX(vac), bono, false);
	}
	@Override
	public void clean() {
		System.out.println("Workin' for the man."
				+ "\nI need more training.");
	}
	private static String fourX(String a) {
		    a += a;
		    a+=a;
		    return a;
	}

	
}
