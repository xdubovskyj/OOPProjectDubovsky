
public class Buyer extends Actor{
	Bid bid;
	Buyer(){
		
	}
	private int MakeBid() {
		this.bid=new Bid();
		return bid;
	}
}

