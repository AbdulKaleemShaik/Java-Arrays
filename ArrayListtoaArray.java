import java.util.ArrayList;
class Arraylisttoarray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);
        Integer[] ai = new Integer[al.size()];
        ai = al.toArray(ai);
        System.out.println(ai.length);
        for (Integer integer : ai) {
            System.out.println(integer);
        }

    }

}