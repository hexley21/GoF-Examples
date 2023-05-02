package abstractFactory.factories;

import abstractFactory.AbstractProgrammingFactory;
import programming.Developer;
import programming.Ide;
import programming.ruby.RubyDeveloper;
import programming.ruby.RubyMine;

public class RubyProgrammingFactory implements AbstractProgrammingFactory {

    @Override
    public Developer createDeveloper() {
        return new RubyDeveloper();
    }

    @Override
    public Ide createIde() {
        return new RubyMine();
    }
}
