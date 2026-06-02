Proceso RegistroEstudiantes
	Dimensionar listaEstudiantes(5);
	Definir nombre Como Cadena; // Simulación con arreglo estático en PSeInt
	Definir i Como Entero;
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Repetir
			Escribir 'Ingrese el nombre del estudiante ', i, ':';
			Leer nombre;
			Si Longitud(nombre)=0 Entonces
				Escribir 'Error: El nombre no puede estar vacío.';
			FinSi
		Hasta Que Longitud(nombre)>0
		listaEstudiantes[i] <- nombre;
	FinPara
	Escribir '--- Lista de Estudiantes ---';
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Escribir i, '. ', listaEstudiantes[i];
	FinPara
FinProceso
