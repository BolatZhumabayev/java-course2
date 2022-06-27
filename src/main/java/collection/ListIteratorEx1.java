package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx1 {
    public static void main(String[] args) {
        String s = "madam1";
        List<Character> list = new LinkedList<>();
        for(char ch : s.toCharArray()) {
            list.add(ch);
        }

        System.out.println(list);
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseiIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseiIterator.hasPrevious()) {
            if (iterator.next() != reverseiIterator.previous()) {
                isPalindrome = false;
                break;
            }

        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("NOT Palindrome");
        }

    }
}
