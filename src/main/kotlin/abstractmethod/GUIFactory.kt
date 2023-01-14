package abstractmethod

import abstractmethod.component.Button
import abstractmethod.component.Checkbox
import abstractmethod.component.Menubar

interface GUIFactory {
    fun createButton(): Button
    fun createCheckbox(): Checkbox
    fun createMenuBar(): Menubar
}