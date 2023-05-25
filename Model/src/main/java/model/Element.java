package model;

import javax.swing.ImageIcon;

public class Element {
	private String title;
	private String result;
	private ImageIcon icon;
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}


	public ImageIcon getK() {
		return icon;
	}


	public void setK(ImageIcon k) {
		this.icon = k;
	}

	
	/**
	 * @param title Kriteriumsname 
	 * @param result Beschreibungstext oder Erläuterung/Hilfe/Hinweis
	 * @param goodOrNo <br> 
	 * 				   <b>Y</b> für grünen Haken oder<br>
	 * 				   <b>N</b>  für roten Haken für schweren Verstoß oder<br>
	 * 				   <b>T</b> für gelbes Icon als Hinweis (Tipp)
	 */
	/**TODO:
	 * Icongrößen anpassen, damit nicht zu groß?
	 */
	public Element(String title, String result, char goodOrNo) {
		this.title = title;
		this.result = result;
		switch(goodOrNo) {
		case 'Y':
			icon = new ImageIcon("/EnvironmentAnalyzer/src/main/resources/green.jpg");
			break;
		case 'T':
			icon = new ImageIcon("/EnvironmentAnalyzer/src/main/resources/yellow.jpg");	
			break;
		case 'N':
			icon = new ImageIcon("/EnvironmentAnalyzer/src/main/resources/red.jpg");
			break;
		}
	}
	
}


