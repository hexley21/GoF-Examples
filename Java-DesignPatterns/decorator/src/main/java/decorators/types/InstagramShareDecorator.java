package decorators.types;

import decorators.BaseShareDecorator;
import decorators.Sharable;

public class InstagramShareDecorator extends BaseShareDecorator {

    public InstagramShareDecorator(Sharable wrapped) {
        super(wrapped);
    }

    public InstagramShareDecorator() {
        super();
    }

    @Override
    public void share(String message) {
        super.share(message);
        System.out.println("Sharing " + message + " on Instagram");
    }
}
