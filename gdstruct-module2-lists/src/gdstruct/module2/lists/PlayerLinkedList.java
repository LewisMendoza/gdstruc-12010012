package gdstruct.module2.lists;

public class PlayerLinkedList {
    private PlayerNode head;
    private PlayerNode prev;
    private int listCount = 0;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        listCount++;
    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.getPlayer().getName() + ", Level: " + current.getPlayer().getLevel() + ", ID: " + current.getPlayer().getId());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    public void removeFirstElement()
    {
       PlayerNode current = head;
       current = current.getNextPlayer();
       head = current;
       listCount--;
    }

    public void countList() {System.out.println("List Count: " + listCount);}

    public void contains(String name, int level, int id)
    {
        PlayerNode current = head;
        while (current != null)
        {
            if ((name == current.getPlayer().getName()) && (level == current.getPlayer().getLevel()) && (id == current.getPlayer().getId()))
            {
                System.out.println("true");
                return;
            }
            current = current.getNextPlayer();
        }
        System.out.println("false");
    }

    public void indexOf(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        PlayerNode current = head;
        int index = 0;
        System.out.print("Index of " + playerNode.getPlayer().getName() + ": ");
        while (current != null)
        {
            if (current.getPlayer().getName() == playerNode.getPlayer().getName())
            {
                System.out.print(index);
                return;
            }
            index++;
            current = current.getNextPlayer();
        }
        System.out.print("Object not found Index is null");
    }
}
