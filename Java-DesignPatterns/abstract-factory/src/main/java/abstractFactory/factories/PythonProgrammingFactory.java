package abstractFactory.factories;

import abstractFactory.AbstractProgrammingFactory;
import programming.Developer;
import programming.Ide;
import programming.python.PyCharm;
import programming.python.PythonDeveloper;

public class PythonProgrammingFactory implements AbstractProgrammingFactory {

    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Ide createIde() {
        return new PyCharm();
    }
}
