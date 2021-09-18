import java.io.*;
import java.util.ArrayList;

public class Database {

    private static final ArrayList<String[]> db = new ArrayList<>();

    public static void initDatabase() throws IOException {
        // Open the file
        FileInputStream fstream = new FileInputStream("db.csv");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

        //Read File Line By Line
        while ((strLine = br.readLine()) != null)   {
            // Print the content on the console

            db.add( strLine.split(","));

//            System.out.println (strLine);
        }

        //Close the input stream
        fstream.close();
    }

    public Database() throws IOException {
        initDatabase();
    }

    public ArrayList<String[]> getDB() {
        return db;
    }

    public static void main(String[] args) throws IOException {
        initDatabase();
//        for(String[] vehiclePart: db) {
//            for (String attrb : vehiclePart) {
//                System.out.print(attrb + " | ");
//            }
//            System.out.println("");
//        }
        System.out.println(db.get(0)[1]);
    }
}

