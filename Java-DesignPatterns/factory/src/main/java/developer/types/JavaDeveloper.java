package developer.types;

import developer.Developer;

/**
 * The JavaDeveloper class implements the Developer interface and provides a public method for doing Java-specific tasks.
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("JavaDeveloper wrote some Java code...");
    }

    @Override
    public void writeTests() {
        System.out.println("JavaDeveloper wrote some unit-tests using JUnit platform...");
    }

    @Override
    public void pushChanges() {
        System.out.println("JavaDeveloper pushed changes to Git...");
    }

    public void doJavaStuff() {
        System.out.println("Some java stuff has made...");
    }
}
