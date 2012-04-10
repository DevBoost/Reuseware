/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
package pizzashop;

public class PizzaShopSkeleton {
	public static void main(String[] args) {

		System.out.println("Starting: PizzaShopInit");

		System.out.println("Starting: TakeOrderInit");

		System.out.println("Executing: getClientAddress");
		getClientAddress : ;

		System.out.println("Executing: getProductDetails");
		getProductDetails : ;

		System.out.println("Executing: TakeOrderFinal");
		TakeOrderFinal : ;

		System.out.println("Starting: BakePizzaInit");

		System.out.println("Executing: PrepareDough");
		PrepareDough : ;

		System.out.println("Executing: PutStuffOnDough");
		PutStuffOnDough : ;

		System.out.println("Executing: Bake");
		Bake : ;

		System.out.println("Executing: BakePizzaFinal");
		BakePizzaFinal : ;

		System.out.println("Starting: DeliveryInit");

		System.out.println("Executing: DriveToClient");
		DriveToClient : ;

		System.out.println("Executing: ExchangeProductForMoney");
		ExchangeProductForMoney : ;

		System.out.println("Executing: DriveBack");
		DriveBack : ;

		System.out.println("Executing: ReportDeliveryResult");
		ReportDeliveryResult : ;

		System.out.println("Executing: DeliveryFinal");
		DeliveryFinal : ;

		System.out.println("Executing: PizzaShopFinal");
		PizzaShopFinal : ;

	}
}
