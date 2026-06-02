Proceso BusquedaProductos
	Dimensionar inventario(100);
	Definir inventario, prodBuscar, opcion Como Cadena;
	Definir cant, i Como Entero;
	Definir encontrado Como Logico;
	cant <- 0;
	Repetir
		cant <- cant+1;
		Escribir 'Ingrese el nombre del producto ', cant, ':';
		Leer inventario[cant];
		Escribir '¿Desea agregar otro producto? (s/n)';
		Leer opcion;
	Hasta Que opcion='n' O opcion='N'
	Escribir 'Ingrese el producto que desea buscar:';
	Leer prodBuscar;
	encontrado <- Falso;
	Para i<-1 Hasta cant Con Paso 1 Hacer
		Si inventario[i]=prodBuscar Entonces
			Escribir 'Producto encontrado en la posicion: ', i;
			encontrado <- Verdadero;
		FinSi
	FinPara
	Si encontrado=Falso Entonces
		Escribir 'El producto no se encuentra en el inventario.';
	FinSi
FinProceso
