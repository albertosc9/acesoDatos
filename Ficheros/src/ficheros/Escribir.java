package ficheros;

import java.io.*;

public class Escribir {

	

			public static void main(String[] args) throws IOException {
				// TODO Auto-generated method stub

				File nuevo = new File("C:\\Users\\User\\Documents\\nuevo.txt");
			
			
				
					FileWriter fw = new FileWriter(nuevo);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write("Nombre, Apellidos, Curso");
					bw.newLine();
				
					
				/**
					String linea;
					FileReader leer = new FileReader("C:\\xampp\\htdocs\\aadd\\recursos\\alumnos-dam2-nuevos.txt");
					
					BufferedReader br = new BufferedReader(leer);
					
					while ((linea=br.readLine())!=null) {
						String letra = linea.substring(4);
						System.out.println(letra);
						
						
						
					}
					
			**/
				
				
				
				
				Escribir arch = new Escribir();
				String palabra;
				arch.Completar("alberto Sanchez Catela,Dam2");
				File nu = new File("C:\\Users\\User\\Desktop\\numero.txt");
				FileReader Fr = new FileReader(nu);
				BufferedReader Br = new BufferedReader(Fr);
				
				while ((palabra=Br.readLine())!=null) {
					String [] palabras = palabra.split(",");
					if (!palabra.contains("NOMBRE")) {
						if (palabras.length==4) {
							bw.append(palabras[1]+" "+palabras[2]+" "+palabras[3]+" Dam2"+"\n");
						}else {
							bw.append(palabras[1]+" "+palabras[2]+" Dam2"+"\n");
						}
						
					}
						
					
					}
				Br.close();
				bw.close();
				}
			
						
				
			
			public void Completar (String nuevo) throws IOException {
				BufferedWriter escribir =null;
				
				escribir = new BufferedWriter(new FileWriter("C:\\\\Users\\\\User\\\\Documents\\\\nuevo.txt",true));
				escribir.newLine();
				escribir.append(nuevo);
				escribir.close();
				
			}
			
		

	}


