package com.wbg.taller;

public class VectorApp {
	public static void main(String[] args) {
		String[] productos = new String[3];

		double[] valoresProducto = new double[3];

		productos[0] = "televisor";
		productos[1] = "computador";
		productos[2] = "manoslibres";

		valoresProducto[0] = 500.0;
		valoresProducto[1] = 550.0;
		valoresProducto[2] = 25.0;
		Factura factura = new Factura();
		factura.getFactura(productos, valoresProducto);

	}

}
