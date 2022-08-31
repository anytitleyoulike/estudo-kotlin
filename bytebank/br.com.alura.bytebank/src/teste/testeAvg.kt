package teste

fun main() {
//    fun testeAvg(salary: IntArray): Double {
//        val max = salary.maxOrNull();
//        val min = salary.minOrNull();
//
//        val newSalary = salary.filter { it != max && it != min }
//
//        return newSalary.average();
//    }
//    println("Média salárial: ${testeAvg(intArrayOf(10,20,30,50))}")


    fun binarySearch(numbers: IntArray, target: Int) : Int {
        var max = numbers.size - 1;
        var min = 0;
        var countAttempt = 1;

        while(max >= min) {
            val attempt = Math.floor(((max+min)/2).toDouble()).toInt();
            println("Tentativa ${countAttempt} - numero encontrado: ${numbers[attempt]}");
            if(numbers[attempt] == target) {
                return  attempt
//                return "Busca binária encontrou o número ${numbers[attempt]} em ${countAttempt} tentativas"
            }
            else if(numbers[attempt] > target) {
                countAttempt++
                max--;
            } else {
                countAttempt++
                min++;
            }
        }
        return -1
//        return "Busca binária não o encontrou o número ${target} e utilizou ${countAttempt} tentativas";
    }

    println(binarySearch(intArrayOf(-1,0,3,5,9,12), 9))
}