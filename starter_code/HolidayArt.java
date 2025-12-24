/**
 * Holiday ASCII Art Generator
 * 
 * Your task: Create a festive Christmas tree using ASCII characters!
 * 
 * Basic tree structure:
 * * <- Star on top
 * *** <- Tree branches (odd numbers of *)
 * *****
 * *******
 * ||| <- Trunk
 */
public class HolidayArt {

    public static void main(String[] args) {
        // Parse command-line argument for tree height (default: 5)
        int height = 5;
        if (args.length > 0) {
            height = Integer.parseInt(args[0]);
        }

        // Print the tree
        printTree(height);
    }

    /**
     * Prints a Christmas tree with the given height.
     * 
     * @param height Number of branch levels (not including star and trunk)
     */
    public static void printTree(int height) {
        // Print the star on top (centered)
        int maxWidth = 2 * height - 1;
        int starSpaces = (maxWidth - 1) / 2;
        System.out.println(" ".repeat(starSpaces) + "*");
        
        // Print each level of branches
        for (int level = 1; level <= height; level++) {
            int stars = 2 * level - 1;
            int spaces = (maxWidth - stars) / 2;
            System.out.println(" ".repeat(spaces) + "*".repeat(stars));
        }
        
        // Print the trunk (centered)
        int trunkWidth = 3;
        int trunkSpaces = (maxWidth - trunkWidth) / 2;
        System.out.println(" ".repeat(trunkSpaces) + "|||");
    }
}
