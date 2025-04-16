import java.util.ArrayList;
class Pharmacy
{
    int id;
    int price;
    int quantity;

    public Pharmacy(int id, int quantity, int price) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item id: " + id + ", Quantity: " + quantity + ", Price: " + price;
    }
}
public class PharmacyManagementSystem
{
    ArrayList<Pharmacy> inventory = new ArrayList<>();

    public void additem(int id, int quantity, int price)
    {
        Pharmacy item = new Pharmacy(id, quantity, price);
        inventory.add(item);
    }

    public void updateitem(int id, int quantity, int price)
    {
        for(Pharmacy item : inventory)
        {
            if(item.id == id)
            {
                item.quantity = quantity;
                item.price = price;
                break;
            }
        }
    }
    public void removeitem(int id)
    {
        inventory.removeIf(item -> item.id == id);
    }

    public void display() {
        for (Pharmacy item : inventory) {
            System.out.println(item);
        }
    }

    public Pharmacy SearchItemByID(int id)
    {
        for (Pharmacy item : inventory) {
            if(item.id == id)
            {
                System.out.println("\nItem found!\n");
                return item;
            }
        }
        return null;
    }
    public static void main(String ags[])
    {
        PharmacyManagementSystem pms = new PharmacyManagementSystem();
        pms.additem(101, 100, 5000);
        pms.additem(102, 500, 7000);
        pms.display();
        pms.SearchItemByID(101);
        pms.removeitem(101);
        System.out.println("\nAfter removing item number 101 : \n");
        pms.display();
    }
}
