package designpatterns.factory;

import designpatterns.factory.components.buttons.Button;
import designpatterns.factory.components.dropdown.DropDown;
import designpatterns.factory.components.menu.Menu;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.WINDOWS);
        UIFactory uiFactory = flutter.getUIFactory();
        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropdown();
    }
}
