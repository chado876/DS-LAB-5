
public class Driver {
	
	public static void main(String args[]) {
		GiftList giftlist = new GiftList();
		GiftBasket giftbasket1 = new GiftBasket(1,"birthday",1000);
		GiftBasket giftbasket2 = new GiftBasket(2,"christmas",2000);
		GiftBasket giftbasket3 = new GiftBasket(3,"easter",1500);
		
		giftlist.addGiftBasketToEnd(giftbasket1);
		giftlist.addGiftBasketToEnd(giftbasket2);
		giftlist.addGiftBasketToEnd(giftbasket3);
		
		giftlist.showAllGiftBaskets();
	}
}
