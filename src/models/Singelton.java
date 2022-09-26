package models;

public class Singelton {
    private static String connection;

    public String getConnection(){
        if (connection==null){
            connection = "open";
        }
        return connection;
    }
}
