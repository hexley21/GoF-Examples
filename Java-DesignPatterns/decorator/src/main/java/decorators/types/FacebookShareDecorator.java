package decorators.types;

import decorators.BaseShareDecorator;
import decorators.Sharable;

public class FacebookShareDecorator extends BaseShareDecorator {

    public FacebookShareDecorator(Sharable wrapped) {
        super(wrapped);
    }

    public void send(String message) {
        super.share(message);
        System.out.println("Sharing " + message + " on Facebook");
    }
}
