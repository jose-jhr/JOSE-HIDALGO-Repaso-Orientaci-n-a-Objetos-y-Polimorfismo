import java.util.*

class ViajeIncentivo(
    origen: String,
    destino: String,
    costo: Int,
    fechaSalida: Date,
    fechaLlegada: Date,
    emtel: String
) :
    Viaje(origen, destino, costo, fechaSalida, fechaLlegada) {

    var empresa:String =""

    override fun descripcion() = "Viaje incentivo que te envia la empresa $empresa"

    override fun cualquierMetodo2() = "Método implementado en la clase hija viaje de incentivo"


}
