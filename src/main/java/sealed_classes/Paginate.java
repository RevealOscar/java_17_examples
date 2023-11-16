package sealed_classes;

sealed interface Paginate permits PaginateImpl {
    void clickNext();
    void clickPrevious();
    void clickPage(int page);
    void clickFirst();
    void clickLast();
}

