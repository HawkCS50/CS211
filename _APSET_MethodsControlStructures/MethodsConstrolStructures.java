package _APSET_MethodsControlStructures;
/*created under assumption that getDigit 
and getNumberOfDigits already exist. */
public class MethodsConstrolStructures {
	//(A)
	public static int getCheck(int num) {
		int sum=0,i=7;
		int length=getNumberOfDigits(num);
		for(int pos=length;pos>0;pos--) {
			sum+=i*getDigit(num,pos);
			i--;
		}
		return getDigit(sum,1);
	}	
	//(B)
	public static boolean isValid(int qute) {
		if(qute==(qute/10)*10+getCheck(qute/10) return true;
		return false;
	}
}

