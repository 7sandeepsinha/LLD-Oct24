package designpatterns.factory;

import designpatterns.factory.components.buttons.Button;
import designpatterns.factory.components.buttons.IosButton;
import designpatterns.factory.components.dropdown.DropDown;
import designpatterns.factory.components.dropdown.IosDropdown;
import designpatterns.factory.components.menu.IosMenu;
import designpatterns.factory.components.menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public DropDown createDropdown() {
        return new IosDropdown();
    }
}
