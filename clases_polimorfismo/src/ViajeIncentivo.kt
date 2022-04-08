import java.util.*

class ViajeIncentivo(origen: String, destino: String, costo: Int, fechaSalida: Date, fechaLlegada: Date) :
    Viaje(origen, destino, costo, fechaSalida, fechaLlegada) {

    var empresa:String =""

    constructor(
        popayán: String,
        medellin: String,
        i: Int,
        date: Date,
        parse: Date,
        empresa: String
    ){
        this.empresa = empresa
    }

    override fun descripcion() = "Viaje incentivo que te envia la empresa $empresa"

    override fun cualquierMetodo2() = "Método implementado en la clase hija viaje de incentivo"


}