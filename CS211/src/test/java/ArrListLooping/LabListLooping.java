package ArrListLooping;
//import java.security.AlgorithmConstraints;
import java.util.*;
public class LabListLooping
{
    // BJP3 Self-Check 10.8: maxLength
    public int maxLength ( ArrayList<String> l )
    {
    	if (l.size()==0) return 0;
    	int i=l.size()-1, temp=l.get(i).length();
    		for(;i>0;i--)
    			if(temp<l.get(i-1).length())
    				temp=l.get(i-1).length();
    	return temp;
    }

    // BJP3 Exercise 10.2: swapPairs
    public void swapPairs( ArrayList<String> l )
    {
    	int i=l.size()-1;
    	if (i%2==0) i--;
    	for(;i>0;i-=2)
    		Collections.swap(l, i, i-1);
    }

    // BJP3 Exercise 10.4: doubleList
    public void doubleList( ArrayList<String> l )
    {
    	for(int i=l.size()-1;i>-1;i--)
    		l.add(i, l.get(i));
    }

    // BJP3 Exercise 10.6: minToFront    
    public void minToFront ( ArrayList<Integer> l )
    {
    	int i=l.size()-1, min=l.get(i),index=i;
    	for(;i>0;i--)
    		if(min>l.get(i-1)) {
    			min=l.get(i-1);
    			index=i-1;
    		}
    	l.remove(index);
    	l.add(0,min);
    }

    // BJP3 Exercise 10.12: markLength4
    public void markLength4 ( ArrayList<String> l )
    {
    	for(int i=l.size()-1;i>-1;i-=1)
    		if (l.get(i).length()==4) l.add(i,"****");
    }

    // BJP3 Exercise 10.11: stutter
    public void stutter( ArrayList<String> l, int numCopies )
    {
    	int i=l.size()-1;
    	for(;i>-1;i--) {
    		for(int j=0;j<numCopies;j++)
    			l.add(i, l.get(i));
    		l.remove(i);
    	}
    }

}
