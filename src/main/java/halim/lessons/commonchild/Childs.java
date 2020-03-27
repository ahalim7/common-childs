/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.commonchild;

/**
 *
 * @author AbdElHalim
 */
public class Childs {
    
    public static void main(String[] args) {
        int result = commonChild("ABCDEF", "FBDAMN");
        System.out.println(result);
    }
    
    // Complete the commonChild function below.
    static int commonChild(String s1, String s2) {
        int x = s1.length();
        int y = s2.length();
        int[][] l = new int[x+1][y+1];
        for (int i=1;i<=x;i++) {
            for (int j=1;j<=y;j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    l[i][j] = l[i-1][j-1] + 1;
                }
                else {
                    l[i][j] = Math.max(l[i-1][j], l[i][j-1]);
                }
            }
        }
        return l[x][y];
    }
}
