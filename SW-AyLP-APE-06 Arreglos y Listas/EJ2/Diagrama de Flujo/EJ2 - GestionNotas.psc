Proceso GestionNotas
	Dimensionar listaNotas(6);
	Definir nota, suma, promedio Como Real;
	Definir i Como Entero;
	suma <- 0;
	Para i<-1 Hasta 6 Con Paso 1 Hacer
		Repetir
			Escribir 'Ingrese la nota ', i, ' (0 - 10):';
			Leer nota;
			Si nota<0 O nota>10 Entonces
				Escribir 'Error: La nota debe estar entre 0 y 10.';
			FinSi
		Hasta Que nota>=0 Y nota<=10
		listaNotas[i] <- nota;
		suma <- suma+nota;
	FinPara
	promedio <- suma/6;
	Escribir '--- Notas Registradas ---';
	Para i<-1 Hasta 6 Con Paso 1 Hacer
		Escribir 'Nota ', i, ': ', listaNotas[i];
	FinPara
	Escribir 'Promedio General: ', promedio;
FinProceso
