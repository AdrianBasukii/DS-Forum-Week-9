import java.util.Hashtable;

public class ForumApp {
    public static void main(String[] args) throws Exception {
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>(13);

        int[] studentIDs = {197354863, 933185952, 132489973, 134152056, 216500306, 106500306};

        for (int id : studentIDs) {
            int key = id % 13; 
            ht.put(key, id);
        }

        System.out.println("Index\t|\t Student ID");
        for (int i = 0; i < 13; i++) {

            if(ht.get(i) == null){
                System.out.println(i + "\t|\t" + "-");
            }

            else{
                System.out.println(i + "\t|\t" + ht.get(i));
            }
            
        }

    }
}
