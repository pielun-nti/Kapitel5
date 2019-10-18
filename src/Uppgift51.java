/*
Exercise in java.
Created 2019-10-18
Programmer Pierre Lundström
*/
import java.util.*;
import javax.swing.*;

public class Uppgift51 {
    public static void main(String[] args) {
        int n;
        int k = 1;
        int amount = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("n?"));
        while(k <= n) {
            amount = amount + k;
            k = k + 1;
        }
        JOptionPane.showMessageDialog(null, "Amount is now " + amount);
    }
}