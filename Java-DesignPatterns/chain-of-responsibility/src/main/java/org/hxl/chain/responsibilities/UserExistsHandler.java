package org.hxl.chain.responsibilities;

import org.hxl.chain.Database;

public class UserExistsHandler extends Handler{
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
