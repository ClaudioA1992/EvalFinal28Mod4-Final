package com.planificador.interfaces;

import java.util.List;

import com.planificador.modelo.ActividadRutina;

public interface IActividadRutinaCRUD {
	
	// Crea una actividad de rutina
	public boolean crearActRutina(ActividadRutina actRutina);
	
	// Obtiene una actividad de una rutina espec�fica
	public ActividadRutina obtenerActRutina(int id_act_rutina);
	
	// Obtiene una lista de actividades de una rutina espec�fica
	public List<ActividadRutina> obtenerListaActRutina(int id_rutina);
	
	// Obtiene una lista de actividades de una rutina que sean de una categor�a espec�fica
	public List<ActividadRutina> obtenerListaActRutinaPorCategoria(int id_rutina);
	
	// Modificar una actividad de rutina
	public boolean modificarActRutina(int id_act_rutina);
	
	// Eliminar una actividad de rutina de la base de datos
	public boolean eliminarActRutina(int id_act_rutina);

}
