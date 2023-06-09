import decorators.BaseShareDecorator;
import decorators.types.FacebookShareDecorator;
import decorators.types.InstagramShareDecorator;

public class Main {
    public static void main(String[] args) {

        BaseShareDecorator shareDecorator = new FacebookShareDecorator(new InstagramShareDecorator());
    }
}