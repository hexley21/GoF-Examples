package programming.python;

import programming.Ide;

public class PyCharm extends Ide {

    public PyCharm() {
        super.ideName = "PyCharm";
    }

    @Override
    public void executeCode() {
        System.out.println("\tPyCharm executed code successfully...");
    }

    @Override
    public void runTests() {
        System.out.println("\tPyCharm ran all tests successfully...");
    }
}
