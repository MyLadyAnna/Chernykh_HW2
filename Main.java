public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setMakeOrder();
        human.setTakeOrder();
        human.isMakeOrder();
        System.out.println(human.isMakeOrder());
        human.isTakeOrder();
        System.out.println(human.isTakeOrder());

        Market market = new Market();
        human.name = "Иван";
        market.acceptToMarket(human);
        market.takeQueue(human);
        market.giveOrders();
        market.takeOrders();
        //market.update();
        market.releaseFromQueue();
        market.releaseFromMarket(human); 
    }
}
