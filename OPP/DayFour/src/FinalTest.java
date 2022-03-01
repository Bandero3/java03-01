public class FinalTest {
    public static void main(String[] args) {
        String text = "w3resource";
        String output = "";
        for(int i=0; i< text.length(); i++){
            int j;
            for(j=0; j<i; j++){
                if(text.charAt(j) == text.charAt(i)){
                    break;
                }
            }
            if(j==i){
                output+=text.charAt(i);
            }
        }
        System.out.println(output);



    }
}
