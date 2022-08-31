package br.com.alura.collection

import java.math.BigDecimal

data class Meta (
    val title: String,
    val objetivo: Set<Objetivo>
        )

{
    fun getCompleted(): Objetivo? {
        return objetivo.find {
            it.status == STATUS.FINISHED
        }
    }
}

data class Objetivo(
    val title: String,
    val currentValue: BigDecimal,
    val goalCompletedValue: BigDecimal,
    val status: STATUS
)

enum class STATUS {
    FINISHED,
    INCOMPLETE
}
