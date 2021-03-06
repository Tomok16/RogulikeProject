package MainPackage;

import java.awt.Color;

public class World {
	private Tile[][] tiles;
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	public World (Tile[][] tiles){
		this.tiles=tiles;
		this.width=tiles.length;
		this.height=tiles[0].length;
	}
	
	public Tile getTileDetails (int x, int y){
		if (x<0 || x>= width || y<0 || y>height){
			return Tile.BOUNDS;
		}
		else 
			return tiles[x][y];	
	}
	
	public char getGlyphDetails(int x, int y){
		return tiles[x][y].getGlyph();
	}
	
	public Color getColorDetails (int x, int y){
		return tiles[x][y].getColor();
	}
}
