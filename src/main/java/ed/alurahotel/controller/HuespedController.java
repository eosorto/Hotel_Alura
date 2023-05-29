package ed.alurahotel.controller;

import java.util.List;

import ed.alurahotel.dao.HuespedDao;
import ed.alurahotel.factory.ConnectionFactory;
import ed.alurahotel.modelo.Huesped;

public class HuespedController {

	private HuespedDao huespedDao;
	
	public HuespedController() {
		this.huespedDao = new HuespedDao(new ConnectionFactory().recupetaConexion());
	}
	
	public void guardar(Huesped huesped) {
		huespedDao.guardar(huesped);
	}
	
	public List<Huesped> listar(String campo) {
		return huespedDao.listarHuespedes(campo);
	}

	public int modificar(String nombre, String apellido, String fecha_nacimiento, String nacionalidad, String telefono, Long id){
		return huespedDao.modificar(nombre, apellido, fecha_nacimiento, nacionalidad, telefono, id);	
	}
	
	public int eliminar(Integer id) {		
		return huespedDao.eliminar(id);			
	}
	
	public int eliminarPorIDReserva(Integer id_reserva) {		
		return huespedDao.eliminarPorIDReserva(id_reserva);			
	}
}
