package programming.python;

import programming.Developer;
import programming.Ide;

public class PythonDeveloper implements Developer {

    @Override
    public void writeCode(Ide ide) {
        System.out.printf("Python developer writes code in %s...\n", ide.ideName);
        ide.executeCode();
    }

    @Override
    public void writeTests(Ide ide) {
        System.out.println("products.python developer writes tests...");
        ide.runTests();
    }

    @Override
    public void pushChanges() {
        System.out.println("Python developer pushes Django project's changes to remote...");
    }
}
