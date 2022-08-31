package br.com.alura.strategy

class Level1():MissionStrategy {
        val teste: String = "oiee"
        override fun getMissionStatus(): Boolean {
        println("executou a missão do nivel 1 $teste")
        return true;
    }
}