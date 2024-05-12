class Generator {
    public static String nickname(String name) {
        // Cek panjang nama
        if (name.length() < 4) {
            return "Error: Name too short";
        }
        
        // Ambil 3 atau 4 huruf pertama sebagai nickname
        String nickname = name.substring(0, 4);
        
        // Jika huruf ke-3 adalah konsonan, ambil hanya 3 huruf pertama
        if (!"aeiou".contains(Character.toString(name.charAt(2)).toLowerCase())) {
            nickname = name.substring(0, 3);
        }
        
        return nickname;
    }

    public static void main(String[] args) {
        System.out.println(nickname("Robert"));    // "Rob"
        System.out.println(nickname("Kimberly"));  // "Kim"
        System.out.println(nickname("Samantha"));  // "Sam"
        System.out.println(nickname("Jeannie"));   // "Jean"
        System.out.println(nickname("Douglas"));   // "Doug"
        System.out.println(nickname("Gregory"));   // "Greg"
    }
}