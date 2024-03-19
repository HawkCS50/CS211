package ArrListRemove;
import java.util.*;

public class RemoveRunner
{
    public static void main( String[] args )
    {
        LabListRemove lab = new LabListRemove();
        // Testing removeEvenLength v.1:
        System.out.println( "Testing removeEvenLength: " );
        ArrayList<String> list1a = new ArrayList<String>( Arrays.asList( "This", "is", "a", "test" ) );
        System.out.println( "Original list: " + list1a );
        System.out.println( "Returned list: " + lab.removeEvenLength( list1a ) );
        System.out.println( "Original list: " + list1a );
        ArrayList<String> list1b = new ArrayList<String>( Arrays.asList( "even", "odd", "ev", "o" ) );
        System.out.println( "Original list: " + list1b );
        System.out.println( "Returned list: " + lab.removeEvenLength( list1b ) );
        System.out.println( "Original list: " + list1b );
        ArrayList<String> list1c = new ArrayList<String>( Arrays.asList( "Did", "you", "solve", "it", "or", "what?" ) );
        System.out.println( "Original list: " + list1c );
        System.out.println( "Returned list: " + lab.removeEvenLength( list1c ) );
        System.out.println( "Original list: " + list1c );
        ArrayList<String> list1d = new ArrayList<String>( Arrays.asList( ) );
        System.out.println( "Original list: " + list1d );
        System.out.println( "Returned list: " + lab.removeEvenLength( list1d ) );
        System.out.println( "Original list: " + list1d );
        
        
        // Testing removeDuplicates: 
        System.out.println( "\nTesting removeDuplicates: " );
        ArrayList<String> list2a = new ArrayList<String>( Arrays.asList("be", "be", "is", "not", "or", "question", "that", "the", "to", "to") ); 
        System.out.println( "Original list: " + list2a );
        ArrayList<String> l2a = lab.removeDuplicates(list2a);
        System.out.println( "Returned list: " + l2a );
        System.out.println( "Original list: " + list2a );
        ArrayList<String> list2b = new ArrayList<String>( Arrays.asList( "duplicate", "duplicate", "duplicate", "duplicate", "duplicate" ) ); 
        System.out.println( "Original list: " + list2b.toString() );
        ArrayList<String> l2b = lab.removeDuplicates(list2b);
        System.out.println( "Returned list: " + l2b );
        System.out.println( "Original list: " + list2b );
        ArrayList<String> list2c = new ArrayList<String>( Arrays.asList( "unique") ); 
        System.out.println( "Original list: " + list2c );
        ArrayList<String> l2c = lab.removeDuplicates(list2c);
        System.out.println( "Returned list: " + l2c );
        System.out.println( "Original list: " + list2c );
        ArrayList<String> list2d = new ArrayList<String>( Arrays.asList( "be", "is", "not", "or", "question", "that", "the", "to" ) ); 
        System.out.println( "Original list: " + list2d );
        ArrayList<String> l2d = lab.removeDuplicates(list2d);
        System.out.println( "Returned list: " + l2d );
        System.out.println( "Original list: " + list2d );
        ArrayList<String> list2e = new ArrayList<String>( Arrays.asList(  ) ); 
        System.out.println( "Original list: " + list2e );
        ArrayList<String> l2e = lab.removeDuplicates(list2e);
        System.out.println( "Returned list: " + l2e );
        System.out.println( "Original list: " + list2e );
        ArrayList<String> list2f = new ArrayList<String>( Arrays.asList("be", "be", "be", "is", "is", "not", "or", "or", "or", "or",
                                                                        "question", "that", "that", "that", "the", "the", "the", "the", "the",
                                                                        "to", "to") ); 
        System.out.println( "Original list: " + list2f );
        ArrayList<String> l2f = lab.removeDuplicates(list2f);
        System.out.println( "Returned list: " + l2f );
        System.out.println( "Original list: " + list2f );
        
               
        // Testing removeInRange:
        System.out.println( "\nTesting removeInRange: " );
        ArrayList<Integer> list3a = new ArrayList<Integer>( Arrays.asList( 0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16 ) );
        lab.removeInRange( list3a, 0, 5, 13 );
        System.out.println( list3a );
        ArrayList<Integer> list3b = new ArrayList<Integer>( Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10 ) );
        lab.removeInRange( list3b, 9, 8, 10 );
        System.out.println( list3b );
        ArrayList<Integer> list3c = new ArrayList<Integer>( Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10 ) );
        lab.removeInRange( list3c, 9, 8, 11 );
        System.out.println( list3c );
        ArrayList<Integer> list3d = new ArrayList<Integer>( Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10 ) );
        lab.removeInRange( list3d, 9, 9, 11 );
        System.out.println( list3d );
        ArrayList<Integer> list3e = new ArrayList<Integer>( Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10 ) );
        lab.removeInRange( list3e, 9, 5, 3 );
        System.out.println( list3e );
        
        // Testing removeShorterStrings:
        System.out.println( "\nTesting removeShorterStrings: " );
        ArrayList<String> list4a = new ArrayList<String>( Arrays.asList( "four", "score", "and", "seven", "years", "ago" ) ); 
        lab.removeShorterStrings( list4a );
        System.out.println( list4a );
        ArrayList<String> list4b = new ArrayList<String>( Arrays.asList( "Lots", "of^^", "ties", "in^^", "this", "test" ) ); 
        lab.removeShorterStrings( list4b );
        System.out.println( list4b );
        ArrayList<String> list4c = new ArrayList<String>( Arrays.asList( "Don't", "remove", "the", "last", "string (me)") ); 
        lab.removeShorterStrings( list4c );
        System.out.println( list4c );
        ArrayList<String> list4d = new ArrayList<String>( Arrays.asList( "Don't remove me" ) ); 
        lab.removeShorterStrings( list4d );
        System.out.println( list4d );
        ArrayList<String> list4e = new ArrayList<String>( Arrays.asList( ) ); 
        lab.removeShorterStrings( list4e );
        System.out.println( list4e );
       
        // Testing filterRange:
        System.out.println( "\nTesting filterRange: " );
        ArrayList<Integer> list5a = new ArrayList<Integer>( Arrays.asList( 4, 7, 9, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7 ) );
        lab.filterRange( list5a, 5, 7 );
        System.out.println( list5a );
        ArrayList<Integer>  list5b = new ArrayList<Integer>( Arrays.asList( -8, 3, 5, -2, 12, 0, -4, 1, -10 ) );
        lab.filterRange( list5b, -5, 5 );
        System.out.println( list5b );
        ArrayList<Integer>  list5c = new ArrayList<Integer>( Arrays.asList( 4, 7, 9, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7 ) );
        lab.filterRange( list5c, 1, 9 );
        System.out.println( list5c );
        ArrayList<Integer>  list5d = new ArrayList<Integer>( Arrays.asList( 4, 1, 9, 11, 3, 10, 14, 2, 12 ) );
        lab.filterRange( list5d, 5, 8 );
        System.out.println( list5d );
        ArrayList<Integer> list5e = new ArrayList<Integer>( Arrays.asList( ) );
        lab.filterRange( list5e, 0, 3 );
        System.out.println( list5e );
    }
}
