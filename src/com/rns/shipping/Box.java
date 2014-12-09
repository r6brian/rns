package com.rns.shipping;

public class Box {
	
	private int Height;
	private int Width;
	private int Length;
	
	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
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
	
	public Box(){
		this(20,12,23);
	}
	public Box(int w, int l, int h){
		Height = h;
		Width = w;
		Length = l;
	}

}
