package developer.factory;

import developer.Developer;

/**
 * The DeveloperFactory interface defines a single method for creating a new Developer object.
 */
public interface DeveloperFactory {

    /**
     * Creates a new Developer object.
     * @return A new Developer object.
     */
    Developer createDeveloper();
}
