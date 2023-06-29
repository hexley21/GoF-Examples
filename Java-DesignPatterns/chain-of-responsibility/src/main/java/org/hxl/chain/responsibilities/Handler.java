package org.hxl.chain.responsibilities;

/**
 * The Handler class represents the abstract base class for handling requests in the Chain of Responsibility pattern.
 * It defines the common structure and behavior that concrete handlers must implement.
 */
public abstract class Handler {
    private Handler next;

    /**
     * Sets the next handler in the chain.
     * @param next The next handler to set.
     */
    public void setNext(Handler next) {
        this.next = next;
    }

    /**
     * Handles the request by either processing it or delegating it to the next handler in the chain.
     * @return True if the request was handled successfully, false otherwise.
     */
    public abstract boolean handle(String username, String password);

    /**
     * Handles the request by delegating it to the next handler in the chain, if available.
     * @return True if the request was handled successfully by any handler in the chain, true if no more handlers are available.
     */
    protected boolean handleNext(String username, String password) {
        if (next == null) {
            return true;
        }
        return next.handle(username, password);
    }
}
