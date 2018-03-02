package Biblioteka;

public class Knjiga {

	private String naslov;
	private String ISBN;
	private String izdavac;
	private int izdanje;
	private Autor[] autori;
	
	
	public Autor[] getAutori() {
		return autori;
	}
	public void setAutori(Autor[] autori) {
		this.autori = autori;
	}
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getIzdavac() {
		return izdavac;
	}
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	
}
