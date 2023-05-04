package developer.factory.types;

import developer.Developer;
import developer.factory.DeveloperFactory;
import developer.types.PythonDeveloper;

public class PythonDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
