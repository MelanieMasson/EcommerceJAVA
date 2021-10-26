/**
 * 
 */
package com.m2i.ecommerce.test;

import com.m2i.ecommerce.bo.Chaussette;
import com.m2i.ecommerce.bo.Produit;
import com.m2i.ecommerce.enumeration.Devise;
import com.m2i.ecommerce.enumeration.Taille;
import com.m2i.ecommerce.enumeration.Typeproduit;

/**
 * @author 33652
 *
 */
public class Lanceur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produit produit = new Produit(1, Typeproduit.chaussette, "Chaussettes Pastèque", 19, "Jolies chaussettes",
				Devise.euro, 5.99F, false, ".\\images\\pasteques.jpg");

		System.out.println(produit);

		Chaussette chaussette = new Chaussette(1, "Chaussettes Pastèque", Taille.medium, 45);

		System.out.println(chaussette);
	}

}
