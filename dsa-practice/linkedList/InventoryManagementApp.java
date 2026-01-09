package linkedList;

class ItemNode {
    String itemName;
    int itemId;
    int quantity;
    double price;
    ItemNode next;

    ItemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryLinkedList {
    private ItemNode head;

    public void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);
        node.next = head;
        head = node;
    }

    public void addAtEnd(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);
        if (head == null) {
            head = node;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = node;
    }

    public void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos == 1 || head == null) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++)
            temp = temp.next;

        ItemNode node = new ItemNode(id, name, qty, price);
        node.next = temp.next;
        temp.next = node;
    }

    public void removeById(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public void updateQuantity(int id, int newQty) {
        ItemNode item = searchById(id);
        if (item != null)
            item.quantity = newQty;
    }

    public ItemNode searchById(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void searchByName(String name) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name))
                print(temp);
            temp = temp.next;
        }
    }

    public double calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        return total;
    }

    public void sortByName(boolean asc) {
        head = mergeSort(head, (a, b) ->
                asc ? a.itemName.compareToIgnoreCase(b.itemName)
                        : b.itemName.compareToIgnoreCase(a.itemName));
    }

    public void sortByPrice(boolean asc) {
        head = mergeSort(head, (a, b) ->
                asc ? Double.compare(a.price, b.price)
                        : Double.compare(b.price, a.price));
    }

    private ItemNode mergeSort(ItemNode h, java.util.Comparator<ItemNode> comp) {
        if (h == null || h.next == null) return h;

        ItemNode mid = getMiddle(h);
        ItemNode next = mid.next;
        mid.next = null;

        ItemNode left = mergeSort(h, comp);
        ItemNode right = mergeSort(next, comp);

        return merge(left, right, comp);
    }

    private ItemNode merge(ItemNode a, ItemNode b, java.util.Comparator<ItemNode> comp) {
        if (a == null) return b;
        if (b == null) return a;

        ItemNode result;
        if (comp.compare(a, b) <= 0) {
            result = a;
            result.next = merge(a.next, b, comp);
        } else {
            result = b;
            result.next = merge(a, b.next, comp);
        }
        return result;
    }
    private ItemNode getMiddle(ItemNode h) {
        ItemNode slow = h, fast = h.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void display() {
        ItemNode temp = head;
        while (temp != null) {
            print(temp);
            temp = temp.next;
        }
    }
    private void print(ItemNode i) {
        System.out.println(i.itemId + " | " + i.itemName + " | Qty: " + i.quantity + " | Price: " + i.price);
    }
}
public class InventoryManagementApp {
    public static void main(String[] args) {

        InventoryLinkedList inv = new InventoryLinkedList();

        inv.addAtEnd(101, "Mouse", 10, 500);
        inv.addAtEnd(102, "Keyboard", 5, 1500);
        inv.addAtBeginning(103, "Laptop", 2, 55000);
        inv.addAtPosition(2, 104, "Monitor", 3, 12000);

        System.out.println("Inventory:");
        inv.display();

        System.out.println("\nTotal Inventory Value: " + inv.calculateTotalValue());

        inv.updateQuantity(101, 20);

        System.out.println("\nSorted by Name (ASC):");
        inv.sortByName(true);
        inv.display();

        System.out.println("\nSorted by Price (DESC):");
        inv.sortByPrice(false);
        inv.display();
    }
}
