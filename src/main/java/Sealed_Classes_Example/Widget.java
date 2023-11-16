package Sealed_Classes_Example;

import java.util.logging.Logger;

public final class Widget extends PaginateModal {
    public Widget() {
        //Uses of 'System.out' should probably be replaced with more robust logging
        Logger.getLogger(Widget.class.getName()).info("Widget created");
    }
}
