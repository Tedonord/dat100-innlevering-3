package no.hvl.dat100.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.*;
import no.hvl.dat100.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
		
		try{
			File file = new File(mappe+filnavn);
			Scanner leser = new Scanner(file);

			int antall = Integer.parseInt(leser.nextLine());
			Blogg blogg = new Blogg(antall);
			for (int i = 0; i < antall; i++){
				String textorimage = leser.nextLine();

				int id = Integer.parseInt(leser.nextLine());
				String navn = leser.nextLine();
				String dato = leser.nextLine();
				int likes = Integer.parseInt(leser.nextLine());
				if (textorimage.equals(TEKST)){
					String tekst = leser.nextLine();
					Tekst innlegg = new Tekst(id,navn,dato,likes,tekst);
					blogg.leggTil(innlegg);
				}
				else{
					String bildetekst = leser.nextLine();
					String url = leser.nextLine();
					Bilde innlegg = new Bilde(id,navn,dato,likes,bildetekst,url);
					blogg.leggTil(innlegg);
				}
			}
			return blogg;
		}
		catch (Exception exception){
			System.out.println(exception);
			return null;
		}
	}
}
