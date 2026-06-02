Proceso SimulacionFilaFIFO
	Dimensionar fila(3);
	Definir fila Como Cadena;
	Definir i Como Entero;
	fila[1] <- 'Carlos';
	fila[2] <- 'Ana';
	fila[3] <- 'Mateo';
	Escribir '--- PROCESANDO FILA DE ATENCIÓN (FIFO) ---';
	Para i<-1 Hasta 3 Hacer
		Escribir 'Atendiendo al cliente: ', fila[i];
	FinPara
	Escribir 'Fila vacia. Simulacion concluida.';
FinProceso
