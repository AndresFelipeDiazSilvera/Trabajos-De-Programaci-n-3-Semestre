package controller;

import java.util.Scanner;

import model.Pan;

public class PanController{
	
	Pan[] pan = new Pan[5];
	
	public Pan guardarPanes(int id, String tipo, int precio){
		Pan pan = new Pan(id,tipo,precio);
		this.pan[id]=pan;
		return pan;
	}
	
	public Pan[] ShowPanes() {
		return pan;
	}

 
}