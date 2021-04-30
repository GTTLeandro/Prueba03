package POO;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		Boleteria bol1 = new Boleteria();
		bol1.setNombre("UTN");
		bol1.setFechaInicio(LocalDate.of(2020,3,3));
		//	vendo 4
		bol1.getVendidas()[bol1.getCantidadClientes()]=8;
		bol1.setCantidadClientes(bol1.getCantidadClientes()+1);
		bol1.getVendidas()[bol1.getCantidadClientes()]=3;
		bol1.setCantidadClientes(bol1.getCantidadClientes()+1);
		bol1.getVendidas()[bol1.getCantidadClientes()]=5;
		bol1.setCantidadClientes(bol1.getCantidadClientes()+1);
		bol1.getVendidas()[bol1.getCantidadClientes()]=9;
		bol1.setCantidadClientes(bol1.getCantidadClientes()+1);
				
		System.out.println(bol1.getFechaInicio());
		System.out.println("Ventas: "+ bol1.getCantidadClientes());
		System.out.println();
		
		double promedio =0.0;
		double suma =0.0;
		for(int i =0; i<bol1.getCantidadClientes();i++) {
			if(bol1.getVendidas()[i]!= null) {
				System.out.println("venta "+i+": "+bol1.getVendidas()[i]);
				suma+=bol1.getVendidas()[i];
				System.out.println(suma);
		}
		}
		promedio= suma/bol1.getCantidadClientes();
		System.out.println("El promedio de cada venta es: "+ promedio + " entradas");
	}
}
	