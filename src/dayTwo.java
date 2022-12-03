import java.io.RandomAccessFile;
public class dayTwo {
    
    public static void partOne(String filePath) throws Exception
    {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        String str;
        int total = 0;
        while ((str = file.readLine()) != null)
        {
            int firstScore = 0;
            int secondScore = 0;

            switch(str.charAt(2))
            {
                case 'X':
                    firstScore = 1;
                    switch(str.charAt(0))
                    {
                        case 'A':
                            secondScore = 3;
                            break;
                        case 'B':
                            secondScore = 0;
                            break;
                        case 'C':
                            secondScore = 6;
                            break;
                    }
                    break;
                case 'Y':
                    firstScore = 2;
                    switch(str.charAt(0))
                    {
                        case 'A':
                            secondScore = 6;
                            break;
                        case 'B':
                            secondScore = 3;
                            break;
                        case 'C':
                            secondScore = 0;
                            break;
                    }
                    break;
                case 'Z':
                    firstScore = 3;
                    switch(str.charAt(0))
                    {
                        case 'A':
                            secondScore = 0;
                            break;
                        case 'B':
                            secondScore = 6;
                            break;
                        case 'C':
                            secondScore = 3;
                            break;
                    }
                    break;
            }

            total += firstScore + secondScore;
        }
        System.out.println(total);
    }

    public static void partTwo(String filepath) throws Exception
    {
        RandomAccessFile file = new RandomAccessFile(filepath, "r");
        String str;
        int total = 0;
        while ((str = file.readLine()) != null)
        {
            int firstScore = 0;
            int secondScore = 0;

            switch(str.charAt(2))
            {
                case 'X':
                    firstScore = 0;
                    switch(str.charAt(0))
                    {
                        case 'A':
                            secondScore = 3;
                            break;
                        case 'B':
                            secondScore = 1;
                            break;
                        case 'C':
                            secondScore = 2;
                            break;
                    }
                    break;
                case 'Y':
                    firstScore = 3;
                    switch(str.charAt(0))
                    {
                        case 'A':
                            secondScore = 1;
                            break;
                        case 'B':
                            secondScore = 2;
                            break;
                        case 'C':
                            secondScore = 3;
                            break;
                    }
                    break;
                case 'Z':
                    firstScore = 6;
                    switch(str.charAt(0))
                    {
                        case 'A':
                            secondScore = 2;
                            break;
                        case 'B':
                            secondScore = 3;
                            break;
                        case 'C':
                            secondScore = 1;
                            break;
                    }
                    break;
            }

            total += firstScore + secondScore;
        }
        System.out.println(total);
    }
}