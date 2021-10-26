package com.m2i.ecommerce.bo;

import com.m2i.ecommerce.enumeration.Devise;
import com.m2i.ecommerce.enumeration.Typeproduit;

public class Produit {
	public Integer idproduit = 1;
	private Typeproduit typeproduit;
	private String nomproduit;
	private Integer stocktotal;
	private String description;
	private Devise devise;
	private Float prix;
	private boolean reduction;
	private String image;

	public Produit(Integer idproduit, Typeproduit typeproduit, String nomproduit, Integer stocktotal,
			String description, Devise devise, float prix, boolean reduction, String image) {
		super();
		this.idproduit = idproduit;
		this.typeproduit = typeproduit;
		this.nomproduit = nomproduit;
		this.stocktotal = stocktotal;
		this.description = description;
		this.devise = devise;
		this.prix = prix;
		this.reduction = reduction;
		this.image = image;
	}

	/**
	 * @param idproduit the idproduit to get
	 * @return
	 */
	public Integer getIdproduit() {
		return idproduit++;
	}

	/**
	 * @param idproduit the idproduit to set
	 */
	public void setIdproduit(Integer idproduit) {
		this.idproduit = idproduit;
		idproduit++;
	}

	/**
	 * @return the typeproduit
	 */
	public Typeproduit getTypeproduit() {
		return typeproduit;
	}

	/**
	 * @param typeproduit the typeproduit to set
	 */
	public void setTypeproduit(Typeproduit typeproduit) {
		this.typeproduit = typeproduit;
	}

	/**
	 * @return the nomproduit
	 */
	public String getNomproduit() {
		return nomproduit;
	}

	/**
	 * @param nomproduit the nomproduit to set
	 */
	public void setNomproduit(String nomproduit) {
		this.nomproduit = nomproduit;
	}

	/**
	 * @return the stocktotal
	 */
	public Integer getStocktotal() {
		return stocktotal;
	}

	/**
	 * @param stocktotal the stocktotal to set
	 */
	public void setStocktotal(Integer stocktotal) {
		this.stocktotal = stocktotal;
	}

	/**
	 * @return the devise
	 */
	public Devise getDevise() {
		return devise;
	}

	/**
	 * @param devise the devise to set
	 */
	public void setDevise(Devise devise) {
		this.devise = devise;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the prix
	 */
	public float getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(float prix) {
		this.prix = prix;
	}

	/**
	 * @return the reduction
	 */
	public boolean isReduction() {
		return reduction;
	}

	/**
	 * @param reduction the reduction to set
	 */
	public void setReduction(boolean reduction) {
		this.reduction = reduction;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Produit [idproduit=" + idproduit + ", typeproduit=" + typeproduit + ", nomproduit=" + nomproduit
				+ ", stocktotal=" + stocktotal + ", description=" + description + ", devise=" + devise + ", prix="
				+ prix + ", reduction=" + reduction + ", image=" + image + "]";
	}

}
