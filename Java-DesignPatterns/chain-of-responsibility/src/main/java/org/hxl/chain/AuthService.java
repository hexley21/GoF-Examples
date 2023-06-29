package org.hxl.chain;

import org.hxl.chain.responsibilities.Handler;

public class AuthService {
    private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public void logIn(String username, String password) {
        if (handler.handle(username, password)) {
            System.out.println("Authorization was successful!");
            // Do stuff for authorized users
        }
    }

}
