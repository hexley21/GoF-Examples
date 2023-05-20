package programming.ruby;

import programming.Ide;

public class RubyMine extends Ide {

    public RubyMine() {
        super.ideName = "RubyMine";
    }

    @Override
    public void executeCode() {
        System.out.println("\tRubyMine executed code successfully...");
    }

    @Override
    public void runTests() {
        System.out.println("\tRubyMine ran all tests successfully...");
    }
}
