package designpatterns.factory;

import designpatterns.factory.components.buttons.Button;
import designpatterns.factory.components.dropdown.DropDown;
import designpatterns.factory.components.menu.Menu;

//abstract factory
public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropdown();
}
