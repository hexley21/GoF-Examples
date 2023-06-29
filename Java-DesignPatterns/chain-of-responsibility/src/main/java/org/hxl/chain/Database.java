package org.hxl.chain;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private static Database db;

    public static synchronized Database getInstance() {
        if (db == null) {
            db = new Database();
        }

        return db;
    }
    private final Map<String, String> users = new HashMap<>();

    public Database() {
        users.put("elon", "musk");
        users.put("mark", "zucc");
    }

    public boolean validateUser(String username) {
        return users.containsKey(username);
    }

    public boolean validatePassword(String username, String password) {
        return users.get(username).equals(password);
    }
}
