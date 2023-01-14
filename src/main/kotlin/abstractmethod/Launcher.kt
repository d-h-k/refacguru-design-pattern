package abstractmethod

import abstractmethod.concrete.MacDarkGUIFactory
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
        //return WindowsGUIFactory()
        //return MacGUIFactory()
        return MacDarkGUIFactory();
        //
    }
}
/*
추상팩토리 예시 : SLF4J, JPA - 구현채 하이버네이트, 이클립스JPA 등등..

추상 팩토리는 당신의 코드가 관련된 제품군의 다양한 패밀리들과
작동해야 하지만 해당 제품들의 구상 클래스들에 의존하고 싶지
않을 때 사용하세요. 왜냐하면 이러한 클래스들은 당신에게 미리
알려지지 않았을 수 있으며, 그 때문에 향후 확장성(extensibility)
을 허용하기를 원할 수 있기 때문입니다.

한 당신은 당신의 앱에서 이미 생성된
제품들과 일치하지 않는 잘못된 제품 변형을 생성하지 않을지
걱정할 필요가 없습니다.
• 코드에 클래스가 있고, 이 클래스의 팩토리 메서드들의 집합의
기본 책임이 뚜렷하지 않을 때 추상 팩토리 구현을 고려하세요.
• 잘 설계된 프로그램에서는 각 클래스는 하나의 책임만 가집니
다. 클래스가 여러 제품 유형을 상대할 경우, 클래스의 팩토리
메서드들을 독립실행형 팩토리 클래스 또는 완전한 추상 팩토리
구현으로 추출할 가치가 있을 수 있습니다.




 */