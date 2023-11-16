import org.junit.jupiter.api.Test;

import sealed_classes.Widget;

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
