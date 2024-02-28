package core;

class Database {
    private static Database dbObject = new Database();
    private Database(){}

    public static Database getInstance() {
        // if(dbObject == null) {
        //     System.out.println("Creating db object");
        //     dbObject = new Database();
        // }
        return dbObject;
    }

    public void getConnection() {
        System.out.println("You are connected to the database");
    }
}

public class SingletonClassDemo {
    public static void main(String[] args) {
        Database db= Database.getInstance();
        db.getConnection();
    }
}
