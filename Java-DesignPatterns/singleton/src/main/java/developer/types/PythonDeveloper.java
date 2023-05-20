package developer.types;

import developer.Developer;

/**
 * The PythonDeveloper class implements the Developer interface and provides a public method for doing Python-specific tasks.
 */
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

    public void doPythonStuff() {
        System.out.println("Some python stuff has made...");
    }
}
