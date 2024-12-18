module oop.keyacosmeticsltd.keya_cosmetics__ltd {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens oop.keyacosmeticsltd.keya_cosmetics__ltd to javafx.fxml;
    exports oop.keyacosmeticsltd.keya_cosmetics__ltd;
}