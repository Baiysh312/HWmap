import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Object[] arr= new Object[10];
        arr[0]= new String();
        ((String) arr[0] ).toUpperCase();

        Store<String,Integer> store= new Store<>("str",123);
        Person client = new Client("alex",34);
        Person client1 = new Client("mike",30);
        Person staff= new Staff("max",23);
        Person staff1= new Staff("david",40);
        Person critic = new Critic("foden",27);
        Person critic1 = new Critic("fil",29);

        Person [] people= new Person[]{client,client1};
        Person [] people1= new Person[]{staff,staff1};
        Person [] people2= new Person[]{critic,critic1};

        Theater<String , Person> theater= new Theater<>();
        theater.addArr("Client" ,people);
        theater.addArr("Staff",people1);
        theater.addArr("Critic",people2);

        theater.checkTickets();
    }
}