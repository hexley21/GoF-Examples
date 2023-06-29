package org.hxl.chain;

import org.hxl.chain.responsibilities.Handler;

/**
 * The AuthService class represents the service responsible for user authentication and authorization.
 */
public class AuthService {
    private final Handler handler;

    /**
     * Constructs an AuthService object with the specified handler.
     */
    public AuthService(Handler handler) {
        this.handler = handler;
    }

    /**
     * Logs in the user by performing the authentication and authorization process.
     */
    public void logIn(String username, String password) {
        if (handler.handle(username, password)) {
            System.out.println("Authorization was successful!");
            // Do stuff for authorized users
        }
    }
}