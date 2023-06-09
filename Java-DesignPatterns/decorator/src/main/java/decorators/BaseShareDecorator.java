package decorators;

public abstract class BaseShareDecorator implements Sharable {

    protected final Sharable wrapped;

    public BaseShareDecorator(Sharable wrapped) {
        this.wrapped = wrapped;
    }

    public BaseShareDecorator() {
        this.wrapped = new ShareLog();
    }

    @Override
    public void share(String message) {
        wrapped.share(message);
    }

    public static class ShareLog implements Sharable{
        @Override
        public void share(String message) {
            System.out.println("Message " + message + " was shared and logged");
        }
    }

}
