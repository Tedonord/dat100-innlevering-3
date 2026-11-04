package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggstabell;
	private int nesteledig;

	public Blogg() {
		this.innleggstabell = new Innlegg[20];
		this.nesteledig = 0;
	}

	public Blogg(int lengde) {
		this.innleggstabell = new Innlegg[lengde];
		this.nesteledig = 0;
	}

	public int getAntall() {
		return this.nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return this.innleggstabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		if (this.nesteledig == 0){
			return -1;
		}
		else{
			for (int i = 0; i < nesteledig;i++){
				if (innlegg.erLik(this.innleggstabell[i])){
					return i;
				}
			}
			return -1;
		}
	}

	public boolean finnes(Innlegg innlegg) {
		if (this.nesteledig == 0){
			return false;
		}
		else{
			for (int i = 0; i < nesteledig;i++){
				if (innlegg.erLik(this.innleggstabell[i])){
					return true;
				}
			}
			return false;
		}
	}

	public boolean ledigPlass() {
		if (this.nesteledig == this.innleggstabell.length){
			return false;
		}
		else{
			return true;
		}
		

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (!finnes(innlegg)){
			this.innleggstabell[this.nesteledig] = innlegg;
			nesteledig++;
			return true;
		}
		else{
			System.out.println("Det finnes et innlegg med samme id");
			return false;
		}
	}
	
	public String toString() {
		String fullString = (nesteledig + "\n");
		for (int i = 0; i < nesteledig;i++){
			fullString += innleggstabell[i].toString();
		}
		return fullString;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}