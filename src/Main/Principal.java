package Main;

import java.time.LocalDate;
import java.util.Scanner;

import Dominio.Panes;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declara las variables
		Scanner lectura = null;

		String nombre;
		float precio;
		int existencia, menuPrinc, indice;
		String sabor;
		LocalDate fechaLabo;
		
		System.out.println("Se agregan estas lineas de codigo");
		Float operacion = 3.1416f*5;
		System.out.println(operacion);
		
		Panes pan = null;

		LogicaMetodos imp = new LogicaMetodos();

		do {
			System.out.println("MENU PRINCIPAL DE - PANADERIA");
			System.out.println("1---ALTA");
			System.out.println("2---MOSTRAR");
			System.out.println("3---BUSCAR");
			System.out.println("4---EDITAR");
			System.out.println("5---ELIMINAR");
			System.out.println("6---BUSCAR POR NOMBRE");
			System.out.println("7---BUSCAR POR SABOR");
			System.out.println("8---CALCULAR TOTAL DINERO INVERTIDO");
			System.out.println("9---EDITAR BUSCANDO POR NOMBRE");
			System.out.println("10---ELIMINAR BUSCANDO POR NOMBRE");
			System.out.println("11---SALIR");

			lectura = new Scanner(System.in);
			menuPrinc = lectura.nextInt();

			switch (menuPrinc) {
			case 1:
				try {
					System.out.println("Ingrese el nombre");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();

					System.out.println("Ingrese el precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();

					System.out.println("Ingresa la existencia");
					lectura = new Scanner(System.in);
					existencia = lectura.nextInt();

					System.out.println("Ingrese el sabor");
					lectura = new Scanner(System.in);
					sabor = lectura.nextLine();

					System.out.println("Ingrese la fecha de elaboracion: Ejemplo: a�o-mes-dia");
					lectura = new Scanner(System.in);
					String fecha = lectura.nextLine();

					fechaLabo = LocalDate.parse(fecha);

					// Crear el objeto
					pan = new Panes(nombre, precio, existencia, sabor, fechaLabo);

					// Guardar
					imp.guardar(pan);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar " + e.getMessage());
				}
				break;
			case 2:
				if (imp.mostrar().size() > 0)
					System.out.println(imp.mostrar());
				else
					System.out.println("No hay registros");
				break;
			case 3:
				try {
					System.out.println("Ingrese el indice del registro a buscar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Buscar
					pan = imp.buscarXindice(indice);
					System.out.println("Se encontro " + pan);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar " + e.getMessage());
				}
				break;
			case 4:
				try {
					System.out.println("Ingrese el indice del registro a editar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Para editar primero hay que Buscar
					pan = imp.buscarXindice(indice);
					System.out.println("Se encontro " + pan.getNombre());

					// Ingresal el nuevo dato
					System.out.println("Ingrese el nuevo nombre del pan");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();

					// Actualizacion
					pan.setNombre(nombre);
					imp.editar(indice, pan);
					System.out.println("Se edito correctamente");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al editar " + e.getMessage());
				}
				break;
			case 5:
				try {
					System.out.println("Ingrese el indice a eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Eliminar
					imp.eliminar(indice);
					System.out.println("Se elimino con exito");
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al eliminar " + e.getMessage());
				}
				break;
			case 6:
				
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				break;
			}

		} while (menuPrinc < 11);

	}

}
