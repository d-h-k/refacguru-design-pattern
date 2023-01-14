package abstractmethod.concrete

import abstractmethod.GUIFactory
import abstractmethod.component.Button
import abstractmethod.component.Checkbox
import abstractmethod.component.Menubar

class MacDarkGUIFactory :GUIFactory{
    override fun createButton(): Button {
        TODO("Not yet implemented")
    }

    override fun createCheckbox(): Checkbox {
        TODO("Not yet implemented")
    }

    override fun createMenuBar(): Menubar {
        TODO("Not yet implemented")
    }

}