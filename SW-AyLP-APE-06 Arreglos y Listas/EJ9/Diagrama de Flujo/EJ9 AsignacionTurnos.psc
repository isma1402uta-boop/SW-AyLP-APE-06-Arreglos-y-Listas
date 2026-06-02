Proceso AsignacionTurnos
	Dimensionar colaTurnos(5);
	Definir colaTurnos, cliente Como Cadena;
	Definir i Como Entero;
	Para i<-1 Hasta 3 Hacer
		Escribir 'Asigne nombre para el turno ', i, ':';
		Leer cliente;
		colaTurnos[i] <- cliente;
	FinPara
	Escribir '--- TURNOS DE ATENCIÓN EMITIDOS ---';
	Para i<-1 Hasta 3 Hacer
		Escribir 'Turno A-', i, ': ', colaTurnos[i];
	FinPara
FinProceso
