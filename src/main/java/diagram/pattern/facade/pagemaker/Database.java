package diagram.pattern.facade.pagemaker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Database {
    private Database(){

    }
    public static Properties getProperties(String dbname){
        String filename=dbname+".txt";
        Properties prop=new Properties();
        try{
            prop.load(Files.newInputStream(Paths.get(filename)));
        }catch (IOException e){
            e.printStackTrace();
        }
        return prop;
    }
}
