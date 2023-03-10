package bridge

import bridge.abs.RemoteControl
import bridge.abs.TvDevice
import bridge.impl.AdvencedRemoteImplControl
import bridge.impl.Lcd4KTvDeviceImpl
import bridge.impl.OledTvDeviceImpl

class Launcher {
    fun main() {
        val myRemoCon: RemoteControl = AdvencedRemoteImplControl()
        val myTv: TvDevice = OledTvDeviceImpl()
        val wallTv:TvDevice = Lcd4KTvDeviceImpl();
        myTv.getDisplayRatio()
        myRemoCon.volumeUp()
    }

    private fun AdvencedRemoteImplControl(): RemoteControl {

    }
}

val studyNote: String =
"""
[문제점 : ]
- 해결하고자 하는 문제 : 독립적인 여러가지 차원에서 
생태학적 분류법 강목속족같은건가??

- 왜 필요한가
; 밀접하게 관련된 클래스들의 집합을 두개의 개별 계층구조로 나눈 후 독립적으로 개발/발전 해야함
: 

[해결책]
- 상속보다 합성(컴포지션
- 추상화와 구현, 두개의 계층구조로 나눈다
: 추상화 = 인터페이스, 인터페이스만 정의해라. 구현하지마라, 상위수준의 제어 레이어
: 구현 = 클래스구현, 다른 객체들과 상호작용을 하는거, 여기에다가 구현해라

[]
- 개별계층으로 나눠서 추상화하고
- 독립적으로 구현하자


[생각]
- 변수보다 함수가 중요하다. 함수로만 인터페이스(의사소통) 해야한다



""".trimIndent()

// @todo : 정리필요