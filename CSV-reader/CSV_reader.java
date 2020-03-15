import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class CSV_reader {
    public static void main(final String[] args) {
        BufferedReader br = null;
        Keyword keyword;

        try {
            br = new BufferedReader(new FileReader("keywords.csv"));

            final List<Keyword> list = new ArrayList<Keyword>();
            String line = "";

            br.readLine();

            // read file as a text file till last charecter
            while ((line = br.readLine()) != null) {
                // it seperates word by comma(,)
                final String[] KeywordDetails = line.split(",");

                if (KeywordDetails.length > 0) {
                    // first value (keywordDetails[0] is String , So, no need to convert) , second
                    // value is Int than we need to convert it into Integer for other processing
                    // purpose
                    keyword = new Keyword(KeywordDetails[0], Integer.parseInt(KeywordDetails[1]));
                    list.add(keyword);
                }
            }

            for (final Keyword string1 : list) {
                //getKeyword() and getScore() are method of Keyword class 
                System.out.println(string1.getKeyword() + " (" + string1.getScore()+")" );    
            }
 
        }
        catch(final Exception ee)
        {
            ee.printStackTrace();
        }
        finally
        {
            try
            {
                br.close();
            }
            catch(final Exception ie)
            {
                System.out.println("Error occured while closing the BufferedReader");
                ie.printStackTrace();
            }
        }

    }
}