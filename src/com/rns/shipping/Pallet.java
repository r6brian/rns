package com.rns.shipping;

public class Pallet {
	public static final int METRIC_CONVERSION = 49;
	//Setting the standard pallet sizes
	private int Width = 48;
	private int Length = 40;
	private int boxes = 0;
	
	public int getBoxes() {
		return boxes;
	}
	public void setBoxes(int boxes) {
		this.boxes = boxes;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	
	public void FillPallet(Box box, ShippingContainer container){
		
		int b1 = (Width/(box.getWidth())) * (Length/(box.getLength()));
		int	b2 = (Width/(box.getLength()))* (Length/(box.getWidth()));
		//Using casts to truncate numbers is good practice, right?
		boxes = Math.max(b1, b2) * (int)((((int)container.getHeight()*METRIC_CONVERSION)-6) / box.getHeight());
	}
	
}
