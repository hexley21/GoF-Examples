package org.hxl.chain.responsibilities;

import org.hxl.chain.Database;

public class PasswordHandler extends Handler {

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
