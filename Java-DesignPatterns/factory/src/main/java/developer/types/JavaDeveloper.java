package developer.types;

import developer.Developer;

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
}
