package gdstruct.module2.lists;

public class Main {

    public static void main(String[] args) {

        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon = new Player(2, "LethalBacon", 205);
        Player hpDeskJet = new Player(3, "HPDeskjet", 34 );
        Player lewilewi = new Player( 4, "LewiLewi", 47);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskJet);
        playerLinkedList.addToFront(lewilewi);

        playerLinkedList.printList();
        playerLinkedList.countList();

        playerLinkedList.removeFirstElement();

        playerLinkedList.printList();
        playerLinkedList.countList();

        playerLinkedList.contains("LethalBacon", 205, 2);

        playerLinkedList.indexOf(lethalBacon);

        // PART 1
        // Access an element
        // System.out.println(playerList.get(1));

       // playerList.add(2, new Player(553, "Arctis", 55));

      // playerList.remove(2);

        //System.out.println(playerList.contains(new Player(2, "LethalBacon", 205)));

      //  System.out.println(playerList.indexOf(new Player(2, "LethalBacon", 205)));

        // Java 8 forEach
        // playerList.forEach(player -> System.out.println(player));

//        for (Player p : playerList)
//      {
//           System.out.println(p);
//      }
   }
}
