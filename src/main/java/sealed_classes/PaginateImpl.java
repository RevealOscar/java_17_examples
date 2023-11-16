package sealed_classes;

import java.util.logging.Logger;

sealed class PaginateImpl implements Paginate permits PaginateModal {
    PaginateImpl() {
        Logger.getLogger(PaginateImpl.class.getName()).info("PaginateImpl created");
    }
    @Override
    public void clickNext() {
        System.out.println("Next page");
    }

    @Override
    public void clickPrevious() {
        System.out.println("Previous page");
    }

    @Override
    public void clickPage(int page) {
        System.out.println("Page " + page);
    }

    @Override
    public void clickFirst() {
        System.out.println("First page");
    }

    @Override
    public void clickLast() {
        System.out.println("Last page");
    }
}
