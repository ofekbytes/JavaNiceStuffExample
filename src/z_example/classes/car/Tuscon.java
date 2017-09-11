package z_example.classes.car;

public abstract class Tuscon implements Car , Sedan , FourxFour  { 
//implements i30Interface ,SantaFeInterface {
	
	//public abstract static class t1 extends i30 {
	//	public abstract static class t2 extends Santa_Fe {
		
	
	public static void main(String [] Args) {
		
		Tuscon t = new Tuscon() {
		
		@Override
		public void park() {
			// TODOIT Auto-generated method stub			
		}

		@Override
		public void stop() {
			// TODOIT Auto-generated method stub
		}

		@Override
		public void drive() {
			// TODOIT Auto-generated method stub
		}

		@Override
		public void openTrunk() {
			// TODOIT Auto-generated method stub
		}

		@Override
		public void FourWeelDrive() {
			// TODOIT Auto-generated method stub
		}
		
		};
		
		t.openTrunk();
		t.FourWeelDrive();
		t.openTrunk();
	}
//}
//}
}

