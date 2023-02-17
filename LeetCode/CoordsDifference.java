package LeetCode;

public class CoordsDifference {

    public static void main(String[] args) 
    { // 25, 4 1, -6
        System.out.println(findCoordsDifference(25.0, 4.0, 1.0, -6.0));
    }
    static Double findCoordsDifference(Double x1, Double y1, Double x2, Double y2)
    {
        return Math.sqrt((Math.pow(x2 - x1,2)) + (Math.pow(y2 - y1,2)));
    }  
}
//26

//28, -2 