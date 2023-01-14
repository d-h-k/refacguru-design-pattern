package abstractmethod

import abstractmethod.component.Button
import abstractmethod.component.Checkbox
import abstractmethod.component.Menubar

interface GUIFactory {
    fun createButton(button: Button)
    fun createCheckbox(checkbox: Checkbox)
    fun createMenuBar(menubar: Menubar)
}