package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.Panes;
import Interface.Metodos;
import Interface.Metodos2;

public class LogicaMetodos implements Metodos, Metodos2 {

	private List<Panes> lista = new ArrayList<Panes>();

	// Validar --- que el nombre del pan no se repita, guardamos
	@Override
	public void guardar(Panes pan) {
		// TODO Auto-generated method stub

		// 1--Recorrer los registros de la lista
		// 2---Para despues comparar cada registro
		// 3---Bandera

		boolean bandera = false;
		for (Panes p : lista) {
			if (p.getNombre().equals(pan.getNombre())) {
				// Ese pan ya existe
				System.out.println("Ese nombre de pan ya existe no se puede guardar");
				bandera = true;
				break;
			}
		}

		if (bandera == false) {
			lista.add(pan);
			System.out.println("Se guardo con exito");
		}
	}

	@Override
	public List<Panes> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Panes buscarXindice(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	// ---Excepcion de errores
	@Override
	public void editar(int indice, Panes pan) {
		// TODO Auto-generated method stub
		lista.set(indice, pan);
	}

	// ---Excepcion de errores
	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}
	
	

}
