import developer.Developer;
import developer.factory.DeveloperFactory;
import developer.factory.types.JavaDeveloperFactory;
import developer.factory.types.PythonDeveloperFactory;
import developer.types.JavaDeveloper;
import developer.types.PythonDeveloper;

import java.util.List;

public class Main {

    /**
     * The main method creates instances of the JavaDeveloperFactory and PythonDeveloperFactory
     * classes, uses them to create instances of the JavaDeveloper and PythonDeveloper
     * classes, and calls various methods on the resulting objects.
     */
    public static void main(String[] args) {
        DeveloperFactory javaFactory = new JavaDeveloperFactory();
        DeveloperFactory pythonFactory = new PythonDeveloperFactory();

        Developer pythonDeveloper = pythonFactory.createDeveloper();
        Developer javaDeveloper = javaFactory.createDeveloper();

        pythonDeveloper.writeCode();
        pythonDeveloper.writeTests();
        pythonDeveloper.pushChanges();
        ((PythonDeveloper) pythonDeveloper).doPythonStuff();

        System.out.println();

        javaDeveloper.writeCode();
        javaDeveloper.writeTests();
        javaDeveloper.pushChanges();
        ((JavaDeveloper)javaDeveloper).doJavaStuff();
    }
}
