import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour{
    
     List<Human> humans = new LinkedList<>();
    Queue<Human> humansQueue = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Human human) {
        System.out.println(human.getName() + " пришёл в магазин");
        humans.add(human);
    }

    @Override
    public void releaseFromMarket(Human human) {
        System.out.println(human.getName() + " ушёл из магазина");
        humans.remove(human);
    }

    @Override
    public void update() {
        giveOrders();
        takeOrders();
    }

    @Override
    public void takeQueue(Human human) {
        System.out.println(human.getName() + " встал в очередь");
        humansQueue.add(human);
    }

    @Override
    public void takeOrders() {
        System.out.println(humansQueue.peek().getName() + " забрал заказ");
        humansQueue.peek().isTakeOrder();
    }

    @Override
    public void giveOrders() {
         System.out.println(humansQueue.peek().getName() + " сделал заказ");
        humansQueue.peek().isMakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(humansQueue.peek().getName() + " вышел из очереди");
        humansQueue.poll();
    }
}