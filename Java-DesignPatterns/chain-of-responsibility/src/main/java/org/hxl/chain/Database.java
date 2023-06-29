package org.hxl.chain;

import java.util.HashMap;
import java.util.Map;


/**
 * The Database class represents a simple database that stores user information.
 */
public class Database {
    private static Database db;
    private final Map<String, String> users = new HashMap<>();

    /**
     * Private constructor to prevent direct instantiation of the Database class.
     * Use the getInstance() method to obtain an instance.
     */
    private Database() {
        users.put("elon", "musk");
        users.put("mark", "zucc");
    }

    /**
     * @return The singleton instance of the Database class.
     */
    public static synchronized Database getInstance() {
        if (db == null) {
            db = new Database();
        }
        return db;
    }

    /**
     * Validates if the given username exists in the database.
     * @return True if the username exists in the database, false otherwise.
     */
    public boolean validateUser(String username) {
        return users.containsKey(username);
    }

    /**
     * Validates if the given password matches the password stored in the database for the given username.
     * @return True if the password is correct for the given username, false otherwise.
     */
    public boolean validatePassword(String username, String password) {
        return users.get(username).equals(password);
    }
}