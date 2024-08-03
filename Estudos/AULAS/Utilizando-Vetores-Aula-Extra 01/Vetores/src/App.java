public class App {
    public static void main(String[] args){
        final int tamanho = 5;
        
        int[] num={52,168,132,256,489};
        /*int[] num = new int[tamanho];
        

        num[0] = 12;
        num[1] = 112;
        num[2] = 142;
        num[3] = 123;
        num[4] = 54;*/


        //For normal com array
        /*for (int i = num.length-1; i >= 0; i--) {
            System.out.println(num[i]); 
        }*/
        
        //For para Trabalhar com array o for eart
        for(int n:num){
            System.out.println(n);
        }
    }
}
