import java.io.BufferedReader;
import java.io.InputStreamReader;



class Cricket {  //main class

    public static void main(String[] args)
    {
        System.out.println("Cricket Match is about to start between Team A and Team B");
        System.out.println("Enter the number of overs");

        BufferedReader obj = new BufferedReader (new InputStreamReader(System.in)); //Input
        int overs=0;
        int flag =0;
        try{
        overs= Integer.parseInt(obj.readLine());
        }
        catch(Exception e)
        {
            flag=1;
            System.out.println("Game abandoned due to wrong input");

        }
        if(flag==0)
        {
        Match game=new Match();
        game.setOvers(overs);
        game.play();
        }
    }

}
