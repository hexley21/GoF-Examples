package org.hxl.chain.responsibilities;

import org.hxl.chain.Database;

/**
 * The PasswordHandler class is a concrete implementation of the Handler class. It handles the validation of passwords
 * by checking if the password provided matches the password stored in the database for the given username.
 */
public class PasswordHandler extends Handler {

    /**
     * Handles the request by validating the password for the given username.
     * @return True if the password is correct and the request was handled successfully, false otherwise.
     */
    @Override
    public boolean handle(String username, String password) {
        if (!Database.getInstance().validatePassword(username, password)) {
            System.out.println("The password is incorrect");
            return false;
        }
        System.out.println("The password is correct");
        return handleNext(username, password);
    }
}