module ru.gb.javachat {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.javachat to javafx.fxml;
    exports ru.gb.javachat;
}