package br.com.alura.strategy

fun main(){
    val context = Context();
    val strategy: MissionStrategy = Level1();
    context.execute(strategy)
}