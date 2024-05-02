package _APSET_ArrayLists;
/*created under assumption that getDigit 
and getNumberOfDigits already exist. */
public class StudentRecord {
	
//a
	double avg(int f, int l) {
	    double s = 0.0;
	    for (int i = f; i <= l; i++) s += scores[i];
	    return s / (l - f + 1);
	}
//b
	boolean imp() {
	    for (int i = 0; i < scores.length - 1; i++)
	        if (scores[i] > scores[i + 1]) return false;
	    return true;
	}
//c
	double finalAvg() {
	    return imp() ? avg(scores.length / 2, scores.length - 1) : avg(0, scores.length - 1);
	}

}
