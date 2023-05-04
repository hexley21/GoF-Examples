package developer.types;

import developer.Developer;

public class PythonDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PythonDeveloper wrote some python code...");
    }

    @Override
    public void writeTests() {
        System.out.println("PythonDeveloper wrote some unit-tests in Jupiter...");
    }

    @Override
    public void pushChanges() {
        System.out.println("PythonDeveloper pushed changes to Git...");
    }
}
