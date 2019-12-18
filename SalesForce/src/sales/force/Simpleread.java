package sales.force;

import lib.Readata;

public class Simpleread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Readata ed =new Readata("E:\\Book1.xlsx");
		//System.out.println(ed.getdatarow(0, 3, 2 ));
		System.out.println(ed.getdatarow(0, 0, 0));

	}

}
