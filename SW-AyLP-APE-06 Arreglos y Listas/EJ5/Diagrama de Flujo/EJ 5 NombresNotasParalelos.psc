Proceso NombresNotasParalelos
	Dimensionar arrayNombres(100), arrayNotas(100);
	Definir arrayNombres, nom Como Cadena;
	Definir arrayNotas, nt Como Real;
	Definir n, i Como Entero;
	Escribir 'Cantidad de registros a ingresar:';
	Leer n;
	Para i<-1 Hasta n Hacer
		Escribir 'Nombre del alumno ', i, ':';
		Leer nom;
		Repetir
			Escribir 'Nota de ', nom, ' (0 - 10):';
			Leer nt;
		Hasta Que nt>=0 Y nt<=10
		arrayNombres[i] <- nom;
		arrayNotas[i] <- nt;
	FinPara
	Escribir '--- REGISTROS PROCESADOS ---';
	Para i<-1 Hasta n Hacer
		Escribir 'Estudiante: ', arrayNombres[i], ' -> Nota: ', arrayNotas[i];
	FinPara
FinProceso
