package auto_radnja.gume;

/**
 * 
 * Ovo je klasa AutoGuma,koja implementira marku gume kao i dimenzije iste.
 * 
 * @author Boris Zivanovic
 * @version 0.1.1
 *
 */
public class AutoGuma {
	
	
	/**
	 * Ispod su predstavljeni atributi klase AutoGuma.
	 * oznacavaju dimenzije gume i marku iste.
	 * markaModel kao String
	 * precnik kao int
	 * sirina kao int
	 * visina kao int
	 *
	 */
	private String markaModel = null;
	private int precnik = -1;
	private int sirina = -1;
	private int visina = -1;

	/*prazan konstruktor*/
	public AutoGuma() {

	}
/**
 * Konstruktor koji postavlja inicijalne vrednosti za date atribute klase.
 * @param markaModel,naziv markeModela koji se dodeljuje atributu maraModel
 * @param precnik,duzina precnika koji se dodeljuje atributu precnik
 * @param sirina,dimenzija sirine koja se dodeljuje atributu sirina
 * @param visina,dimenzija visine koja se dodeljuje atributu visina
 */
	public AutoGuma(String markaModel, int precnik, int sirina, int visina) {

		super();

		setMarkaModel(markaModel);
		setPrecnik(precnik);
		setSirina(sirina);
		setVisina(visina);

	}

	/**
	 * 
	 * Vraca markuModel gume
	 * 
	 * @return markaModel gume kao String
	 */
	public String getMarkaModel() {

		return markaModel;

	}
	
	/**
	 * Dodeljuje vrednost atributu markaModel na osnovu ulaznog parametra.
	 * 
	 * Baca gresku ukoliko je ulazna vrendost null
	 * 
	 * Baca gresku ukoliko je duzina ulazne vrednosti manja od 3 
	 * 
	 * @param markaModel nova vrednost za marku gume
	 * 
	 * @throws NullPointerException ako se unese null vrednost za markaModel
	 * 
	 * @throws IllegalArgumentException ako se premasi duzina od 3 za markuModel
	 */
	public void setMarkaModel(String markaModel) {

		if (markaModel==null)
			throw new NullPointerException("Morate uneti marku i model");

		if (markaModel.length()<3)
			throw new IllegalArgumentException("Marka i model moraju sadrzati bar 3 znaka");

		this.markaModel = markaModel;

	}

	public int getPrecnik() {

		return precnik;

	}

	public void setPrecnik(int precnik) {

		if (precnik < 13 && precnik > 22)
			throw new IllegalArgumentException("Precnik van opsega");

		this.precnik = precnik;

	}

	public int getSirina() {

		return sirina;

	}

	public void setSirina(int sirina) {

		if (sirina < 135 && sirina > 355)
			throw new IllegalArgumentException("Sirina van opsega");

		this.sirina = sirina;

	}

	public int getVisina() {

		
		return visina;
}

	public void setVisina(int visina) {

		if (visina < 25 || visina > 95)
			throw new IllegalArgumentException("Visina van opsega");

		this.visina = visina;

	}
	/**
	 * Definise sta ce se Prikazati na ekranu,tacnije u konzoli
	 * 
	 * @return vraca String
	 */
	@Override
	public String toString() {

		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + 
", sirina=" + sirina + ", visina=" + visina + "]";

	}
	
	/**
	 * 
	 *
	 *
	 */
	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		AutoGuma other = (AutoGuma) obj;

		if (markaModel == null) {
			if (other.markaModel != null)
				return false;

		} else if (!markaModel.equals(other.markaModel))
			return false;

		if (precnik != other.precnik)
			return false;

		if (sirina != other.sirina)
			return false;

		if (visina != other.visina)
			return false;

		return true;

	}

}
