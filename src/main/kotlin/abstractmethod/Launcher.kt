package abstractmethod

import abstractmethod.concrete.MacGUIFactory
import abstractmethod.concrete.WindowsGUIFactory

abstract class Launcher {
    fun run() {
        val clientApp = osGUIFactory()
        clientApp.createButton()
        clientApp.createCheckbox()
        clientApp.createMenuBar()
    }

    private fun osGUIFactory():GUIFactory{
        return WindowsGUIFactory()
        //return MacGUIFactory()
    }
}
