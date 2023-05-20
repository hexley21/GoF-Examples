package developer.factory.types;

import developer.Developer;
import developer.factory.DeveloperFactory;
import developer.types.JavaDeveloper;

/**
 * The JavaDeveloperFactory class implements the DeveloperFactory and provides a method for creating new JavaDeveloper objects.
 */
public class JavaDeveloperFactory implements DeveloperFactory {
    /**
     * Creates a new JavaDeveloper object.
     * @return A new JavaDeveloper object.
     */
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
