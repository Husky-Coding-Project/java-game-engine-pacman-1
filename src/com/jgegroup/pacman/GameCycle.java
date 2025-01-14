package jgegroup.pacman;

import jgegroup.pacman.objects.Ghost;
import jgegroup.pacman.objects.Pacman;
import jgegroup.pacman.objects.Position;

import java.util.HashSet;

public class GameCycle {
    HashSet<Pacman> pacmen;
    HashSet<Ghost>  ghosts;
    public GameCycle(){}

    private void actualCycle(){
        // Todo: Add a method to get keypress for Pacman, and get the direction for Ghost
        // Then it will check to see if the move is valid, then will check collisions between other objects.
        for(Pacman _pacman: pacmen){
            mapCollision(_pacman.getPosition());
            for(Ghost _ghost : ghosts){
                _pacman.collisionCheck(_ghost);
            }
        }
        for(Ghost _ghost: ghosts){

            //TODO: do what we want the ghost do here
            //We can't put the logic in the inner loop, as multiple pacman will cause
            //multiple moves.
        }
    }

    private void mapCollision(Position pos){
        //TODO: add actual thing here
    }

}
