package com.rns.shipping;

public class ShippingContainer {
	public static final int METRIC_CONVERSION = 49;
	
	private float Width;
	private float Length;
	private float Height;
	private int boxes;
	//Getters and Setters
	public int getBoxes() {
		return boxes;
	}
	public void setBoxes(int boxes) {
		this.boxes = boxes;
	}
	public float getWidth() {
		return Width;
	}
	public void setWidth(float width) {
		Width = width;
	}
	public float getLength() {
		return Length;
	}
	public void setLength(float length) {
		Length = length;
	}
	public float getHeight() {
		return Height;
	}
	public void setHeight(float height) {
		Height = height;
	}
	public ShippingContainer(){
		this(6.3f, 2.6f, 2.3f);
	}
	
	public ShippingContainer(float width, float length, float height){
		Width = width;
		Length = length;
		Height = height;
	}
	public void FillShippingContainer(Box box, Pallet p){
		int L = (int) Length * METRIC_CONVERSION;
		int W = (int) Width * METRIC_CONVERSION;
		p.FillPallet(box, this);
		
		int b1 = (W/(p.getWidth())) * (L/(p.getLength()));
		int	b2 = (W/(p.getLength()))* (L/(p.getWidth()));
		boxes = Math.max(b1, b2) * p.getBoxes();
		
	}
	
}
