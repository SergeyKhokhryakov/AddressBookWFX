module ru.ostrovcy.addressbookwfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires ca.pragmaticcoding.widgetsfx;

    opens ru.ostrovcy.addressbookwfx to javafx.fxml;
    exports ru.ostrovcy.addressbookwfx;
    exports ru.ostrovcy.addressbookwfx.mvci;
    opens ru.ostrovcy.addressbookwfx.mvci to javafx.fxml;
    exports ru.ostrovcy.addressbookwfx.mvci.model;
    opens ru.ostrovcy.addressbookwfx.mvci.model to javafx.fxml;
}