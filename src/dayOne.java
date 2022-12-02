import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;

public class dayOne {
    public static void main(String[] args) throws Exception 
    {
        partOne("C:\\Users\\smyan\\Documents\\code\\first\\lib\\dayOne.txt");
        partTwo("C:\\Users\\smyan\\Documents\\code\\first\\lib\\dayOne.txt");
    }

    public static void partOne(String filePath) throws Exception
    {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        String str;

        int max = 0;
        int sum = 0;

        while ((str = file.readLine()) != null) {
            if (str.isEmpty()) {
                if (sum > max) {
                    max = sum;
                }
                sum = 0;
            } else {
                sum += Integer.parseInt(str);
            }
        }
        System.out.println(max);
    }

    public static void partTwo(String filePath) throws Exception
    {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        ArrayList<Integer> totals = new ArrayList<Integer>();
        String str;
        int temp = 0;
        while ((str = file.readLine()) != null) {
            if (str.isEmpty()) {
                totals.add(temp);
                temp = 0;
            } else {
                temp += Integer.parseInt(str);
            }
        }
        Collections.sort(totals);
        System.out.println(totals.get(totals.size()-1) + totals.get(totals.size()-2) + totals.get(totals.size()-3));
    }
}
