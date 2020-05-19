package it.polito.tdp.bar.model;

public class GruppoClienti {
	private int time;
	private int num_persone;
	private int durata;
	private float tolleranza;
	public GruppoClienti(int time, int num_persone, int durata, float tolleranza) {
		super();
		this.time = time;
		this.num_persone = num_persone;
		this.durata = durata;
		this.tolleranza = tolleranza;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getNum_persone() {
		return num_persone;
	}
	public void setNum_persone(int num_persone) {
		this.num_persone = num_persone;
	}
	public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}
	public float getTolleranza() {
		return tolleranza;
	}
	public void setTolleranza(float tolleranza) {
		this.tolleranza = tolleranza;
	}

}
