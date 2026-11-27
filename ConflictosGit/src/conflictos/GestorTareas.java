package conflictos;

public class GestorTareas {
    public static String obtenerEstado(int tareasPendientes) {
        if (tareasPendientes <= 0) {
            return "No hay tareas pendientes";
        }
        if (tareasPendientes > 10) {
            return "ATENCIÓN: acumulación de tareas";
        }
        return "Pendientes: " + tareasPendientes + " tareas";
    }

    public static void main(String[] args) {
        System.out.println(obtenerEstado(0));
        System.out.println(obtenerEstado(5));
        System.out.println(obtenerEstado(12));
    }
}
