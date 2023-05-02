package programming.ruby;

import programming.Developer;
import programming.Ide;

public class RubyDeveloper implements Developer {
    @Override
    public void writeCode(Ide ide) {
        System.out.printf("Ruby developer writes code in %s...\n", ide.ideName);
        ide.executeCode();
    }

    @Override
    public void writeTests(Ide ide) {
        System.out.println("Ruby developer writes tests...");
        ide.runTests();
    }

    @Override
    public void pushChanges() {
        System.out.println("Ruby developer pushes RubyOnRails project's changes to remote...");
    }
}
