package br.com.alura.forum.application.mapper

interface Mapper<T, R> {
    fun convert(t:T): R
}