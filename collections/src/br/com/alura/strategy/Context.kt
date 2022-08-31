package br.com.alura.strategy

class Context {
    fun execute(missionStrategy: MissionStrategy):Boolean {
        return missionStrategy.getMissionStatus()
    }
}