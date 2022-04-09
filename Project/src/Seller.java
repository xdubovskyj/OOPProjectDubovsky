
public class Seller extends Actor{
	Bid bid;
	Seller(){
		
	}
	private int CreateBid() {
		this.bid=new Bid();
		return bid;
	}
}
