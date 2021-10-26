package com.m2i.ecommerce.bo;

import com.m2i.ecommerce.enumeration.Taille;

public class Chaussette {
	public Integer idchaussette = 1;
	private String nomchaussette;
	private Taille taille;
	private Integer stock;

	/**
	 * @param idchaussette
	 * @param nomchaussette
	 * @param taille
	 * @param stock
	 */
	public Chaussette(Integer idchaussette, String nomchaussette, Taille taille, Integer stock) {
		super();
		this.idchaussette = idchaussette;
		this.nomchaussette = nomchaussette;
		this.taille = taille;
		this.stock = stock;
	}

	/**
	 * @return the idchaussette
	 */
	public Integer getIdchaussette() {
		return idchaussette++;
	}

	/**
	 * @param idchaussette the idchaussette to set
	 */
	public void setIdchaussette(Integer idchaussette) {
		this.idchaussette = idchaussette;
		idchaussette++;
	}

	/**
	 * @return the nomchaussette
	 */
	public String getNomchaussette() {
		return nomchaussette;
	}

	/**
	 * @param nomchaussette the nomchaussette to set
	 */
	public void setNomchaussette(String nomchaussette) {
		this.nomchaussette = nomchaussette;
	}

	/**
	 * @return the taille
	 */
	public Taille getTaille() {
		return taille;
	}

	/**
	 * @param taille the taille to set
	 */
	public void setTaille(Taille taille) {
		this.taille = taille;
	}

	/**
	 * @return the stock
	 */
	public Integer getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Chaussette [idchaussette=" + idchaussette + ", nomchaussette=" + nomchaussette + ", taille=" + taille
				+ ", stock=" + stock + "]";
	}

}
