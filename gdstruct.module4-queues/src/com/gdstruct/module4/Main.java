package com.gdstruct.module4;

import java.lang.reflect.Array;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayQueue onlinePlayers = new ArrayQueue(18);
        ArrayQueue queue = new ArrayQueue(18);

        instantiatePlayers(onlinePlayers);

        int matches = 0;
        while (matches != 10)
        {
            System.out.println("Matchmaking...\n");
            // Instantiate players
            queuePlayers(queue, onlinePlayers);

            // If queue as reached 5 players, start and remove players from queue
            if (queue.size() >= 5)
            {
                System.out.println("Game Matchmaking complete... Starting Game\n");

                for (int i = 0; i < 5; i++)
                {
                    System.out.println("Removing player from queue: " + queue.peek());
                    onlinePlayers.add(queue.remove());
                }
                matches++;

                System.out.println("Matches complete: " + matches);
                System.out.println("Enter Any Key To Continue...");
                new java.util.Scanner(System.in).nextLine();
            }
        }

        if (matches == 10)
        {
            System.out.println("Finished 10 Matches");
        }
    }

    public static void queuePlayers(ArrayQueue queue, ArrayQueue onlinePlayers)
    {
        Random rand = new Random();
        int playersToQueue = rand.nextInt(7) + 1;
        System.out.println("Adding " + playersToQueue + " players to queue");

        for (int i = 0; i < playersToQueue; i++)
        {
            System.out.println("Adding player to queue: " + onlinePlayers.peek());
            queue.add(onlinePlayers.remove());
        }
    }

    public static void instantiatePlayers(ArrayQueue onlinePlayers)
    {
        onlinePlayers.add((new Player(1, "Bloodhound", 100)));
        onlinePlayers.add((new Player(2, "Gibraltar", 100)));
        onlinePlayers.add((new Player(3, "Lifeline", 100)));
        onlinePlayers.add((new Player(3, "Pathfinder", 100)));
        onlinePlayers.add((new Player(4, "Wraith", 100)));
        onlinePlayers.add((new Player(5, "Bangalore", 100)));
        onlinePlayers.add((new Player(6, "Caustic", 100)));
        onlinePlayers.add((new Player(7, "Mirage", 100)));
        onlinePlayers.add((new Player(8, "Octane", 100)));
        onlinePlayers.add((new Player(9, "Wattson", 100)));
        onlinePlayers.add((new Player(10, "Crypto", 100)));
        onlinePlayers.add((new Player(11, "Revenant", 100)));
        onlinePlayers.add((new Player(12, "Loba", 100)));
        onlinePlayers.add((new Player(13, "Rampart", 100)));
        onlinePlayers.add((new Player(14, "Horizon", 100)));
        onlinePlayers.add((new Player(15, "Fuse", 100)));
        onlinePlayers.add((new Player(16, "Valkyrie", 100)));
        onlinePlayers.add((new Player(17, "Seer", 100)));
    }
}
