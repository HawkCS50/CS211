package ArrListRemove;
import java.util.*;

public class LabListRemove
{
    // BJP3 Exercise 10.3: removeEvenLength v.1
    public ArrayList<String>  removeEvenLength ( ArrayList<String> list )
    {
    	//List<String> t= (ArrayList<String>)list.clone();
    	ArrayList<String> t = new ArrayList<>(list);
    	for (int i=t.size()-1;i>-1; i--) 
        	if(t.get(i).length()%2==0) 
        		t.remove(i); 	
        return t;
    }
    // BJP3 Exercise 10.7: removeDuplicates  
    public ArrayList<String> removeDuplicates( ArrayList<String> list )
    {
    	ArrayList<String> t = new ArrayList<>(list);
    	for (int i=t.size()-1;i>0; i--)
    		if(t.get(i)==t.get(i-1)) t.remove(i);
        return t;
    }
    // BJP3 Exercise 10.10: removeInRange
    public void removeInRange( ArrayList<Integer> t, int removeNum, int start, int end )
    {
    	for (int i=end-1;i>=start; i--)
    		if(t.get(i)==removeNum) t.remove(i);
    }
    // BJP3 Exercise 10.14: removeShorterStrings
    public void removeShorterStrings( ArrayList<String> l )
    {
    	int i=l.size()-1;
    	if (i%2==0) i--;
    		for(;i>0;i-=2) {
    			if(l.get(i).length()<l.get(i-1).length())
    				l.remove(i);
    			else
    				l.remove(i-1);
    		}
    }
    // BJP3 Exercise 10.15: filterRange
    public void filterRange( ArrayList<Integer> l, int min, int max )
    {
    	for (int i=l.size()-1;i>-1; i--)
    		if(l.get(i)>=min&&l.get(i)<=max) l.remove(i);
    }
}
