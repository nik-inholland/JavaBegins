module nl.inholland.nl.javabegins {
    requires javafx.controls;
    requires javafx.fxml;


    opens nl.inholland.nl.javabegins to javafx.fxml;
    exports nl.inholland.nl.javabegins;
}