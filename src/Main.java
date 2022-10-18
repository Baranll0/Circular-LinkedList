public class Main {
    public static void main(String[] args) {
        CircularLinkedList circ = new CircularLinkedList();
        circ.Add(10);
        circ.Add(20);
        circ.List();
        circ.Sil(20);
        System.out.println("");
        circ.List();
        System.out.println("");
        if (circ.Search(10))
        {
            System.out.println("Bulundu");
        }
        else
        {
            System.out.println("Bulunamadi");
        }

    }
}