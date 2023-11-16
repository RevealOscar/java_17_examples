import org.junit.jupiter.api.Test;

import Sealed_Classes_Example.Widget;

public class sealed_classes_test {

    @Test
    public void test() {
        final var widget = new Widget();
        widget.clickFirst();
        widget.clickLast();
        widget.clickNext();
        widget.clickPrevious();
        widget.clickPage(1);
    }
}
