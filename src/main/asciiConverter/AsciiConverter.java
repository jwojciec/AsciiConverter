package main.asciiConverter;

import java.awt.EventQueue;

import javax.swing.UIManager;

import main.viewer.Viewer;
import main.model.Model;
import main.controller.Controller;

public class AsciiConverter {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager
							.getSystemLookAndFeelClassName());
					Viewer theViewer = new Viewer();
					theViewer.setVisible(true);
					Model theModel = new Model();
					Controller theController = new Controller(theModel, theViewer);
					theController.startApplication();

				} catch (Exception e) {
					System.out.println("setLookAndFeel error: " + e);
				}
			}
		});
	}

}
