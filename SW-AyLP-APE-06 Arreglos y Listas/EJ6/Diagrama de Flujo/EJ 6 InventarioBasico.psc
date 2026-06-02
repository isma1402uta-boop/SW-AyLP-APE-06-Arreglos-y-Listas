Proceso InventarioBasico
	Dimensionar nombres(50), stocks(50), precios(50);
	Definir nombres Como Cadena;
	Definir stocks, totalProd, i Como Entero;
	Definir precios, valorTotal, subtotal Como Real;
	totalProd <- 2;
	Para i<-1 Hasta totalProd Hacer // Configurado estático para demostración
		Escribir 'Nombre del Producto:';
		Leer nombres[i];
		Escribir 'Cantidad disponible:';
		Leer stocks[i];
		Escribir 'Precio unitario:';
		Leer precios[i];
	FinPara
	valorTotal <- 0;
	Escribir '--- REPORTE DE EXTRACCIÓN ---';
	Para i<-1 Hasta totalProd Hacer
		subtotal <- stocks[i]*precios[i];
		Escribir nombres[i], ' -> Stock: ', stocks[i], ' | Subtotal: $', subtotal;
		valorTotal <- valorTotal+subtotal;
	FinPara
	Escribir 'Valor Total de Inventario: $', valorTotal;
FinProceso
