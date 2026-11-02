package Level1.Problems;

public class RemoveDuplicates {
    /* 
    1.  while (true) starts a new round of the game.
    2.  StringBuilder sb is a fresh empty tray where you put the blocks that survive this round.
    3.  found = false is a flag meaning “I haven’t popped anything yet this round”.
    4.  i is your finger pointing at the block you’re looking at.
    5.  j is a second finger that slides right while the next block is the same letter (ignoring big or small). It measures how long the group is.
    6.  len = j - i + 1 is the size of the group.
    7.  if (!found && len > 1) means “this is the first group of twins I’ve seen this round, so pop it”. If the size is odd, sb.append(str.charAt(i)) puts one block back on the tray.
    8.  else { sb.append(...) } means “leave this group alone and copy it onto the tray”. This covers single blocks, and also any later twin groups, which have to wait for the next round.
    9.  i = j + 1 moves your finger past the group to the next one.
    10. if (!found) break; ends the game if a whole round went by with nothing to pop.
    11. str = sb.toString() makes the tray the new row for the next round, and it prints it. */
    public static void main(String[] args) {
        String inputString = "Aaabcffcde";
        while (true) {
            StringBuilder sb = new StringBuilder();
            boolean found = false;
            int i =0, n = inputString.length();
            while (i<n) {
                int j =i;
                while (j+1<n && 
                    Character.toLowerCase(inputString.charAt(j+1))== Character.toLowerCase(inputString.charAt(i))
                ) {
                    j++;
                }
                int len = j-i+1;
                if(!found && len>1){
                    found = true;
                    if(len %2==1){
                        sb.append(inputString.charAt(i));
                    }
                }else{
                    sb.append(inputString,i,j+1);
                }
                i=j+1;
            }
            if(!found) break;

            inputString = sb.toString();
            System.out.println(inputString);
        }
    }
    
}
