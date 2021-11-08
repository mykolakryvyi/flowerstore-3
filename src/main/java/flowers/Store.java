package flowers;

import java.util.concurrent.ThreadLocalRandom;

public class Store {
    public FlowerBucket[] bucks = new FlowerBucket[3];

    public void search(int money){
        FlowerBucket first = new FlowerBucket();
        FlowerBucket second = new FlowerBucket();
        FlowerBucket third = new FlowerBucket();

        bucks[0] = first;
        bucks[1] = second;
        bucks[2] = third;

        first.setOpt_price(ThreadLocalRandom.current().nextDouble(0, 10));
        second.setOpt_price(ThreadLocalRandom.current().nextDouble(0, 10));
        third.setOpt_price(ThreadLocalRandom.current().nextDouble(0, 10));

        for(int i = 0; i < bucks.length; i++){
            if (bucks[i].getOpt_price() <= money){
                System.out.println(bucks[i]);
            }
        }

    }
    public static void main(String args[]){
        Store st = new Store();
        st.search(7);

    }
}
