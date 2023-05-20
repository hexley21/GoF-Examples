package developer.factory.types;

import developer.Developer;
import developer.factory.DeveloperFactory;
import developer.types.JavaDeveloper;

/**
 * The JavaDeveloperFactory class implements the DeveloperFactory and provides a method for creating new JavaDeveloper objects.
 */
public class  JavaDeveloperFactory implements DeveloperFactory {

    private static DeveloperFactory instance;

    /**
     * Returns the instance of JavaDeveloperFactory.
     *
     * @return The instance of JavaDeveloperFactory.
     */
    public static synchronized DeveloperFactory getInstance() {
        if (instance == null) {
            instance = new JavaDeveloperFactory();
        }

        return instance;
    }

    /**
     * Creates a new JavaDeveloper object.
     * @return A new JavaDeveloper object.
     */
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
