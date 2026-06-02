Proceso CRUD_Menu
	Dimensionar datos(50);
	Definir datos, item Como Cadena;
	Definir opc, total, idx, i Como Entero;
	total <- 0;
	opc <- 0;
	Mientras opc<>5 Hacer
		Escribir '--- MENU CRUD ---';
		Escribir '1. Crear (Agregar)';
		Escribir '2. Leer (Listar)';
		Escribir '3. Actualizar';
		Escribir '4. Eliminar';
		Escribir '5. Salir';
		Leer opc;
		Segun opc Hacer
			1:
				total <- total+1;
				Escribir 'Ingrese el nuevo dato:';
				Leer datos[total];
			2:
				Si total=0 Entonces
					Escribir 'Lista vacia.';
				SiNo
					Para i<-1 Hasta total Hacer
						Escribir i, '. ', datos[i];
					FinPara
				FinSi
			3:
				Escribir 'Ingrese indice a actualizar:';
				Leer idx;
				Si idx>=1 Y idx<=total Entonces
					Escribir 'Ingrese el nuevo valor:';
					Leer datos[idx];
				SiNo
					Escribir 'Indice invalido.';
				FinSi
			4:
				Escribir 'Ingrese indice a eliminar:';
				Leer idx;
				Si idx>=1 Y idx<=total Entonces
					Para i<-idx Hasta total-1 Hacer
						datos[i] <- datos[i+1];
					FinPara
					total <- total-1;
				SiNo
					Escribir 'Indice invalido.';
				FinSi
		FinSegun
	FinMientras
FinProceso
