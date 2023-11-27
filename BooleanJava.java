package gitChallenge31;

public class BooleanJava {

        public static void main(String[] args) {

            boolean passedDoor = true;
            boolean missedDoor = false;
            boolean passedAllDoors = false;
            int doorCount = 0;

            if(missedDoor) {
                System.out.println("We passed the 1st door!");
                doorCount = doorCount + 1;
            }

            if(passedDoor) {
                System.out.println("We passed the 2nd door!");
                doorCount = doorCount + 1;
            }

            if(passedDoor) {
                System.out.println("We passed the 3rd door!");
                doorCount = doorCount + 1;
            }

            if(doorCount == 3) {
                passedAllDoors = true;
            }

            if(passedAllDoors) {
                System.out.println("Congratualions you passed all doors, you won the program!");
            }

        }

}
