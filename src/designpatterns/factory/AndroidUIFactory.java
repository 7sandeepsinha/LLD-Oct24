package designpatterns.factory;

import designpatterns.factory.components.buttons.AndroidButton;
import designpatterns.factory.components.buttons.Button;
import designpatterns.factory.components.dropdown.AndroidDropdown;
import designpatterns.factory.components.dropdown.DropDown;
import designpatterns.factory.components.menu.AndroidMenu;
import designpatterns.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropdown() {
        return new AndroidDropdown();
    }
}
