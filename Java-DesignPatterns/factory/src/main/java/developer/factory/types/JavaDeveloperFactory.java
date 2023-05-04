package developer.factory.types;

import developer.Developer;
import developer.factory.DeveloperFactory;
import developer.types.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
