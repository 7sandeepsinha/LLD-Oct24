package designpatterns.factory;

import designpatterns.factory.components.buttons.Button;
import designpatterns.factory.components.buttons.WindowsButton;
import designpatterns.factory.components.dropdown.DropDown;
import designpatterns.factory.components.dropdown.WindowsDropdown;
import designpatterns.factory.components.menu.Menu;
import designpatterns.factory.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public DropDown createDropdown() {
        return new WindowsDropdown();
    }
}
