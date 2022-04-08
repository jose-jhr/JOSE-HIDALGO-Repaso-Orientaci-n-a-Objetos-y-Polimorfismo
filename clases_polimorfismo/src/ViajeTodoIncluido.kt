import java.util.*

class ViajeTodoIncluido(origen: String, destino: String, costo: Int, fechaSalida: Date, fechaLlegada: Date) :
    Viaje(origen, destino, costo, fechaSalida, fechaLlegada) {

    override fun descripcion() = "Disfruta tu viaje todo incluido"

    }