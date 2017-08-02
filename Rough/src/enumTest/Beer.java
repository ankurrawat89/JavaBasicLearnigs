package enumTest;
public enum Beer {
KF(100) {
	@Override
	void getName(Beer b) {
		System.out.println("KingFisher");
	}
},RC(90) {
	@Override
	void getName(Beer b) {
		System.out.println("RoyalChallange");
	}
},KO {
	@Override
	void getName(Beer b) {
		System.out.println("KiosOotalio");
		
	}
};
int price;
Beer(int price){
	this.price = price;
}
Beer(){
	this.price = 65;
}
public int getPrice(){
	return price;
}
abstract void getName(Beer b);
}
