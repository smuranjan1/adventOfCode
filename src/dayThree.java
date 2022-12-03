import java.io.RandomAccessFile;
import java.util.ArrayList;
public class dayThree {
    public static void partOne(String filePath) throws Exception
    {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        String currentLine;
        String alphabet =  "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int sum = 0;
        while ((currentLine = file.readLine()) != null)
        {
            String str1 = currentLine.substring(0, (currentLine.length()/2));
            String str2 = currentLine.substring(currentLine.length()/2, currentLine.length());
            int i = 0;
            outerloop:
            while (i < str1.length())
            {
                for (int j = 0; j < str2.length(); j++)
                {
                    if (str1.charAt(i) == str2.charAt(j))
                    {
                        break outerloop;
                    }
                }
                i++;
            }
            sum += (1 +  alphabet.indexOf(str1.charAt(i)));
        }
        System.out.println(sum);
    }

    public static void partTwo(String filePath) throws Exception
    {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        ArrayList<String> lines = new ArrayList<String>();
        String currentLine;
        Character priority = ' ';
        int sum  = 0;
        String alphabet =  "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while ((currentLine = file.readLine()) != null)
        {
            lines.add(currentLine);
        }
        for (int i = 0; i < lines.size(); i += 3)
        {
            for (int j = 0; j < lines.get(i).length(); j++)
            {
                for (int k = 0; k < lines.get(i+1).length(); k++)
                {
                    for (int l = 0; l < lines.get(i+2).length(); l++)
                    {
                        if (lines.get(i).charAt(j) == lines.get(i+1).charAt(k) && 
                            lines.get(i+2).charAt(l) == lines.get(i+1).charAt(k) && 
                            lines.get(i).charAt(j) == lines.get(i+2).charAt(l) )
                        {
                            priority =  lines.get(i).charAt(j);
                        }
                    }
                }
            }
            sum += (1 +  alphabet.indexOf(priority));
        }
        System.out.println(sum);
    }
}
