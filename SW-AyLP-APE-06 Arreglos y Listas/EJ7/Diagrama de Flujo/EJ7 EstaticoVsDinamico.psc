Proceso EstaticoVsDinamico
	// En PSeInt todas las estructuras se comportan como estáticas
	Dimensionar estatico(3);
	Escribir 'Estructura fija inicializada a 3 posiciones.';
	estatico[1] <- 10;
	estatico[2] <- 20;
	estatico[3] <- 30;
	Escribir 'Arreglo fijo lleno. No se puede expandir mas allá de ', 3;
FinProceso
