module de.lubowiecki.petregister {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.lubowiecki.petregister to javafx.fxml;
    exports de.lubowiecki.petregister;
}