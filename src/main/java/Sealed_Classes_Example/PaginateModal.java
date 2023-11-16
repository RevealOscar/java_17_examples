package Sealed_Classes_Example;

import java.util.logging.Logger;

sealed class PaginateModal extends PaginateImpl permits Widget {
    PaginateModal() {
        Logger.getLogger(PaginateModal.class.getName()).info("PaginateModal created");
    }
}
