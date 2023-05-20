package developer.factory.types;

import developer.Developer;
import developer.factory.DeveloperFactory;
import developer.types.PythonDeveloper;

/**
 * The PythonDeveloperFactory class implements the DeveloperFactory and provides a method for creating new PythonDeveloper objects.
 */
public class PythonDeveloperFactory implements DeveloperFactory {
    /**
     * Creates a new PythonDeveloper object.
     * @return A new PythonDeveloper object.
     */

    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
