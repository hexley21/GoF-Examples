package abstractFactory;

import programming.Developer;
import programming.Ide;

public interface AbstractProgrammingFactory {

    Developer createDeveloper();
    Ide createIde();
}
