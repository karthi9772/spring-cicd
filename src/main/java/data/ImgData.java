package data;

import java.util.HashMap;

public class ImgData {

	public static HashMap<Integer,Img> db=new HashMap<>() {{
		put(1,new Img("mobile.jpg",73));
		put(2,new Img("watch.jpg",2));
		put(3,new Img("laptop.jpg",10));
		put(4,new Img("computer.jpg",8));
		}};	
		
		
}
