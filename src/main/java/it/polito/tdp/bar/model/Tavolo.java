package it.polito.tdp.bar.model;

public class Tavolo {
	private int quantitàDisponibile;
	private int capienza;
	public Tavolo(int quantitàDisponibile, int capienza) {
		super();
		this.quantitàDisponibile = quantitàDisponibile;
		this.capienza = capienza;
	}
	public int getQuantitàDisponibile() {
		return quantitàDisponibile;
	}
	public int getCapienza() {
		return capienza;
	}

}
