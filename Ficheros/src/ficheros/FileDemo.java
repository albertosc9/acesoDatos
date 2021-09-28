package ficheros;

import java.io.File;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File f = new File ("C://Users//User//eclipse-workspace//Ficheros//datos.txt");
		
		if (f.isDirectory()) {
			String [] ficheros = f.list();
			for (int i=0;i<ficheros.length;i++) {
				System.out.println(ficheros[i]);
		}
		}else  {
			if (f.exists()) {
				System.out.println("el fichero existe: "+f.getName());
				System.out.println(f.getParent());
				System.out.println(f.getTotalSpace()+" MB");
				System.out.println(new Date(f.lastModified()));
			} else {
					System.out.println("el fichero no existe");
			}
		}
		
		
		
	
		
		
	}

}
