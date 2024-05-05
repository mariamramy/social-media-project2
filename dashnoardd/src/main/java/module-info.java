module com.example.dashnoardd {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.dashnoardd to javafx.fxml;
    exports com.example.dashnoardd;
}