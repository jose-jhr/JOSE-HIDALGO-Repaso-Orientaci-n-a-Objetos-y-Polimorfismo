import java.util.*

class ViajeFamiliar(
    origen: String,
    destino: String,
    costo: Int,
    fechaSalida: Date,
    fechaLlegada: Date,
    i: Int
):
    Viaje(origen, destino, costo, fechaSalida, fechaLlegada) {


    override fun descripcion() = "VIAJE PARA DISFRUTAR CON TODA TU FAMILIA"
    override fun cualquierMetodo2()=  "Método implementado en la clase hija viaje familiar"



}