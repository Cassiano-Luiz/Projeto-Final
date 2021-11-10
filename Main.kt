fun main(args: Array<String>) {

    adicao(1, 2)
    subtracao(3,4)
    multiplicacao(5,6)
    divisao(7.0,8.0)
    potencia(9.0, 0.0)
   }

   fun adicao( num1: Int, num2: Int){
       var result = num1 + num2
       print("o resultado da adição é: $result ")
   }
    fun subtracao ( num1: Int, num2: Int){
        var result = num1 - num2
        print("o resultado da subtração é: $result")
    }
    fun multiplicacao (num1: Int, num2: Int) {
        var result = num1 * num2
        println("o resultado da multiplicação é:$result")
        }
    fun divisao(num1: Double, num2: Double){
        var result = num1 / num2
        println("o resultado da divisão é: $result")
    }
    fun potencia(num1: Double, num2: Double){
        var result = num1 / num2
        println("o resultado da potencia é: $result")
    }
