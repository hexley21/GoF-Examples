package org.hxl.chain.responsibilities;

abstract public class Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract boolean handle(String username, String password);

    protected boolean handleNext(String username, String password) {
        if (next == null) {
            return true;
        }
        return next.handle(username, password);
    }
}
