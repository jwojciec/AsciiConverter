package main.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.model.Model;
import main.viewer.Viewer;

public class Controller {
	Model model;
	Viewer viewer;

	public Controller(Model model, Viewer viewer) {
		this.model = model;
		this.viewer = viewer;
		viewer.createGUI();
	}

	public void startApplication() {

		ActionListener asciiActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent asciiAE) {
				try {
					model.convertASCII(viewer.getAsciiText());
					viewer.setBinaryext(model.getBin());
					viewer.setDecimalText(model.getDec());
					viewer.setHexaText(model.getHex());
				} catch (Exception asciiException) {
					viewer.displayErrorMsg("Error: " + asciiException.getMessage());
				}
			}
		};

		ActionListener binaryActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent binAE) {
				try {
					model.convertBIN(viewer.getBinaryText());
					viewer.setAsciiText(model.getAscii());
					viewer.setDecimalText(model.getDec());
					viewer.setHexaText(model.getHex());
				} catch (Exception binException) {
					viewer.displayErrorMsg("Error: " + binException.getMessage());
				}
			}
		};

		ActionListener decimalActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent decAE) {
				try {
					model.convertDEC(viewer.getDecimalText());
					viewer.setAsciiText(model.getAscii());
					viewer.setBinaryext(model.getBin());
					viewer.setHexaText(model.getHex());
				} catch (Exception decException) {
					viewer.displayErrorMsg("Error: " + decException.getMessage());
				}
			}
		};

		ActionListener hexaActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent hexAE) {
				try {
					model.convertHEX(viewer.getHexaText());
					viewer.setAsciiText(model.getAscii());
					viewer.setBinaryext(model.getBin());
					viewer.setDecimalText(model.getDec());
				} catch (Exception hexException) {
					viewer.displayErrorMsg("Error: " + hexException.getMessage());
				}
			}
		};

		viewer.addAsciiListener(asciiActionListener);
		viewer.addBinaryListener(binaryActionListener);
		viewer.addDecimalListener(decimalActionListener);
		viewer.addHexaListener(hexaActionListener);
	}

}
