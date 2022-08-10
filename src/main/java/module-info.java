module gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens gui to javafx.fxml;
    exports gui;
}
