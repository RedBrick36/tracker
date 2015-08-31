package org.redbrick.medright.tracker.app;

import org.redbrick.medright.tracker.domain.Treatment;

/**
 * @author RedBrick
 */
public class App {

	static String go = "go";

	public static void main(String[] args) {

		Treatment treatment1 = new Treatment(go);
		System.out.println(treatment1.getStateOfTheObject());

	}
}
