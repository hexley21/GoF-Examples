import abstractFactory.AbstractProgrammingFactory;
import abstractFactory.factories.PythonProgrammingFactory;
import abstractFactory.factories.RubyProgrammingFactory;
import programming.Developer;
import programming.Ide;

public class Main {

    /*
    In this particular example, factories are not much useful.
    Objects could be instantiated directly and everything would work the same.
    But creating abstract factories gives us an advantages in:
    1. Flexibility and extensibility:
        Abstract factories provide a way to create objects without specifying their concrete types.
    2. Encapsulation of object creation:
        This makes easier to manage the complexity of creating an objects in a large software system.
    3. Separation of concerns:
        Separation of object creation from their use simplifies code. Basically you don't need to know what's behind.
     */
    public static void main(String[] args) {
        // instantiate factories
        AbstractProgrammingFactory pythonFactory = new PythonProgrammingFactory();
        AbstractProgrammingFactory rubyFactory = new RubyProgrammingFactory();

        // create developers
        Developer pythonDeveloper = pythonFactory.createDeveloper();
        Developer rubyDeveloper = rubyFactory.createDeveloper();

        // create developers
        Ide pythonIde = pythonFactory.createIde();
        Ide rubyIde = rubyFactory.createIde();

        // execute python developer code
        pythonDeveloper.writeCode(pythonIde);
        pythonDeveloper.writeCode(pythonIde);
        pythonDeveloper.pushChanges();

        System.out.println(); // just empty line

        // execute ruby developer code
        rubyDeveloper.writeCode(rubyIde);
        rubyDeveloper.writeTests(rubyIde);
        rubyDeveloper.pushChanges();
    }

}
