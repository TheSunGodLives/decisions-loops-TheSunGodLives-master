
/**
 * Write a description of class String_Compare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class String_Compare
{
    private String word1 = "catalog";
    private String word2 = "cat";
    
    int result = word1.compareTo("aaa");
    int result2 = word1.compareTo(word2);
    
    public String_Compare()
    {
    if(result > 0)
    {
        System.out.println("catalog is lexigraphically greater than aaa.");
    }
    
    if(result2 == 0)
    {
        System.out.println("both words are lexigraphically equal.");
    }
    else if(result2 < 0)
    {
        System.out.println("catalog is lexigraphically less than cat.");
    }
    else if(result2 > 0)
    {
        System.out.println("catalog is lexigraphically greater than cat.");
    }
    
    String word1sub = word1.substring(0,2);
    String word2sub = word2.substring(0,2);
    
    if( word1sub.equals( word2sub ))
    {
        System.out.println("Words have the same first three letter prefix.");
    }
}
}
