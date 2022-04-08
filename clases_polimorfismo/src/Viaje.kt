import java.util.*

abstract class Viaje(val origen:String,
                     val destino:String,
                     val costo:Int,
                     val fechaSalida:Date,
                     val fechaLlegada:Date){


    abstract fun descripcion():String

    fun cualquierMetodo() = "Cualquier metodo implementado en la clase base"

    open fun cualquierMetodo2() = "Cualquier metodo 2 implementado en la base"





}