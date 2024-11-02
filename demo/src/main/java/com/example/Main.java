

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        double[] arr = {1,2,3,4,5,6,7,8}; 
        DescriptiveStatistics divst = new DescriptiveStatistics(arr);
        System.out.println(divst.getMax());
        System.out.println(divst.getMin());
        System.out.println(divst.getSum());
        System.out.println( "Hello World!" );
    }
}
