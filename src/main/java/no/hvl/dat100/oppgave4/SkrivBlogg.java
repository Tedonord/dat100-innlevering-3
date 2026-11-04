package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		try {
			File fil = new File(mappe+"/"+filnavn);
			PrintWriter print = new PrintWriter(fil);
			String fulltekst = samling.toString();
			print.printf(fulltekst);
			print.close();
			return true;

		} catch (Exception exception) {
			System.out.println(exception);
			return false;
		}

	}
}
