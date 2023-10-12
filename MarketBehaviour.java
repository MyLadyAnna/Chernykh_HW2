//import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Human human);
    void releaseFromMarket (Human human); //(List<Human> humans);
    void update();

}