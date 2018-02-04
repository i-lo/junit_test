package fi.softala.jee.demo.d11.kello;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class GmtIsoKello implements Kello {

	
	private KelloLahde lahde;
	
	private SimpleDateFormat aikaMuotoilija = new SimpleDateFormat("HH:mm:ss");
	private SimpleDateFormat pvmMuotoilija = new SimpleDateFormat("yyyy.MM.dd");
	private TimeZone Gmt = TimeZone.getTimeZone("GMT");

	public GmtIsoKello(KelloLahde lahde) {
		this.lahde = lahde;
		this.aikaMuotoilija.setTimeZone(Gmt);
		this.pvmMuotoilija.setTimeZone(Gmt);
	}
	

	public String getAika() {
		return aikaMuotoilija.format(lahde.haeAjanhetki());
	}

	public String getPvm() {
		return pvmMuotoilija.format(lahde.haeAjanhetki());
	}

	
	

}
