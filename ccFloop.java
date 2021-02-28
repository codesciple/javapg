public static boolean checkForJacket(String[] lst) {
        for (int i = 0; i < lst.length; i++) {
        System.out.println(lst[i]);
        if (lst[i] == "jacket") {
        return true;
        }
        }
        return false;
        }

public static void main(String[] args) {
        String[] suitcase = {"shirt", "jacket", "pants", "socks"};
        System.out.println(checkForJacket(suitcase));
        }