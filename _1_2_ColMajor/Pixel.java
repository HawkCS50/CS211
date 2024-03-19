package _1_2_ColMajor;
public class Pixel
{
    // FILL IN THE CODE FOR THIS CLASS.
    // Create your instance variable.
    private String color;
    // Create your mutator method.
    public void change(String c) {
    	color = c;
    }
    // Create your accessor method.
    public String toString() {
    	return color;
    }
    // OPTIONAL: Create a default constructor.
    // This step is not necessary because if no constructor is written,
    // then an automatic default constructor with no code inside its body
    // is made, so that the object can be created.  The automatically
    // created constructor would have the code below.
    //
    // public Pixel
    // {          }
}
