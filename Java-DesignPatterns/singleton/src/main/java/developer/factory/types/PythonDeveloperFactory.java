package developer.factory.types;

import developer.Developer;
import developer.factory.DeveloperFactory;
import developer.types.PythonDeveloper;

/**
 * The PythonDeveloperFactory class implements the DeveloperFactory and provides a method for creating new PythonDeveloper objects.
 */
public class PythonDeveloperFactory implements DeveloperFactory {
    private static DeveloperFactory instance;

    /**
     * Returns the instance of PythonDeveloperFactory.
     *
     * @return The instance of PythonDeveloperFactory.
     */
    public static synchronized DeveloperFactory getInstance() {
        if (instance == null) {
            instance = new PythonDeveloperFactory();
        }

        return instance;
    }

    /**
     * Creates a new PythonDeveloper object.
     * @return A new PythonDeveloper object.
     */
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
