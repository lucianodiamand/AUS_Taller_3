package mipaquete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class EjemploResource {

	public static void main(String[] args) throws IOException {
		InputStream is = EjemploResource.class.getResourceAsStream("salida.txt");
		Reader r = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(r);
		String linea = br.readLine();
		System.out.println(linea);
	}
}
