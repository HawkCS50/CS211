package ArrListLooping;
import java.util.*;

public class ListLoopRunner
{    
    public static void main( String[] args )
    {
        LabListLooping theLab = new LabListLooping();
       
        // Testing BJP3 Self-Check 10.8: maxLength
        System.out.println( "Testing: maxLength: " );
        ArrayList<String> list1a = new ArrayList<String>( Arrays.asList( "to", "be", "or", "not", "to", "be", "hamlet" ) );
        System.out.println( theLab.maxLength( list1a ) );
        ArrayList<String> list1b = new ArrayList<String>( Arrays.asList( "to", "be", "or", "not", "to", "be" ) );
        System.out.println( theLab.maxLength( list1b ) );
        ArrayList<String> list1c = new ArrayList<String>( Arrays.asList( "biggest", "next", "not" ) );
        System.out.println( theLab.maxLength( list1c ) );
        ArrayList<String> list1d = new ArrayList<String>( Arrays.asList(  ) );       
        System.out.println( theLab.maxLength( list1d ) );

        // Testing BJP3 Exercise 10.2: swapPairs
        System.out.println( "\nTesting: swapPairs: " );
        ArrayList<String> list2a = new ArrayList<String>( Arrays.asList( "four", "score", "and", "seven", "years", "ago" ) );
        theLab.swapPairs( list2a );
        System.out.println( list2a );
        ArrayList<String> list2b = new ArrayList<String>( Arrays.asList( "to", "be", "or", "not", "to", "be", "hamlet" ) );
        theLab.swapPairs( list2b );
        System.out.println( list2b );
        ArrayList<String> list2c = new ArrayList<String>( Arrays.asList( "I", "love", "programming!" ) );
        theLab.swapPairs( list2c );
        System.out.println( list2c );
        ArrayList<String> list2d = new ArrayList<String>( Arrays.asList( "Pretty", "straight", "forward", "test", "with", "a", "twist" ) );
        theLab.swapPairs( list2d );
        System.out.println( list2d );
        ArrayList<String> list2e = new ArrayList<String>( Arrays.asList( "don't move me" ) );
        theLab.swapPairs( list2e );
        System.out.println( list2e );
        ArrayList<String> list2f = new ArrayList<String>( Arrays.asList( ) );
        theLab.swapPairs( list2f );
        System.out.println( list2f );

        // Testing BJP3 Exercise 10.4: doubleList
        System.out.println( "\nTesting: doubleList: " );
        ArrayList<String> list3a = new ArrayList<String>( Arrays.asList( "how", "are", "you?" ) );
        theLab.doubleList( list3a );
        System.out.println( list3a );
        ArrayList<String> list3b = new ArrayList<String>( Arrays.asList( "I", "am", "great,", "thanks!" ) );
        theLab.doubleList( list3b );
        System.out.println( list3b );
        ArrayList<String> list3c = new ArrayList<String>( Arrays.asList( "One string only" ) );
        theLab.doubleList( list3c );
        System.out.println( list3c );
        ArrayList<String> list3d = new ArrayList<String>( Arrays.asList( ) );
        theLab.doubleList( list3d );
        System.out.println( list3d );

        // Testing BJP3 Exercise 10.6: minToFront
        System.out.println( "\nTesting: minToFront: " );
        ArrayList<Integer> list4a = new ArrayList<Integer>( Arrays.asList( 3, 8, 92, 4, 2, 17, 9 ) );
        theLab.minToFront( list4a );
        System.out.println( list4a );
        ArrayList<Integer> list4b = new ArrayList<Integer>( Arrays.asList( 1 ) );
        theLab.minToFront( list4b );
        System.out.println( list4b );
        ArrayList<Integer> list4c = new ArrayList<Integer>( Arrays.asList( 6, 1, 4, -2 ) );
        theLab.minToFront( list4c );
        System.out.println( list4c );
        ArrayList<Integer> list4d = new ArrayList<Integer>( Arrays.asList( 0, 1, 2, 3 ) );
        theLab.minToFront( list4d );
        System.out.println( list4d );
        ArrayList<Integer> list4e = new ArrayList<Integer>( Arrays.asList( 3, 2, 1, 0 ) );
        theLab.minToFront( list4e );
        System.out.println( list4e );
        
        // Testing BJP3 Exercise 10.12: markLength4
        System.out.println( "\nTesting: markLength4: Version 2:" );
        ArrayList<String> list5a = new ArrayList<String>( Arrays.asList( "this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer" ) );
        theLab.markLength4( list5a );
        System.out.println( list5a );
        ArrayList<String> list5b = new ArrayList<String>( Arrays.asList( "four", "when", "yard" ) );
        theLab.markLength4( list5b );
        System.out.println( list5b );
        ArrayList<String> list5c = new ArrayList<String>( Arrays.asList( "Don't", "do", "anything", "to", "the", "list!" ) );
        theLab.markLength4( list5c );
        System.out.println( list5c );
        ArrayList<String> list5d = new ArrayList<String>( Arrays.asList( "four" ) );
        theLab.markLength4( list5d );
        System.out.println( list5d );
        ArrayList<String> list5e = new ArrayList<String>( Arrays.asList( ) );
        theLab.markLength4( list5e );
        System.out.println( list5e );
        
        // Testing BJP3 Exercise 10.11: stutter
        System.out.println( "\nTesting: stutter: " );
        ArrayList<String> list6a = new ArrayList<String>( Arrays.asList( "how", "are", "you?" ) );
        theLab.stutter( list6a, 4 );
        System.out.println( list6a );
        ArrayList<String> list6b = new ArrayList<String>( Arrays.asList( "test1", "test2" ) );
        theLab.stutter( list6b, 8 );
        System.out.println( list6b );
        ArrayList<String> list6c = new ArrayList<String>( Arrays.asList( "test1", "test2" ) );
        theLab.stutter( list6c, 1 );
        System.out.println( list6c );
        ArrayList<String> list6d = new ArrayList<String>( Arrays.asList( "alone" ) );
        theLab.stutter( list6d, 5 );
        System.out.println( list6d );
        ArrayList<String> list6e = new ArrayList<String>( Arrays.asList( "how", "are" ) );
        theLab.stutter( list6e, 0 );
        System.out.println( list6e );
        ArrayList<String> list6f = new ArrayList<String>( Arrays.asList( "test1", "test2"  ) );
        theLab.stutter( list6f, -5 );
        System.out.println( list6f );
        ArrayList<String> list6g = new ArrayList<String>( Arrays.asList(  ) );
        theLab.stutter( list6g, 88 );
        System.out.println( list6g );
    }
}
