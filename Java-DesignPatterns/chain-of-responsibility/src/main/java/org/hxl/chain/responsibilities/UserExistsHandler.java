package org.hxl.chain.responsibilities;

import org.hxl.chain.Database;

/**
 * The UserExistsHandler class is a concrete implementation of the Handler class. It handles the validation of user existence
 * by checking if the username provided exists in the database.
 */
public class UserExistsHandler extends Handler {

    /**
     * Handles the request by checking if the username exists in the database.
     * @return True if the username exists and the request was handled successfully, false otherwise.
     */
    @Override
    public boolean handle(String username, String password) {
        if (!Database.getInstance().validateUser(username)) {
            System.out.println("The username doesn't exist");
            return false;
        }
        System.out.println("The username exists");
        return handleNext(username, password);
    }
}