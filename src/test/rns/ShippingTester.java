package test.rns;

import com.rns.shipping.Box;
import com.rns.shipping.Pallet;
import com.rns.shipping.ShippingContainer;

public class ShippingTester {
	
	public static final int METRIC_CONVERSION = 49;
	
	public static void main(String[] args) {
		Box abox = new Box();
		Pallet tp = new Pallet();
		ShippingContainer tc = new ShippingContainer();
		tp.FillPallet(abox, tc);
		tc.FillShippingContainer(abox, tp);
		System.out.println(tp.getBoxes());
		System.out.println(tc.getBoxes());

	}

}
