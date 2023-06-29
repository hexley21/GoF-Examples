package org.hxl.chain;

import org.hxl.chain.responsibilities.Handler;
import org.hxl.chain.responsibilities.PasswordHandler;
import org.hxl.chain.responsibilities.UserExistsHandler;

public class Main {
    public static void main(String[] args) {
        Handler handler = new UserExistsHandler();
        handler.setNext(new PasswordHandler());
        AuthService service = new AuthService(handler);

        service.logIn("jeff", "bezos");
        System.out.println();
        service.logIn("elon", "tesla");
        System.out.println();
        service.logIn("elon", "musk");
    }
}