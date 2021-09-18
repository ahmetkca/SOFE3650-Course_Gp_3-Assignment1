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
            // split each line and add it to db

            db.add( strLine.split(","));

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
    }
}

