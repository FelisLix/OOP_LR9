module lr9.oop_lr9 {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens lr9.oop_lr9 to javafx.fxml;
    exports lr9.oop_lr9;
}