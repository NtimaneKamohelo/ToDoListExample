module view.todolistdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens view.todolistdemo to javafx.fxml;
    exports view.todolistdemo;
    exports Controller;
    opens Controller to javafx.fxml;
}