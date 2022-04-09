/**
 * 
 * @author dubov
 * class for auction management
 */
public class Auction {
	Electric electric;
	Bass bass;
	Acoustic acoustic;
	Seller seller;
	Buyer buyer;
	Auctioneer auctioneer;
	
	public void AddGuitar () {
		this.acoustic=new Acoustic();
		this.electric=new Electric();
		this.bass=new Bass();
	}
	public void CreateSeller() {
		this.seller=new Seller();
	}
	public void CreateBuyer() {
		this.buyer=new Buyer();
	}
	public void CreateAuctioneer() {
		this.auctioneer=new Auctioneer();
	}
	
	
}
