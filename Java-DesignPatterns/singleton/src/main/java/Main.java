import developer.Developer;
import developer.factory.DeveloperFactory;
import developer.factory.types.JavaDeveloperFactory;
import developer.factory.types.PythonDeveloperFactory;

public class Main {
    public static void main(String[] args) {
        // Get an instance of the JavaDeveloperFactory
        DeveloperFactory javaFactory = JavaDeveloperFactory.getInstance();

        // Create a JavaDeveloper using the factory
        Developer javaDeveloper = javaFactory.createDeveloper();

        // Use the JavaDeveloper object
        javaDeveloper.writeCode();
        javaDeveloper.writeTests();
        javaDeveloper.pushChanges();

        System.out.println("------------------------");

        // Get an instance of the PythonDeveloperFactory
        DeveloperFactory pythonFactory = PythonDeveloperFactory.getInstance();

        // Create a PythonDeveloper using the factory
        Developer pythonDeveloper = pythonFactory.createDeveloper();

        // Use the PythonDeveloper object
        pythonDeveloper.writeCode();
        pythonDeveloper.writeTests();
        pythonDeveloper.pushChanges();
    }
}